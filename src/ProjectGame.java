import GamePlay.*;
import Player.*;
import java.util.Scanner;
public class ProjectGame {
            
        public static void main(String[] args) {
            Scanner menu = new Scanner(System.in);
            int ans ;
            String name;
            Menu interf = new Menu();
            
            
                System.out.println("*********Menu*********");
                System.out.println("1.Play");
                System.out.println("2.Exit");
                

           

                do {ans = menu.nextInt();
                    switch(ans){
                        case 1 :System.out.print("Player 1 {Hp : " + "}\n" + interf.inMenu());
                            
                             System.out.println("Player 2 {Hp : }" +"}\n" + interf.inMenu());
                    break;
                }
            }while(ans != 2);
            
        
    }
    }
