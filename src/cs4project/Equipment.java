package cs4project;

public class Equipment extends Item {
    
    public Equipment(String n, int h, int a, int d, int m, int p) { 
        super(n, h, a, d, m, p);    
    }
    
    public void special(){                                                      // randomly buffs a random stat
        int b = (int) Math.round(Math.random() * 10) % 4;                       // gives number from 0-4
        
        switch(b) {                                                             // assigns to stat based on number
            case 0 -> modHP += (int) Math.round(Math.random() * 1000);          // random buff in 100s
            case 1 -> modAtk += (int) Math.round(Math.random() * 1000);
            case 2 -> modDef += (int) Math.round(Math.random() * 1000);
            case 3 -> modMana += (int) Math.round(Math.random() * 1000);
        }
    }
}
