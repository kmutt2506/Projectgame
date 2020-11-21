package GamePlay;

import java.util.Random;
import java.util.Scanner;


public class Search {
    public String skill_1;
    public String skill_2;
    Random skill  = new Random();
    public int count1 = skill.nextInt(10);
    public int count2 = skill.nextInt(10);
    Scanner ans = new Scanner(System.in);
    public Search(){
        this.skill_1 = RandomSkill.values()[count1].toString();
        this.skill_2 = RandomSkill.values()[count2].toString();
    }
 
}
