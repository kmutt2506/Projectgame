package GamePlay;

import java.util.Random;
import java.util.Scanner;


public class Search {
    public String skill_1;
    public String skill_2;
    public int selected;
    public  Random skill  = new Random();
    public int count1 = skill.nextInt(10);
    public int count2 = skill.nextInt(10);
    public Scanner ans = new Scanner(System.in);
    public Search(){
        this.skill_1 = RandomSkill.values()[count1].toString();
        
    }
    public void Activate(){
        
        if(selected == 4){
            if(skill_1 != null && skill_2 == null){
                skill_2 = RandomSkill.values()[count2].toString();
            }else if (skill_1 == null && skill_2 != null){
                skill_1 = RandomSkill.values()[count1].toString();
            }else if(skill_1 == null && skill_2 == null){
                skill_1 = RandomSkill.values()[count1].toString();
            }else if(skill_1 != null && skill_2 != null){
                System.out.println("Which skill do you want to change?(1/2)");
                count1 = ans.nextInt();
                if(count1 != 1 && count1 != 2){
                    System.out.println("You lost your new skill :D");
                }else if(count1 == 1){
                    skill_1 = RandomSkill.values()[count1].toString();
                }else skill_2 = RandomSkill.values()[count2].toString();                
            }
        }
}
    public static void main(String[] args) {
        Search n = new Search();
        
        System.out.println("Skill:" + n.skill_1 + ", " + n.skill_2);
        n.Activate();
        System.out.println("Skill:" + n.skill_1 + ", " + n.skill_2);
       
    }
    
}
