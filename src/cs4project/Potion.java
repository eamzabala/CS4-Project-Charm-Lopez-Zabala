package cs4project;

public class Potion extends Item {
    private int roundsActive, roundsLeft;
    
    public Potion(String n, int h, int a, int d, int m, int p, int r){
        super(n, h, a, d, m, p);
        roundsActive = r;
        roundsLeft = r;
    }
    
    public int getRoundsActive() {
        return roundsActive;
    }
    public void setRoundsActive(int roundsActive) {
        this.roundsActive = roundsActive;
    }
    public int getRoundsLeft() {
        return roundsLeft;
    }
    public void setRoundsLeft(int roundsLeft) {
        this.roundsLeft = roundsLeft;
    }
    
    public void decRounds(Hero hero) {                                             // called after every round
        setRoundsLeft(getRoundsLeft() - 1);
        if(getRoundsLeft() == 0) {
            hero.getActivePotions().remove(this);
            setRoundsLeft(getRoundsActive());
        }
    }
    
    @Override 
    public void getStats(){                                                     // also displays the rounds it can be active for, and rounds left
        System.out.printf("%d, %d", getRoundsActive(), getRoundsLeft());
    }
}
