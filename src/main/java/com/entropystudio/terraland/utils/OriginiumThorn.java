package com.entropystudio.terraland.utils;

import com.entropystudio.terraland.registry.BlockHandler;
import javafx.util.Pair;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.entropystudio.terraland.TerraLand.LOGGER;

public class OriginiumThorn {
    public static void genThorns(Vector3d vector3d, World world){
        Vector3d center = vector3d;
        List<Pair<BlockPos, BlockPos>> thorns = new ArrayList<>();
        for(int i = 0; i < 10; i++){ //先。。。生成十根？可以修改
            double dxBottom = new Random().nextInt(20) - 10;
            double dzBottom = new Random().nextInt(20) - 10;
            double k = dzBottom / dxBottom;
            double l = Math.sqrt(dxBottom * dxBottom + dzBottom * dzBottom);
            double cos = dxBottom / l;
            double sin = dzBottom / l;
            Vector3d coreBottom = center.add(dxBottom, 0, dzBottom);
            double len = new Random().nextInt(20) + 65;
            double dyTop = new Random().nextInt((int) len - 25) + 25;
            double l2 = Math.sqrt(len * len - dyTop * dyTop);
            double dxTop = l2 * cos;
            double dzTop = l2 * sin;
            Vector3d coreTop = coreBottom.add(dxTop, dyTop, dzTop);
            // 尝试先生成源石刺的中心，然后让刺的生成方向尽可能远离底部中心；同时保证刺的长度不会太怪
            // 至于如何让倾斜度过大的刺不会太扁平，这需要计算锥截面的方程，当然也可以搞近似
            List<BlockPos> bottom = genBottom(coreBottom, world); //在该函数修改底面方程
            for(BlockPos pos1 : bottom) {
                Methods.line(pos1, vec3dToBlockPos(coreTop), BlockHandler.ORIGINIUM_CRYSTAL, world); //从底面每个点拉一条直线去顶点，AG妙啊
            }
            coreTop.add(-2, -2 * dyTop / dxTop, -2 * k); //生成源石核心，这里的计划是拉一条锥体中轴线，并且不到顶上因为可能会突出去（由方块大小为1导致）
            thorns.add(new Pair<>(vec3dToBlockPos(coreBottom), vec3dToBlockPos(coreTop)));          //而且由于后面生成的非核心可能会覆盖先生成的核心，所以保存核心的路径，之后再循环外生成
            LOGGER.info("Gen success");
        }
        for(Pair<BlockPos, BlockPos> thorn : thorns){
            Methods.line(thorn.getKey(), thorn.getValue(), BlockHandler.ORIGINIUM_CORE, world);
            LOGGER.info("Gen Core");
        }
    }

    static List<BlockPos> genBottom(BlockPos.Mutable point, World world){ //生成底部，参数数量和意义根据实际情况改
        List<BlockPos> bottom = new ArrayList<>();
        for (int i = -10; i < 10; i += 1) {
            for (int j = -10; j < 10; j += 1) {
                if (Math.abs((i * i + j * j)) < 100) {
                    //world.setBlockAndUpdate(point.move(i, 0, j), Blocks.MAGMA_BLOCK.defaultBlockState());
                    bottom.add(point.move(i, 0, j));
                }
            }
        }
        return bottom;
    }

    static List<BlockPos> genBottom(Vector3d point, World world){ //生成底部，参数数量和意义根据实际情况改
        List<BlockPos> bottom = new ArrayList<>();
        for (int i = -10; i < 10; i += 1) {
            for (int j = -10; j < 10; j += 1) {
                if (Math.abs((i * i + j * j)) < 100) {
                    world.setBlockAndUpdate(vec3dToBlockPos(point.add(i, 0, j)), Blocks.MAGMA_BLOCK.defaultBlockState());
                    bottom.add(vec3dToBlockPos(point.add(i, 0, j)));
                }
            }
        }
        return bottom;
    }

    static BlockPos vec3dToBlockPos(Vector3d vector3d){
        return new BlockPos(vector3d.x(), vector3d.y(), vector3d.z());
    }
}
