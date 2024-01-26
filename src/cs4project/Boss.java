package cs4project;

public class Boss extends Enemy {
    protected Skill[] skills = new Skill[4];                // has 2 more skills than enemies
     public Boss(String n, int m, int a, int d) {
        super(n, m, a, d);
    }
     
    public void special() {
        setCurrentHP((int) 0.5 * getMaxHP());               // can heal to half of max health
    }
    
}
