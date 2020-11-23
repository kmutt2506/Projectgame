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
        dmg = 11;
        return dmg;
    }

    public int HolyLight() {
       dmg = 25;
        return dmg;
    }
    
    public int Poison() {
       dmg = 17;
        return dmg;
    }
    public int Slap() {
       dmg = 1;
        return dmg;
    }
    public int SonicWave() {
       dmg = 13;
        return dmg;
    }
    public int Bite() {
       dmg = 5;
        return dmg;
    }
    public int DynamicPunch() {
       dmg = 18;
        return dmg;
    }
     public int JumpKick() {
       dmg = 14;
        return dmg;
    }
}
