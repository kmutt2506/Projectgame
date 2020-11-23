
import GamePlay.*;
import Player.*;
import java.util.Scanner;

public class ProjectGame {

    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        Stat hp = new Stat();
        SkillPlayer1 skill01 = new SkillPlayer1();
        SkillPlayer2 skill02 = new SkillPlayer2();
        int ans;
        int p1, p2;
        int currenthp1 = hp.getHp1();
        int currenthp2 = hp.getHp2();

        System.out.println(" ︻︻︻︻︻︻︻︻︻︻︻︻︻\n"
                         + " |      - Menu -     |\n"
                         + " |  1.Play           |\n"
                         + " |  2.Exit           |\n"
                         + " ︼︼︼︼︼︼︼︼︼︼︼︼︼");
        System.out.print(" Select : ");
        ans = menu.nextInt();

        switch (ans) {
            case 1:
                do {
                    System.out.print("✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦\n"
                            +"\nPlayer 1 {Hp : " + currenthp1 + "}\n" + "1.Attack\n"
                            + "2.First Skill : " + SkillPlayer1.ski.skill_1  + "\n"
                            + "3.Second Skill : " + SkillPlayer1.ski.skill_2 + "\n"
                            + "Select : ");
                    p1 = menu.nextInt();
                    System.out.println("\n✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦");
                    System.out.print("\nPlayer 2 {Hp : " + currenthp2 + "}\n" + "1.Attack\n"
                            + "2.First Skill : " + SkillPlayer2.ski.skill_1 + "\n"
                            + "3.Second Skill : " + SkillPlayer2.ski.skill_2 + "\n"
                            + "Select : ");
                    p2 = menu.nextInt();
                    System.out.println("\n✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦✦");
                    switch (p1) {
                        case 1:
                            currenthp2 = skill01.AttackFormPlayer1();
                            break;

                        case 2:
                            currenthp2 = skill01.SkillOutput1();

                            break;

                        case 3:
                            currenthp2 = skill01.SkillOutput2();
                            break;
                    }
                    switch (p2) {
                        case 1:
                            currenthp1 = skill02.AttackFormPlayer2();
                            break;

                        case 2:
                            currenthp1 = skill02.SkillOutput1();

                            break;

                        case 3:
                            currenthp1 = skill02.SkillOutput2();

                            break;

                    }

                    if (currenthp1 <= 0) {
                        currenthp1 = 0;
                    }
                    if (currenthp2 <= 0) {
                        currenthp2 = 0;
                    }
                    System.out.println("Result Player 1 Hp : " + currenthp1 + "\n" 
                                + "       " + "Player 2 Hp : " + currenthp2);
                } while (currenthp1 != 0 && currenthp2 != 0);
                if (currenthp1 == currenthp2) {
                    System.out.println("******DRAW!!!******\n");
                } else if (currenthp1 > currenthp2) {
                    System.out.println("Player 1 WIN!!! CONGRATS\n");
                } else {
                    System.out.println("Player 2 WIN!!! CONGRATS\n");
                }
                break;

        }

    }
}
