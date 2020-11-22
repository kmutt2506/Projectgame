import GamePlay.*;
import Player.*;
import java.util.Scanner;
public class ProjectGame {
            
        public static void main(String[] args) {
            Scanner menu = new Scanner(System.in);
            int ans;
            int p1, p2;
            int currenthp1 = 100;
            int currenthp2 = 100;
            String name;
            Menu interf = new Menu();
            Stat hp = new Stat();
            Search skill = new Search();
            
            SkillPlayer1 skill_1 = new SkillPlayer1();
            SkillPlayer2 skill_2 = new SkillPlayer2();
            
            
                System.out.println("*********Menu*********");
                System.out.println("1.Play");
                System.out.println("2.Exit");
                System.out.print("Select : ");
              
                do {ans = menu.nextInt();
                    switch(ans){
                        case 1 :
                               do{
                                System.out.print("\nPlayer 1 {Hp : " + currenthp1 + "}\n" + interf.inMenu());
                                p1 = menu.nextInt();
                                System.out.println("\nPlayer 2 {Hp : " + currenthp2 +"}\n" + interf.inMenu());
                                p2 = menu.nextInt();
                                switch(p1){
                                    case 1 : currenthp2 = skill_1.AttackFormPlayer1();
                                         break;
                                    case 2 : currenthp2 = skill_1.SkillOutput1();
                                         break;
                                    case 3 : currenthp2 = skill_1.SkillOutput2();
                                        break;
                                    //case 4 : skill.Activate();
                                        //break;
                                }
                                switch(p2){
                                    case 1: currenthp1 = skill_2.AttackFormPlayer2();
                                        break;
                                    case 2 : currenthp1 = skill_2.SkillOutput1();
                                         break;
                                    case 3 : currenthp1 = skill_2.SkillOutput2();
                                        break;
                                    //case 4 : skill.Activate();
                                        //break;
                                }
                                System.out.println("Result Player 1 Hp : " + currenthp1 + "\n" + "       " + "Player 2 Hp : " + currenthp2);
                               }while(currenthp1 != 0 || currenthp2 !=0);
                               if(currenthp1==currenthp2){
                                   System.out.println("******DRAW!!!******");
                               }
                               else if(currenthp1 > currenthp2){
                                   System.out.println("Player 1 WIN!!! CONGRATS");
                               }else System.out.println("Player 2 WIN!!! CONGRATS");
                               System.out.println("Do you want to ");
                                
                    break;
                }
            }while(ans != 2);
            
        
    }
    }
