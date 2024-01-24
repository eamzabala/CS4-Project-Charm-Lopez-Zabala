package cs4project;

public class LightHero extends Hero {
    public LightHero(String n, int m, int c, int a, int d, int x, int r) {
        super(n, m, a, d, x);
        maxHP = (int) Math.round(m * 0.8);
        currentHP = maxHP;
        def = (int) Math.round(d * 0.8);
        atk = (int) Math.round(a *0.8);
        maxMana = (int) Math.round(x *0.8);
        currentMana = maxMana;
    }
}
