package GamePlay;

import Player.Stat;

public class SkillPlayer1 {

    private Stat stat = new Stat();
    private int currenthp2 = stat.getHp2();
    private int currenthp1 = stat.getHp1();
    private Menu ski;

    public int AttackFormPlayer1() {
        currenthp2 -= stat.Attack();
        return currenthp2;
    }

    public int SkillOutput1() {
        ski = new Menu();

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
        }
        return currenthp2;
    }

    public int SkillOutput2() {
        ski = new Menu();

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
        }
        return currenthp2;
    }
}
