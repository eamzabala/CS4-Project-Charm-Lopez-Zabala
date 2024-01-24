package cs4project;


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
    
    public void setHealth(int n) {
        this.currentHP -= n;
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
    
    @Override
    public void getStats(){
        System.out.printf("%s: %d, %d, %d, %d", name, maxHP, currentHP, atk, def);
    }
        
    
    public void attack(Entity n) {
        int damage = (int) (0.1 * (atk*atk)/(double)(atk+n.getDef()));
        n.currentHP -= damage;
        if(n.currentHP > 0) {
            System.out.printf("");
        }

        if(n.currentHP <= 0){
            n.currentHP = 0;
            System.out.printf("%s died. %n", n.getName());
        }
    }
}

