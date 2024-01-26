package cs4project;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Hero extends Entity{
    protected double maxMana, currentMana;
    protected static int money = 20;
    protected Equipment[] currentEquip = new Equipment[2];
    protected PlayerAbility[] skills = new PlayerAbility[4];
    protected ArrayList<Item> inventory = new ArrayList<>();
    protected ArrayList<Potion> activePotions = new ArrayList<>();
            
    public Hero(String n, int m, int a, int d, int x) {
        super(n, m, a, d);
        maxMana = x;
        currentMana = maxMana;
    }
    
    public double getMaxMana() {
        return maxMana;
    }
    public void setMaxMana(double maxMana) {
        this.maxMana = maxMana;
    }
    public double getCurrentMana() {
        return currentMana;
    }
    public void setCurrentMana(double currentMana) {
        this.currentMana = currentMana;
    }
    public static int getMoney() {
        return money;
    }
    public static void setMoney(int aMoney) {
        money = aMoney;
    }
    public Equipment[] getCurrentEquip() {
        return currentEquip;
    }
    public void setCurrentEquip(Equipment[] currentEquip) {
        this.currentEquip = currentEquip;
    }
    @Override
    public PlayerAbility[] getSkills() {
        return skills;
    }
    public void setSkills(PlayerAbility[] skills) {
        this.skills = skills;
    }
    public ArrayList<Item> getInventory() {
        return inventory;
    }
    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }
        public ArrayList<Potion> getActivePotions() {
        return activePotions;
    }
    public void setActivePotions(ArrayList<Potion> activePotions) {
        this.activePotions = activePotions;
    }
    
    @Override
    public void getStats() {
        System.out.printf(", %f, %f", getMaxMana(), getCurrentMana());
    }
    
    @Override
    public void attack(Entity n) {
        this.setCurrentMana(this.getCurrentMana() + 0.1 * getMaxMana());
    }
    
    // change equipment
    public void equip(Equipment n) {
        if (getInventory().contains(n)) {
            (Arrays.asList(getCurrentEquip())).add(n);
            this.setMaxHP(this.getMaxHP() + n.getModHP());
            this.setAtk(this.getAtk() + n.getModAtk());
            this.setDef(this.getDef() + n.getModDef());
            this.setCurrentMana(this.getCurrentMana() + n.getModMana());
        } else {
            //throw exception
        }
    }
    
    // remove equipment
    public void removeEquip(Equipment n) {
        if (Arrays.asList(getCurrentEquip()).contains(n)) {
            getInventory().add(n);
            this.setMaxHP(this.getMaxHP() - n.getModHP());
            this.setAtk(this.getAtk() - n.getModAtk());
            this.setDef(this.getDef() - n.getModDef());
            this.setCurrentMana(this.getCurrentMana() - n.getModMana());
        } else {
            
        }
    }
    
    // add skill
    public void addAbil(PlayerAbility n) {
        if(getSkills().length < 4) { 
            Arrays.asList(getSkills()).add(n);
        } else {
            // exception here
        }
    }
    
    // remove skill
    public void removeAbil(PlayerAbility n) {
        Arrays.asList(getSkills()).remove(n);
    }
    
    // can use potion
    public void use(Potion n) { 
        if (getInventory().contains(n)) {
            getActivePotions().add(n);
        }
    }
    
    // @Override
    public void useSkill(PlayerAbility n, Entity target) {
        this.setCurrentMana(this.getCurrentMana() - n.getManaCost());
    }
    
    // can buy
    public void buy(Shop n, Potion m) {
        if (Arrays.asList(n.getPotionsList()).contains(m)) {
            getInventory().add(m);
            Arrays.asList(n.getPotionsList()).remove(m);
        }
    }
    
    // entering a new room
    public void enter(Area n) {
        Map.setCurrentArea(n);
    }
    
    // gets stats
    public void understand(Understandable n) {
        n.getStats();
    }
    
}