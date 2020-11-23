package GamePlay;

import java.util.Random;
import java.util.Scanner;


public class RandomSkill {
    public String skill_1;
    public String skill_2;
    Random skill  = new Random();
    public int count1 = skill.nextInt(13);
    public int count2 = skill.nextInt(13);
    Scanner ans = new Scanner(System.in);
    public RandomSkill(){
        this.skill_1 = Skill_List.values()[count1].toString();
        this.skill_2 = Skill_List.values()[count2].toString();
    }
}
