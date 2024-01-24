package cs4project;

import java.util.ArrayList;

public class Battle extends Area {
     private ArrayList<Enemy> enemiesList = new ArrayList<>();
     private boolean boss;
     
     public void win(Hero n, Item m){
        n.getInvetory().add(m);
        int buff = (int) (Math.round(Math.random() * 100));
        n.addAtk(buff);
     }
     
     public void lose(Map m){
         m.gameOver();
     }
}
