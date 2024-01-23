package cs4project;

public class PlayerAbility extends Skill {
    private int manaCost, numTargets;
    
    public PlayerAbility(String n, int d, int h, int a, int i, int m, int t) {
        super(n, d, h, a, i);
        manaCost = m;
        numTargets = t;
    }
    
}
