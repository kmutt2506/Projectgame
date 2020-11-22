package GamePlay;

import Player.Stat;

public class SkillPlayer1 {

    private Stat stat = new Stat();
    private int skillOutput = 0;
    private int currenthp2 = stat.getHp2();
    private int currenthp1 = stat.getHp1();
    private Menu ski;

    public int AttackFormPlayer1() {
        currenthp2 -= stat.Attack();
        return  currenthp2;
    }

    
    public int SkillOutput1(){
        ski = new Menu();
        
        switch(ski.skill_1){
            case "FireBall" :
                if(currenthp2 <= 16){
                    skillOutput = 0;
                }else{
                    skillOutput = stat.getHp2() - stat.FireBall();
                }
                break;
            case "ThunderBolt" :if(currenthp2 <= 20){
                    skillOutput = 0;
                }else{
                    skillOutput = stat.getHp2() - stat.ThunderBolt();
                }
                break;
            case "WindCutter" :
                if(currenthp2 <= 8){
                    skillOutput = 0;
                }else{
                    skillOutput = stat.getHp2()  - stat.WindCutter();
                }
                break;
            case "WaterGun" :
                if(currenthp2 <= 12){
                    skillOutput = 0;
                }else{
                    skillOutput = stat.getHp2() - stat.WaterGun();
                }
                break;
                
            case "FrostBite" :
                if(currenthp2 <= 7){
                    skillOutput = 0;
                }else{
                    skillOutput = stat.getHp2() - stat.FrostBite();
                }
                break;
            case "LifeDrain" :
                if(currenthp2 <= 10){
                    skillOutput = 0;
                }else{
                    skillOutput = stat.getHp2() - stat.LifeDrain();
                }
                break;
            case "HolyLight" :
                if(currenthp2 <= 25){
                    skillOutput = 0;
                }else{
                    skillOutput = stat.getHp2() - stat.HolyLight();
                }
                break;
            case "HealingTouch" :
                if(currenthp1 >= 90){
                    skillOutput = stat.getHp1();
                }else{
                    skillOutput = stat.getHp1() + stat.HealingTouch();
                }
                break;
                
            case "GreaterHeal" :
                if(currenthp1 >= 86){
                    skillOutput = stat.getHp1();
                }else{
                    skillOutput = stat.getHp1()+ stat.GreaterHeal();
                }
                break;
            case "Recovery" :
                if(currenthp1 >= 82){
                    skillOutput = stat.getHp1();
                }else{
                    skillOutput = stat.getHp1()+ stat.Recovery();
                }
                break;
        }
        return skillOutput;
    }
    
    public int SkillOutput2(){
        ski = new Menu();
        
        switch(ski.skill_2){
            case "FireBall" :
                if(currenthp2 <= 16){
                    skillOutput = 0;
                }else{
                    skillOutput = stat.getHp2() - stat.FireBall();
                }
                break;
            case "ThunderBolt" :if(currenthp2 <= 20){
                    skillOutput = 0;
                }else{
                    skillOutput = stat.getHp2() - stat.ThunderBolt();
                }
                break;
            case "WindCutter" :
                if(currenthp2 <= 8){
                    skillOutput = 0;
                }else{
                    skillOutput = stat.getHp2()  - stat.WindCutter();
                }
                break;
            case "WaterGun" :
                if(currenthp2 <= 12){
                    skillOutput = 0;
                }else{
                    skillOutput = stat.getHp2() - stat.WaterGun();
                }
                break;
                
            case "FrostBite" :
                if(currenthp2 <= 7){
                    skillOutput = 0;
                }else{
                    skillOutput = stat.getHp2() - stat.FrostBite();
                }
                break;
            case "LifeDrain" :
                if(currenthp2 <= 10){
                    skillOutput = 0;
                }else{
                    skillOutput = stat.getHp2() - stat.LifeDrain();
                }
                break;
            case "HolyLight" :
                if(currenthp2 <= 25){
                    skillOutput = 0;
                }else{
                    skillOutput = stat.getHp2() - stat.HolyLight();
                }
                break;
            case "HealingTouch" :
                if(currenthp1 >= 90){
                    skillOutput = stat.getHp1();
                }else{
                    skillOutput = stat.getHp1() + stat.HealingTouch();
                }
                break;
                
            case "GreaterHeal" :
                if(currenthp1 >= 86){
                    skillOutput = stat.getHp1();
                }else{
                    skillOutput = stat.getHp1()+ stat.GreaterHeal();
                }
                break;
            case "Recovery" :
                if(currenthp1 >= 82){
                    skillOutput = stat.getHp1();
                }else{
                    skillOutput = stat.getHp1()+ stat.Recovery();
                }
                break;
        }
        return skillOutput;
    }
}
