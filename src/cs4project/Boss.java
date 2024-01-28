package cs4project;

import java.util.ArrayList;

public class Boss extends Enemy {
    protected Skill[] skills = new Skill[4];                // has 2 more skills than enemies
    private static ArrayList<Boss> bossMasterlist = new ArrayList<>();
     public Boss(String n, int m, int a, int d) {
        super(n, m, a, d);
    }
     
    public void special() {
        setCurrentHP((int) 0.5 * getMaxHP());               // can heal to half of max health
    }
    
    public static void createBosses() {
        Boss voidsent1 = new Boss("Voidsent", 18087, 1923, 792);
        Boss ghoul1 = new Boss("Ghoul", 19315, 1618, 757);
        bossMasterlist.add(voidsent1);
        bossMasterlist.add(ghoul1);  
    }
}
