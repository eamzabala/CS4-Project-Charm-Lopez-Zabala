package cs4project;

public class Skill {
    private String name;
    private String type;                        // attack, heal, buff, shield
    private int dmg;
    private int healVal;
    private int atkInc;
    private int defInc;
    private int shield;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType(){
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getDmg() {
        return dmg;
    }
    public void setDmg(int dmg) {
        this.dmg = dmg;
    }
    public int getHealVal() {
        return healVal;
    }
    public void setHealVal(int healVal) {
        this.healVal = healVal;
    }
    public int getAtkInc() {
        return atkInc;
    }
    public void setAtkInc(int atkInc) {
        this.atkInc = atkInc;
    }
    public int getDefInc() {
        return defInc;
    }
    public void setDefInc(int defInc) {
        this.defInc = defInc;
    }
    public int getShield() {
        return shield;
    }
    public void setShield(int shield) {
        this.shield = shield;
    }
    
    public Skill (String n, int d, int h, int a, int i) {
        name = n;
        dmg = d;
        healVal = h;
        atkInc = a;
        defInc = i;
    }
}
