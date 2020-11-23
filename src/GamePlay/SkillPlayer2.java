package GamePlay;

import Player.Stat;

public class SkillPlayer2 {

    private Stat stat = new Stat();
    private int currenthp1 = stat.getHp1();
    private int currenthp2 = stat.getHp2();
    private Menu ski;

    public int AttackFormPlayer2() {
        currenthp1 -= stat.Attack();
        return currenthp1;
    }

    public int SkillOutput1() {
        ski = new Menu();

        switch (ski.skill_1) {
            case "FireBall":
                currenthp1 = currenthp1 - stat.FireBall();
                break;
            case "ThunderBolt":
                currenthp1 = currenthp1 - stat.ThunderBolt();
                break;
            case "WindCutter":
                currenthp1 = currenthp1 - stat.WindCutter();
                break;
            case "WaterGun":

                currenthp1 = currenthp1 - stat.WaterGun();

                break;

            case "FrostBite":

                currenthp1 = currenthp1 - stat.FrostBite();

                break;
            case "LifeDrain":

                currenthp1 = currenthp1 - stat.LifeDrain();

                break;
            case "HolyLight":

                currenthp1 = currenthp1 - stat.HolyLight();

                break;

        }
        return currenthp1;
    }

    public int SkillOutput2() {
        ski = new Menu();

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

        }
        return currenthp1;
    }
}
