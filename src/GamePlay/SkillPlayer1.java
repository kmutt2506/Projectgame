package GamePlay;

import Player.Stat;

public class SkillPlayer1 {

    private Stat stat = new Stat();
    private int skillOutput = 0;
    private int currenthp2 = stat.getHp2();

    /*public SkillPlayer1() {
        stat = new Stat();
    }*/
    
    public int AttackFormPlayer1() {
        currenthp2 -= stat.Attack();
        return  currenthp2;
    }

    
    public int SkillOutput1(){
        Search skill = new Search();
        
        switch(skill.skill_1){
            case "FireBall" :
                skillOutput = stat.getHp2() - stat.FireBall();
                break;
            case "ThunderBolt" :
                skillOutput = stat.getHp2() - stat.ThunderBolt();
                break;
            case "WindCutter" :
                skillOutput = stat.getHp2()  - stat.WindCutter();
                break;
            case "WaterGun" :
                skillOutput = stat.getHp2() - stat.WaterGun();
                break;
            case "FrostBite" :
                skillOutput = stat.getHp2() - stat.FrostBite();
                break;
            case "LifeDrain" :
                skillOutput = stat.getHp2() - stat.LifeDrain();
                break;
            case "HolyLight" :
                skillOutput = stat.getHp2() - stat.HolyLight(); 
                break;
            case "HealingTouch" :
                skillOutput = stat.getHp1() + stat.HealingTouch();
                break;
            case "GreaterHeal" :
                skillOutput = stat.getHp1()+ stat.GreaterHeal();
                break;
            case "Recovery" :
                skillOutput = stat.getHp1()+ stat.Recovery();
                break;
        }
        return skillOutput;
    }
    
    public int SkillOutput2(){
        Search skill = new Search();
        
        switch(skill.skill_2){
            case "FireBall" :
                skillOutput = stat.getHp2() - stat.FireBall();
                break;
            case "ThunderBolt" :
                skillOutput = stat.getHp2() - stat.ThunderBolt();
                break;
            case "WindCutter" :
                skillOutput = stat.getHp2()  - stat.WindCutter();
                break;
            case "WaterGun" :
                skillOutput = stat.getHp2() - stat.WaterGun();
                break;
            case "FrostBite" :
                skillOutput = stat.getHp2() - stat.FrostBite();
                break;
            case "LifeDrain" :
                skillOutput = stat.getHp2() - stat.LifeDrain();
                break;
            case "HolyLight" :
                skillOutput = stat.getHp2() - stat.HolyLight(); 
                break;
            case "HealingTouch" :
                skillOutput = stat.getHp1() + stat.HealingTouch();
                break;
            case "GreaterHeal" :
                skillOutput = stat.getHp1()+ stat.GreaterHeal();
                break;
            case "Recovery" :
                skillOutput = stat.getHp1()+ stat.Recovery();
                break;
        }
        return skillOutput;
    }
}
