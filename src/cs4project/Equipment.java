package cs4project;

public class Equipment extends Item {
    
    public Equipment(String n, int h, int a, int d, int m, int p) { 
        super(n, h, a, d, m, p);    
    }
    
    public void special(){
        int b = (int) Math.round(Math.random() * 10) % 4;
        
        switch(b) {
            case 0:
              modHP += (int) Math.round(Math.random() * 10); // multiply by bigger depending on how big mods are
              break;
            case 1:
              modAtk += 0;
              break;
            case 2:
              modDef += 0;
              break;
            case 3:
              modMana += 0;
        }
    }
}
