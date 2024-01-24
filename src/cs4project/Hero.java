package cs4project;

import java.util.ArrayList;

public abstract class Hero extends Entity{
    protected double maxMana, currentMana;
    protected static int money = 20;
    protected Equipment currentEquip;
    protected ArrayList<PlayerAbility> skills = new ArrayList<>();
    private ArrayList<Item> items = new ArrayList<>();
    private ArrayList<Potion> activePotions = new ArrayList<>();
            
    public Hero(String n, int m, int c, int a, int d, int x, int r) {
        super(n, m, c, a, d);
        maxMana = x;
        currentMana = r;
        money = 0;
    }
    
    @Override
    public void getStats() {
        System.out.printf(", %d, %d", maxMana, currentMana);
    }
    
    @Override
    public void attack(Entity n) {
        this.currentMana =+ 0.1 * maxMana;
    }
    
    // change equipment
    public void equip(Equipment n) {
        if (items.contains(n)) {
            currentEquip = n;
            this.maxHP =+ n.getModHP();
            this.atk =+ n.getModAtk();
            this.def =+ n.getModDef();
            // mana stuff
        } else {
            //throw exception
        }
    }
    
    // change skills
    
    // can use potion
    public void use(Potion n) {
        if (items.contains(n)) {
            activePotions.add(n);
        }
    }
    
    // can use skill
    // can buy
    public void buy(Shop n, Item m) {
        
    }
    
}