package cs4project;

import java.util.ArrayList;

public abstract class Hero extends Entity{
    protected int maxMana, currentMana;
    protected static int money = 20;
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
    // change equipment
    
    // change skills
    
    // can use potion
    
    // can use skill
    // can buy
    
}
