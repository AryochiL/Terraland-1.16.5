package com.entropystudio.terraland;

public class Skill {
    public final int spCost;
    public final int spInit;
    public final int maxSkillTime;
    public final SkillRecoverType type;
    public Skill(int spInit, int spCost, int maxSkillTime, SkillRecoverType type){
        this.spInit = spInit;
        this.spCost = spCost;
        this.maxSkillTime = maxSkillTime;
        this.type = type;
    }

    public enum SkillRecoverType{
        ATTACKRECOVER,
        AUTORECOVER;
    }

    private enum SkillStartType{
        AUTO,
        CONTROL;
    }
}
