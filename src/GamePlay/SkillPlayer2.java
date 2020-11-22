
package GamePlay;

import Player.Stat;

public class SkillPlayer2 {
    private Stat stat = new Stat();
    private int skillOutput = 0;
    private int currenthp1=stat.getHp1();
    private int currenthp2 = stat.getHp2();
    private Menu ski;

    public int AttackFormPlayer2() {
        currenthp1 -= stat.Attack();
        return  currenthp1;
    }
    
    
    public int SkillOutput1(){
        ski = new Menu();
        
        switch(ski.skill_1){
            case "FireBall" :
                if(currenthp1 <= 16){
                    skillOutput = 0;
                }else{
                    skillOutput = stat.getHp1() - stat.FireBall();
                }
                break;
            case "ThunderBolt" :
                if(currenthp1 <= 20){
                    skillOutput = 0;
                }else{
                    skillOutput = stat.getHp1() - stat.ThunderBolt();
                }
                break;
            case "WindCutter" :
                if(currenthp1 <= 8){
                    skillOutput = 0;
                }else{
                    skillOutput = stat.getHp1()  - stat.WindCutter();
                }
                break;
            case "WaterGun" :
                if(currenthp1 <= 12){
                    skillOutput = 0;
                }else{
                    skillOutput = stat.getHp1() - stat.WaterGun();
                }
                break;
                
            case "FrostBite" :
                if(currenthp1 <= 7){
                    skillOutput = 0;
                }else{
                    skillOutput = stat.getHp1() - stat.FrostBite();
                }
                break;
            case "LifeDrain" :
                if(currenthp1 <= 10){
                    skillOutput = 0;
                }else{
                    skillOutput = stat.getHp1() - stat.LifeDrain();
                }
                break;
            case "HolyLight" :
                if(currenthp1 <= 25){
                    skillOutput = 0;
                }else{
                    skillOutput = stat.getHp1() - stat.HolyLight();
                }
                break;
            case "HealingTouch" :
                if(currenthp2 >= 90){
                    skillOutput = stat.getHp2();
                }else{
                    skillOutput = stat.getHp2() + stat.HealingTouch();
                }
                break;
                
            case "GreaterHeal" :
                if(currenthp2 >= 86){
                    skillOutput = stat.getHp2();
                }else{
                    skillOutput = stat.getHp2()+ stat.GreaterHeal();
                }
                break;
            case "Recovery" :
                if(currenthp2 >= 82){
                    skillOutput = stat.getHp2();
                }else{
                    skillOutput = stat.getHp2()+ stat.Recovery();
                }
                break;
        }
        return skillOutput;
    }
    
    public int SkillOutput2(){
        ski = new Menu();
        
        switch(ski.skill_2){
            case "FireBall" :
                if(currenthp1 <= 16){
                    skillOutput = 0;
                }else{
                    skillOutput = stat.getHp1() - stat.FireBall();
                }
                break;
            case "ThunderBolt" :
                if(currenthp1 <= 20){
                    skillOutput = 0;
                }else{
                    skillOutput = stat.getHp1() - stat.ThunderBolt();
                }
                break;
            case "WindCutter" :
                if(currenthp1 <= 8){
                    skillOutput = 0;
                }else{
                    skillOutput = stat.getHp1()  - stat.WindCutter();
                }
                break;
            case "WaterGun" :
                if(currenthp1 <= 12){
                    skillOutput = 0;
                }else{
                    skillOutput = stat.getHp1() - stat.WaterGun();
                }
                break;
                
            case "FrostBite" :
                if(currenthp1 <= 7){
                    skillOutput = 0;
                }else{
                    skillOutput = stat.getHp1() - stat.FrostBite();
                }
                break;
            case "LifeDrain" :
                if(currenthp1 <= 10){
                    skillOutput = 0;
                }else{
                    skillOutput = stat.getHp1() - stat.LifeDrain();
                }
                break;
            case "HolyLight" :
                if(currenthp1 <= 25){
                    skillOutput = 0;
                }else{
                    skillOutput = stat.getHp1() - stat.HolyLight();
                }
                break;
            case "HealingTouch" :
                if(currenthp2 >= 90){
                    skillOutput = stat.getHp2();
                }else{
                    skillOutput = stat.getHp2() + stat.HealingTouch();
                }
                break;
                
            case "GreaterHeal" :
                if(currenthp2 >= 86){
                    skillOutput = stat.getHp2();
                }else{
                    skillOutput = stat.getHp2()+ stat.GreaterHeal();
                }
                break;
            case "Recovery" :
                if(currenthp2 >= 82){
                    skillOutput = stat.getHp2();
                }else{
                    skillOutput = stat.getHp2()+ stat.Recovery();
                }
                break;
        }
        return skillOutput;
    }
}
