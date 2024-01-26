package cs4project;

public class MediumHero extends Hero {
    public MediumHero(String n, int m, int a, int d, int x) {                   // hero w no multipliers
        super(n, m, a, d, x);
        maxHP = m;
        currentHP = maxHP;
        def = d;
        atk = a;
        maxMana = x;
        currentMana = maxMana;
        money = 0;
    }
}
