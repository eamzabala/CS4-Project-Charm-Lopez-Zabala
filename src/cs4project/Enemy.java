package cs4project;

import java.util.Arrays;

public class Enemy extends Entity {
    public Enemy(String n, int m, int a, int d) {
        super(n, m, a, d);
    }
    public void useSkill(Skill n, Entity target) {
        if ((Arrays.asList(getSkills())).contains(n)) {
            this.setCurrentHP(this.getCurrentHP() + n.getHealVal());
            this.setAtk(this.getAtk() + n.getAtkInc());
       
            if(n.getType().equals("attack")) {
                int damage = (int) ((this.getAtk()*this.getAtk())/(double)(this.getAtk()+target.getDef()));
                target.setCurrentHP(target.getCurrentHP() - damage);
                if(target.getCurrentHP() > 0) {
                    System.out.printf("");
                } else {
                    target.setCurrentHP(0);
                    System.out.printf("%s died. %n", target.getName());
                }
            }
            
        }
    }  
}
