package cs4project;

import java.util.ArrayList;

public class Battle extends Area {
    private ArrayList<Enemy> enemiesList = new ArrayList<>();
    private boolean boss;
    
    public Battle(int n, boolean b) {
        super(n);
        boss = b;
    }
         
    public ArrayList<Enemy> getEnemiesList() {
        return enemiesList;
    }
    public void setEnemiesList(ArrayList<Enemy> enemiesList) {
        this.enemiesList = enemiesList;
    }
    public boolean isBoss() {
        return boss;
    }
    public void setBoss(boolean boss) {
        this.boss = boss;
    }
     
     public void win(Hero n, Item m){
        n.getInventory().add(m);                                      // adds a new item to hero's inventory
        int buff = (int) (Math.round(Math.random() * 1000));            // gives a random buff (in the 100s)
        n.setAtk(n.getAtk() + buff);                                    // sets hero's atk to be atk + buff
     }
     
     public void lose(){
         Area.gameOver();                                               // game ends when battle is lost
     }
     
}
