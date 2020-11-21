package Player;

public class Stat {

    int hp1;
    int hp2;

    public Stat() {
        this.hp1 = 100;
        this.hp2 = 100;
    }

    public int Attack1() {
        hp2 -= 10;
        return hp2;
    }

    public int Attack2() {
        hp1 -= 10;
        return hp1;
    }

    public int FireBall1() {
        hp2 -= 16;
        return hp2;
    }

    public int FireBall2() {
        hp1 -= 16;
        return hp1;
    }

    public int ThunderBolt1() {
        hp2 -= 17;
        return hp2;
    }

    public int ThunderBolt2() {
        hp1 -= 17;
        return hp1;
    }

    public int WindCutter1() {
        hp2 -= 8;
        return hp2;
    }

    public int WindCutter2() {
        hp1 -= 8;
        return hp1;
    }

    public int WaterGun1() {
        hp2 -= 12;
        return hp2;
    }

    public int WaterGun2() {
        hp1 -= 12;
        return hp1;
    }

    public int FrostBite1() {
        hp2 -= 15;
        return hp2;
    }

    public int FrostBite2() {
        hp1 -= 15;
        return hp1;
    }

    public int LifeDrain1() {
        hp2 -= 10;
        return hp2;
    }

    public int LifeDrain2() {
        hp1 -= 10;
        return hp1;
    }

    public int HolyLight1() {
        hp2 -= 3;
        return hp2;
    }

    public int HolyLight2() {
        hp1 -= 3;
        return hp1;
    }

    public int HealingTouch1() {
        hp1 += 10;
        return hp1;
    }

    public int HealingTouch2() {
        hp2 += 10;
        return hp2;
    }

    public int GreaterHeal1() {
        hp1 += 14;
        return hp1;
    }

    public int GreaterHeal2() {
        hp2 += 14;
        return hp2;
    }

    public int Recovery1() {
        hp1 += hp1 * 0.5;
        return hp1;
    }

    public int Recovery2() {
        hp2 += hp2 * 0.5;
        return hp2;
    }
}
