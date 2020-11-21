package GamePlay;

import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Search {
    public String skill_1;
    public String skill_2;
    public int selected;
    public  Random skill  = new Random();
    public int count = skill.nextInt(10);
    public Scanner ans = new Scanner(System.in);
    public Search(){
        this.skill_1 = RandomSkill.values()[count].toString();
        
    }
    public void Activate(){
        
        if(selected == 4){
            if(skill_1 != null && skill_2 == null){
                skill_2 = RandomSkill.values()[count].toString();
            }else if (skill_1 == null && skill_2 != null){
                skill_1 = RandomSkill.values()[count].toString();
            }else if(skill_1 == null && skill_2 == null){
                skill_1 = RandomSkill.values()[count].toString();
            }else if(skill_1 != null && skill_2 != null){
                System.out.println("Which skill do you want to change?(1/2)");
                count = ans.nextInt();
                if(count != 1 && count != 2){
                    System.out.println("You lost your new skill :D");
                }else if(count == 1){
                    skill_1 = RandomSkill.values()[count].toString();
                }else skill_2 = RandomSkill.values()[count].toString();                
            }
        }
}
    
}
