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
    protected ArrayList<PlayerAbility> activeAbilities = new ArrayList<>();
            
    public Hero(String n, int m, int a, int d, int x) {
        super(n, m, a, d);
        maxMana = x;
        currentMana = maxMana;
    }
    
    // getters & setters    
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
    public void getStats() {                                                            // adds max mana and current mana to stats list
        System.out.printf(", %f, %f", getMaxMana(), getCurrentMana());
    }
    
    @Override
    public void attack(Entity n) {                                                      // adds mana upon attacking
        this.setCurrentMana(this.getCurrentMana() + 0.1 * getMaxMana());
    }
    
    public void equip(Equipment n) {                                                    // equips, adds the mod to the stat
        if (getInventory().contains(n)) {                                             // checks if in inventory
            (Arrays.asList(getCurrentEquip())).add(n);
            this.setMaxHP(this.getMaxHP() + n.getModHP());
            this.setAtk(this.getAtk() + n.getModAtk());
            this.setDef(this.getDef() + n.getModDef());
            this.setCurrentMana(this.getCurrentMana() + n.getModMana());
        } else {
            //throw exception
        }
    }
    
    public void removeEquip(Equipment n) {                                              // un-equips, adds back to inventory, takes away mods
        if (Arrays.asList(getCurrentEquip()).contains(n)) {
            getInventory().add(n);
            this.setMaxHP(this.getMaxHP() - n.getModHP());
            this.setAtk(this.getAtk() - n.getModAtk());
            this.setDef(this.getDef() - n.getModDef());
            this.setCurrentMana(this.getCurrentMana() - n.getModMana());
        } else {
            // throw exception
        }
    }
    
    public void addAbil(PlayerAbility n) {                                              // add skill
        if(getSkills().length < 4) {                                                    // makes sure there is still space
            Arrays.asList(getSkills()).add(n);
        } else {
            // exception here
        }
    }
    
    public void removeAbil(PlayerAbility n) {                                           // remove skill
        Arrays.asList(skills).remove(n);
    }
    
    public void use(Potion n) {                                                         // activate/use potion
        if (getInventory().contains(n)) {
            activePotions.add(n);
        }
    }
    
    public void useSkill(PlayerAbility n, Entity target) {                              // activate/use skill
        if ((Arrays.asList(getSkills())).contains(n)) {                             // checks if in skills
            this.setCurrentHP(this.getCurrentHP() + n.getHealVal());                    // heals
            this.setAtk(this.getAtk() + n.getAtkInc());                                 // atk buff
            this.setDef(this.getDef() + n.getDefInc());                                 // def buff
       
            if(n.getType().equals("attack")) {
                int damage = (int) ((this.getAtk()*this.getAtk())/(double)(this.getAtk()+target.getDef())); // dmg buff
                target.setCurrentHP(target.getCurrentHP() - damage);                    // targets hp - dmg
                if(target.getCurrentHP() > 0) {
                    System.out.printf("");                                         // target still alive
                } else {
                    target.setCurrentHP(0);
                    System.out.printf("%s died. %n", target.getName());        // target is dead
                }
            }
            
            if(n.getType().equals("shield")) {  
                this.shield += n.getShield();                                           // adds to shield
            }
            
        }
        this.setCurrentMana(this.getCurrentMana() - n.getManaCost());                   // takes away mana
    }
    
    public void buy(Shop n, Potion m) {                                                 // buy from shop
        if (Arrays.asList(n.getPotionsList()).contains(m)) {                        // makes sure item is in shop
            getInventory().add(m);                                                    // add to inventory
            Arrays.asList(n.getPotionsList()).remove(m);                            // remove from shop
        }
    }
    
    public void enter(Area n) {                                                         // enter a new room
        Area.setCurrentArea(n);
    }
    
    public void understand(Understandable n) {                                          // get stats from Understandables
        n.getStats();
    }
    
}