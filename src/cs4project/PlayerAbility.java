package cs4project;

import java.util.ArrayList;

public class PlayerAbility extends Skill {                                      // same as skill but has mana cost
    private int manaCost, numTargets;
    private ArrayList<Enemy> enemyTargets = new ArrayList<>();
    private ArrayList<Hero> allyTargets = new ArrayList<>();
    
    public PlayerAbility(String n, int d, int h, int a, int i, int m, int t) {
        super(n, d, h, a, i);
        manaCost = m;
        numTargets = t;
    }
    
    public int getManaCost(){
        return manaCost;
    }
    public void setManaCost(int manaCost) {
        this.manaCost = manaCost;
    }
    public int getNumTargets() {
        return numTargets;
    }
    public void setNumTargets(int numTargets) {
        this.numTargets = numTargets;
    }
    public ArrayList<Enemy> getEnemyTargets() {
        return enemyTargets;
    }
    public void setEnemyTargets(ArrayList<Enemy> enemyTargets) {
        this.enemyTargets = enemyTargets;
    }
    public ArrayList<Hero> getAllyTargets() {
        return allyTargets;
    }
    public void setAllyTargets(ArrayList<Hero> allyTargets) {
        this.allyTargets = allyTargets;
    }
}
