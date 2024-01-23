package cs4project;

public class Potion extends Item {
    protected int roundsActive, roundsLeft;
    
    public Potion(String n, int h, int a, int d, int m, int p, int r){
        super(n, h, a, d, m, p);
        roundsActive = r;
        roundsLeft = r;
    }
}
