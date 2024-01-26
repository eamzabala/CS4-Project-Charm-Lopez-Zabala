package cs4project;

import java.util.Arrays;

public class Enemy extends Entity {
    public Enemy(String n, int m, int a, int d) {
        super(n, m, a, d);
    }
    public void useSkill(Skill n, Entity target) {
        if ((Arrays.asList(getSkills())).contains(n)) {                                                     // checks if its in the skills list
            this.setCurrentHP(this.getCurrentHP() + n.getHealVal());                                            // heals (if healVal > 0)
            this.setAtk(this.getAtk() + n.getAtkInc());                                                         // gives attack boost
       
            if(n.getType().equals("attack")) {
                int damage = (int) ((this.getAtk()*this.getAtk())/(double)(this.getAtk()+target.getDef()));     // damage to be done to target
                if (target.shield > 0) {                                                                        // if target has shield
                    int m = target.getShield();                                                                 // placeholder
                    target.setShield(m - damage);                                                               // target's shield = shield - dmg
                    if (damage > m) {                                                                           // if dmg is greater than shield
                        target.setShield(0);                                                               // shield goes back to 0
                        target.setCurrentHP(damage - m);                                                        // rest of dmg goes to target's hp
                    }
                } else {
                    target.setCurrentHP(target.getCurrentHP() - damage);                                        // dmg goes to target's hp
                }
                if(target.getCurrentHP() > 0) {                                                                 // target is still alive
                    System.out.printf("");
                } else {                                                                                        // target is dead
                    target.setCurrentHP(0);
                    System.out.printf("%s died. %n", target.getName());
                }
            }
            
        }
    }  
}
