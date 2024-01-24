package cs4project;

public class Boss extends Enemy {
    protected Skill[] skills = new Skill[4];
     public Boss(String n, int m, int a, int d) {
        super(n, m, a, d);
    }
     
    public void special() {
        currentHP = (int) 0.5 * maxHP;
    }
    
}
