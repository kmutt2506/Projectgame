package GamePlay;


import GamePlay.*;


public class Menu {
        String menu;
        
        public String skill_1;
        public String skill_2;
        private Search skill;

    public Menu() {
        skill = new Search();
        this.skill_1 = skill.skill_1;
        this.skill_2 = skill.skill_2;
    }        
    public String inMenu(){
        //Search skill = new Search();
        
        menu = "1.Attack\n" 
        + "2.Skill 1 : " + skill_1 +"\n" 
        + "3.Skill 2 : " + skill_2 +"\n"
        + "Select : ";
        //+ "4.Search for skill\n";
     return menu;
    }

    /*public String skill1() {
        return skill.skill_1;
    }
    
    public String skill2() {
        return skill.skill_2;
    }*/
    
    
}
