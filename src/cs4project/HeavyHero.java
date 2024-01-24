package cs4project;

public class HeavyHero extends Hero {
    public HeavyHero(String n, int m, int c, int a, int d, int x, int r) {
        super(n, m, a, d, x);
        maxHP = (int) Math.round(m * 1.2);
        currentHP = maxHP;
        def = (int) Math.round(d * 1.2);
        atk = (int) Math.round(a * 1.2);
        maxMana = (int) Math.round(x * 1.2);
        currentMana = maxMana;
    }
}
