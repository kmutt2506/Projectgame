package GamePlay;

import Player.Stat;

public class Skill {

    private Stat stat;
    private int skillOutput = 0;

    /*public Skill() {
        stat = new Stat();
    }*/
    
    public int AttackFormPlayer1() {
        return stat.Attack() - stat.getHp2();
    }

    public int AttackFormPlayer2() {
        return stat.Attack() - stat.getHp1();
    }
    
    
    public int SkillOutput(){
        Search skill = new Search();
        
        switch(skill.skill_1){
            case "FireBall" :
                skillOutput = stat.FireBall() - stat.getHp1();
                break;
            case "ThunderBolt" :
                skillOutput = stat.ThunderBolt() - stat.getHp1();
                break;
            case "WindCutter" :
                skillOutput = stat.WindCutter() - stat.getHp1();
                break;
            case "WaterGun" :
                skillOutput = stat.WaterGun() - stat.getHp1();
                break;
            case "FrostBite" :
                skillOutput = stat.FrostBite() - stat.getHp1();
                break;
            case "LifeDrain" :
                skillOutput = stat.LifeDrain() - stat.getHp1();
                break;
            case "HolyLight" :
                skillOutput = stat.HolyLight() - stat.getHp1();
                break;
            case "HealingTouch" :
                skillOutput = stat.HealingTouch() + stat.getHp1();
                break;
            case "GreaterHeal" :
                skillOutput = stat.GreaterHeal() + stat.GreaterHeal();
                break;
            case "Recovery" :
                skillOutput = stat.Recovery() + stat.Recovery();
                break;
        }
        return skillOutput;
    }
}
