package cs4project;

public class Skill {
    protected String name;
    protected int dmg, healVal, atkInc, defInc;
    
    public Skill (String n, int d, int h, int a, int i) {
        name = n;
        dmg = d;
        healVal = h;
        atkInc = a;
        defInc = i;
    }
    
    public void activate(Entity m, int n){
        int dec = n * atkInc;
        m.setHealth(dec);
    }
}
