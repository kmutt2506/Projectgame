import GamePlay.*;
import Player.*;
import java.util.Scanner;
public class ProjectGame {
            
        public static void main(String[] args) {
            Scanner menu = new Scanner(System.in);
            int ans;
            int p1, p2;
            String name;
            Menu interf = new Menu();
            Stat hp = new Stat();
            Search skill = new Search();
            
            Skill ski = new Skill();
            
            
                System.out.println("*********Menu*********");
                System.out.println("1.Play");
                System.out.println("2.Exit");
                System.out.print("Select : ");
              
                do {ans = menu.nextInt();
                    switch(ans){
                        case 1 :
                               do{
                                System.out.print("\nPlayer 1 {Hp : " + hp.getHp1() + "}\n" + interf.inMenu());
                                p1 = menu.nextInt();
                                System.out.println("\nPlayer 2 {Hp : " + hp.getHp2() +"}\n" + interf.inMenu());
                                p2 = menu.nextInt();
                                switch(p1){
                                    case 1 : ski.AttackFormPlayer2();
                                         break;
                                    case 2 : 
                                         break;
                                    case 3 :
                                        break;
                                    //case 4 : skill.Activate();
                                        //break;
                                }
                                switch(p2){
                                    case 1: 
                                        break;
                                    case 2 : 
                                         break;
                                    case 3 :
                                        break;
                                    //case 4 : skill.Activate();
                                        //break;
                                }
                                System.out.println("Result Player 1 Hp : " + hp.getHp1()+"\n" + "       " + "Player 2 Hp : " + hp.getHp2());
                               }while(hp.getHp1() != 0 || hp.getHp2() !=0);
                               if(hp.getHp1()==hp.getHp2()){
                                   System.out.println("******DRAW!!!******");
                               }
                               else if(hp.getHp1()>hp.getHp2()){
                                   System.out.println("Player 1 WIN!!! CONGRATS");
                               }else System.out.println("Player 2 WIN!!! CONGRATS");
                                
                    break;
                }
            }while(ans != 2);
            
        
    }
    }
