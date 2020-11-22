package Player;

public class Stat {

    int hp1;
    int hp2;
    int dmg;
    int heal;

    public Stat() {
        this.hp1 = 100;
        this.hp2 = 100;
       
    }
    public int getHp1(){
        return hp1;
    }
     public int getHp2(){
        return hp2;
    }
    public int Attack() {
        dmg = 10;
        return dmg;
    }
    public int FireBall() {
        dmg = 16;
        return dmg;
    }
    public int ThunderBolt() {
       dmg = 20;
        return dmg;
    }
    public int WindCutter() {
        dmg = 8;
        return dmg;
    }

    public int WaterGun() {
        dmg = 12;
        return dmg;
    }

    public int FrostBite() {
        dmg = 7;
        return dmg;
    }

    public int LifeDrain() {
        dmg = 10;
        return dmg;
    }

    public int HolyLight() {
       dmg = 25;
        return dmg;
    }

    public int HealingTouch() {
        heal = 10;
        return heal;
    }

    public int GreaterHeal() {
        heal = 14;
        return heal;
    }

    public int Recovery() {
        heal = 18;
        return heal;
    }

}
