package cs4project;

public class MediumHero extends Hero {
    public MediumHero(String n, int m, int c, int a, int d, int x, int r) {
        super(n, m, c, a, d, x, r);
        maxHP = m;
        currentHP = c;
        def = d;
        atk = a;
        maxMana = x;
        currentMana = r;
        money = 0;
    }
}
