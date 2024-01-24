package cs4project;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Hero extends Entity{
    protected double maxMana, currentMana;
    protected static int money = 20;
    protected Equipment[] currentEquip = new Equipment[2];
    protected PlayerAbility[] skills = new PlayerAbility[4];
    private ArrayList<Item> inventory = new ArrayList<>();
    private ArrayList<Potion> activePotions = new ArrayList<>();
            
    public Hero(String n, int m, int a, int d, int x) {
        super(n, m, a, d);
        maxMana = x;
        currentMana = maxMana;
    }
    
    public void addAtk(int n){
        atk += n;
    }
    
    public ArrayList<Item> getInvetory() {
        return inventory;
    }
    
    @Override
    public void getStats() {
        System.out.printf(", %d, %d", maxMana, currentMana);
    }
    
    @Override
    public void attack(Entity n) {
        this.currentMana += 0.1 * maxMana;
    }
    
    // change equipment
    public void equip(Equipment n) {
        if (inventory.contains(n)) {
            (Arrays.asList(currentEquip)).add(n);
            this.maxHP += n.getModHP();
            this.atk += n.getModAtk();
            this.def += n.getModDef();
            this.currentMana += n.getModMana();
        } else {
            //throw exception
        }
    }
    
    // add skill
    public void addAbil(PlayerAbility n) {
        if(skills.length < 4) { 
            Arrays.asList(skills).add(n);
        } else {
            // exception here
        }
    }
    
    // change skillsList
    public void removeAbil(PlayerAbility n) {
        Arrays.asList(skills).remove(n);
    }
    
    // can use potion
    public void use(Potion n) { 
        if (inventory.contains(n)) {
            activePotions.add(n);
        }
    }
    
    // can use skill
    public void useAbil(PlayerAbility n, Enemy m) {
        if ((Arrays.asList(skills)).contains(n)) {
            n.activate(m, atk);
            this.currentMana -= n.getManaCost();
        }
    }
    
    
    // can buy
    public void buy(Shop n, Potion m) {
        if (Arrays.asList(n.getPotionsList()).contains(m)) {
            inventory.add(m);
            Arrays.asList(n.getPotionsList()).remove(m);
        }
    }
    
}