package cs4project;

public abstract class Entity implements Understandable{
    protected String name;
    protected int shield = 0;                                                                           // stays as 0 for all enemies
    protected int maxHP, currentHP, atk, def;
    
    public Entity(String n, int m, int a, int d) {
        name = n;
        maxHP = m;
        currentHP = maxHP;
        atk = a;
        def = d;
    }
    
    // getters & setters
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
    public int getShield() {
        return shield;
    }
    public void setShield(int shield) {
        this.shield = shield;
    }
    
    @Override
    public void getStats(){                                                                                  // gives stats
        System.out.printf("%s: %d, %d, %d, %d", getName(), getMaxHP(), getCurrentHP(), getAtk(), getDef());
    }
        
    
    public void attack(Entity target) {
        int damage = (int) (0.1 * (getAtk()*getAtk())/(double)(getAtk()+target.getDef()));                   // 10% of normal atk 
        if (target.shield > 0) {                                                                             // if there is shield, dmg goes to shield until no shield
            int m = target.getShield();
            target.setShield(m - damage);
            if (damage > m) {                                                                                // if too much dmg, rest goes to hp and shield is set to 0
                target.setShield(0);
                target.setCurrentHP(damage - m);
            }
        } else {
            target.setCurrentHP(target.getCurrentHP() - damage);
        }
        if(target.getCurrentHP() > 0) {                                                                      // target is still alive
            System.out.printf("");
        } else {
            target.setCurrentHP(0);                                                                 // taget is dead
            System.out.printf("%s died. %n", target.getName());
        }
    }  
}