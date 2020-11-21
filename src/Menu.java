
import GamePlay.*;


public class Menu {
        String menu;
    public String inMenu(){
        Search skill = new Search();
        
        menu = "1.Attack\n" 
        + "2.Skill 1 :" + skill.skill_1 +"\n" 
        + "3.Skill 2 :" + skill.skill_2 +"\n"
        + "4.Search for skill\n";
     return menu;
    }
 
}
