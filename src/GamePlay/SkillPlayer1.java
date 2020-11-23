package GamePlay;

import Player.Stat;

public class SkillPlayer1 {

    private Stat stat = new Stat();
    private int currenthp2 = stat.getHp2();
    public static RandomSkill ski = new RandomSkill();

    public int AttackFormPlayer1() {
        currenthp2 -= stat.Attack();
        return currenthp2;
    }

    public int SkillOutput1() {

        switch (ski.skill_1) {
            case "FireBall":
                currenthp2 -= stat.FireBall();
                break;
            case "ThunderBolt":
                currenthp2 -= stat.ThunderBolt();
                break;
            case "WindCutter":
                currenthp2 -= stat.WindCutter();
                break;
            case "WaterGun":
                currenthp2 -= stat.WaterGun();
                break;
            case "FrostBite":
                currenthp2 -= stat.FrostBite();
                break;
            case "LifeDrain":
                currenthp2 -= stat.LifeDrain();
                break;
            case "HolyLight":
                currenthp2 -= stat.HolyLight();
                break;
            case "Poison":
                currenthp2 -= stat.Poison();
                break;
            case "Slap":
                currenthp2 -= stat.Slap();
                break;
            case "SonicWave":
                currenthp2 -= stat.SonicWave();
                break;
            case "Bite":
                currenthp2 -= stat.Bite();
                break;
            case "DynamicPunch":
                currenthp2 -= stat.DynamicPunch();
                break;
            case "JumpKick":
                currenthp2 -= stat.JumpKick();
                break;
        }
        ski = new RandomSkill();
        return currenthp2;
    }

    public int SkillOutput2() {

        switch (ski.skill_2) {
            case "FireBall":
                currenthp2 -= stat.FireBall();
                break;
            case "ThunderBolt":
                currenthp2 -= stat.ThunderBolt();
                break;
            case "WindCutter":
                currenthp2 -= stat.WindCutter();
                break;
            case "WaterGun":
                currenthp2 -= stat.WaterGun();
                break;
            case "FrostBite":
                currenthp2 -= stat.FrostBite();
                break;
            case "LifeDrain":
                currenthp2 -= stat.LifeDrain();
                break;
            case "HolyLight":
                currenthp2 -= stat.HolyLight();
                break;
            case "Poison":
                currenthp2 -= stat.Poison();
                break;
            case "Slap":
                currenthp2 -= stat.Slap();
                break;
            case "SonicWave":
                currenthp2 -= stat.SonicWave();
                break;
            case "Bite":
                currenthp2 -= stat.Bite();
                break;
            case "DynamicPunch":
                currenthp2 -= stat.DynamicPunch();
                break;
            case "JumpKick":
                currenthp2 -= stat.JumpKick();
                break;
        }
        ski = new RandomSkill();
        return currenthp2;
    }
}
