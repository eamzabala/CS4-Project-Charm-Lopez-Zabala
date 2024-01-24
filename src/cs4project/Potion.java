package cs4project;

public class Potion extends Item {
    protected int roundsActive, roundsLeft;
    
    public Potion(String n, int h, int a, int d, int m, int p, int r){
        super(n, h, a, d, m, p);
        roundsActive = r;
        roundsLeft = r;
    }
    
    public void decRounds() {
        roundsLeft--;
    }
    
    @Override 
    public void getStats(){
        System.out.printf("%d, %d", roundsActive, roundsLeft);
    }
}
