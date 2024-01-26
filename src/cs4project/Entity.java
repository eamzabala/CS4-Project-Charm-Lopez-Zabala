package cs4project;

import java.util.Arrays;


public abstract class Entity implements Understandable{
    protected String name;
    protected int maxHP, currentHP, atk, def;
    protected Skill[] skills = new Skill[2];
    
    public Entity(String n, int m, int a, int d) {
        name = n;
        maxHP = m;
        currentHP = maxHP;
        atk = a;
        def = d;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }
    public void setCurrentHP(int currentHP) {
        this.currentHP = currentHP;
    }
    public void setAtk(int atk) {
        this.atk = atk;
    }
    public void setDef(int def) {
        this.def = def;
    }
    public void setSkills(Skill[] skills) {
        this.skills = skills;
    }
    public void setHP(int n) {
        this.setCurrentHP(this.getCurrentHP() + n);
    }
    public String getName() {
        return name;
    }
    public int getMaxHP() {
        return maxHP;
    }
    public int getCurrentHP() {
        return currentHP;
    }
    public int getAtk() {
        return atk;
    }
    public int getDef() {
        return def;
    }
    public Skill[] getSkills() {
        return skills;
    }
    
    @Override
    public void getStats(){
        System.out.printf("%s: %d, %d, %d, %d", getName(), getMaxHP(), getCurrentHP(), getAtk(), getDef());
    }
        
    
    public void attack(Entity n) {
        int damage = (int) (0.1 * (getAtk()*getAtk())/(double)(getAtk()+n.getDef()));
        n.setCurrentHP(n.getCurrentHP() - damage);
        if(n.getCurrentHP() > 0) {
            System.out.printf("");
        } else {
            n.setCurrentHP(0);
            System.out.printf("%s died. %n", n.getName());
        }
    }  
}