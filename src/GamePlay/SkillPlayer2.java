package GamePlay;

import Player.Stat;

public class SkillPlayer2 {

    private Stat stat = new Stat();
    private int currenthp1 = stat.getHp1();
    public static RandomSkill ski = new RandomSkill();

    public int AttackFormPlayer2() {
        currenthp1 -= stat.Attack();
        return currenthp1;
    }

    public int SkillOutput1() {

        switch (ski.skill_1) {
            case "FireBall":
                currenthp1 -= stat.FireBall();
                break;
            case "ThunderBolt":
                currenthp1 -= stat.ThunderBolt();
                break;
            case "WindCutter":
                currenthp1 -= stat.WindCutter();
                break;
            case "WaterGun":
                currenthp1 -= stat.WaterGun();
                break;
            case "FrostBite":
                currenthp1 -= stat.FrostBite();
                break;
            case "LifeDrain":
                currenthp1 -= stat.LifeDrain();
                break;
            case "HolyLight":
                currenthp1 -= stat.HolyLight();
                break;
            case "Poison":
                currenthp1 -= stat.Poison();
                break;
            case "Slap":
                currenthp1 -= stat.Slap();
                break;
             case "SonicWave":
                currenthp1 -= stat.SonicWave();
                break;
             case "Bite":
                currenthp1 -= stat.Bite();
                break;
             case "DynamicPunch":
                currenthp1 -= stat.DynamicPunch();
                break;
             case "JumpKick":
                currenthp1 -= stat.JumpKick();
                break;
        }
        ski = new RandomSkill();
        return currenthp1;
    }

    public int SkillOutput2() {

        switch (ski.skill_2) {
            case "FireBall":
                currenthp1 -= stat.FireBall();
                break;
            case "ThunderBolt":
                currenthp1 -= stat.ThunderBolt();
                break;
            case "WindCutter":
                currenthp1 -= stat.WindCutter();
                break;
            case "WaterGun":
                currenthp1 -= stat.WaterGun();
                break;
            case "FrostBite":
                currenthp1 -= stat.FrostBite();
                break;
            case "LifeDrain":
                currenthp1 -= stat.LifeDrain();
                break;
            case "HolyLight":
                currenthp1 -= stat.HolyLight();
                break;
            case "Poison":
                currenthp1 -= stat.Poison();
                break;
            case "Slap":
                currenthp1 -= stat.Slap();
                break;
             case "SonicWave":
                currenthp1 -= stat.SonicWave();
                break;
             case "Bite":
                currenthp1 -= stat.Bite();
                break;
             case "DynamicPunch":
                currenthp1 -= stat.DynamicPunch();
                break;
             case "JumpKick":
                currenthp1 -= stat.JumpKick();
                break;
        }
        ski = new RandomSkill();
        return currenthp1;
    }

}
