package cs4project;

import java.util.ArrayList;

public class Battle extends Area {
     private ArrayList<Enemy> enemiesList = new ArrayList<>();
     private boolean boss;
         
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
        n.getInventory().add(m);
        int buff = (int) (Math.round(Math.random() * 100));
        n.setAtk(buff);
     }
     
     public void lose(Map m){
         m.gameOver();
     }
}
