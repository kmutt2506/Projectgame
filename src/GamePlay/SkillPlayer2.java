
package GamePlay;

import Player.Stat;

public class SkillPlayer2 {
    private Stat stat = new Stat();
    private int skillOutput = 0;

    /*public Skill() {
        stat = new Stat();
    }*/
    
    public int AttackFormPlayer2() {
        return  stat.getHp1() - stat.Attack();
    }
    
    
    public int SkillOutput1(){
        Search skill = new Search();
        
        switch(skill.skill_1){
            case "FireBall" :
                skillOutput = stat.getHp1() - stat.FireBall();
                break;
            case "ThunderBolt" :
                skillOutput = stat.getHp1() - stat.ThunderBolt();
                break;
            case "WindCutter" :
                skillOutput = stat.getHp1()  - stat.WindCutter();
                break;
            case "WaterGun" :
                skillOutput = stat.getHp1() - stat.WaterGun();
                break;
            case "FrostBite" :
                skillOutput = stat.getHp1() - stat.FrostBite();
                break;
            case "LifeDrain" :
                skillOutput = stat.getHp1() - stat.LifeDrain();
                break;
            case "HolyLight" :
                skillOutput = stat.getHp1() - stat.HolyLight(); 
                break;
            case "HealingTouch" :
                skillOutput = stat.getHp2() + stat.HealingTouch();
                break;
            case "GreaterHeal" :
                skillOutput = stat.getHp2()+ stat.GreaterHeal();
                break;
            case "Recovery" :
                skillOutput = stat.getHp2()+ stat.Recovery();
                break;
        }
        return skillOutput;
    }
    
    public int SkillOutput2(){
        Search skill = new Search();
        
        switch(skill.skill_2){
            case "FireBall" :
                skillOutput = stat.getHp1() - stat.FireBall();
                break;
            case "ThunderBolt" :
                skillOutput = stat.getHp1() - stat.ThunderBolt();
                break;
            case "WindCutter" :
                skillOutput = stat.getHp1()  - stat.WindCutter();
                break;
            case "WaterGun" :
                skillOutput = stat.getHp1() - stat.WaterGun();
                break;
            case "FrostBite" :
                skillOutput = stat.getHp1() - stat.FrostBite();
                break;
            case "LifeDrain" :
                skillOutput = stat.getHp1() - stat.LifeDrain();
                break;
            case "HolyLight" :
                skillOutput = stat.getHp1() - stat.HolyLight(); 
                break;
            case "HealingTouch" :
                skillOutput = stat.getHp2() + stat.HealingTouch();
                break;
            case "GreaterHeal" :
                skillOutput = stat.getHp2()+ stat.GreaterHeal();
                break;
            case "Recovery" :
                skillOutput = stat.getHp2()+ stat.Recovery();
                break;
        }
        return skillOutput;
    }
}
