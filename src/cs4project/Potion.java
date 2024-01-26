package cs4project;

public class Potion extends Item {
    protected int roundsActive, roundsLeft;
    
    public Potion(String n, int h, int a, int d, int m, int p, int r){
        super(n, h, a, d, m, p);
        roundsActive = r;
        roundsLeft = r;
    }
    
    public void decRounds(Hero n) {                                             // called after every round
        roundsLeft--;
        if(roundsLeft == 0) {
            n.getActivePotions().remove(this);
            roundsLeft = roundsActive;
        }
    }
    
    @Override 
    public void getStats(){                                                     // also displays the rounds it can be active for, and rounds left
        System.out.printf("%d, %d", roundsActive, roundsLeft);
    }
}
