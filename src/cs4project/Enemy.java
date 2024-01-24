package cs4project;

public class Enemy extends Entity {
    public Enemy(String n, int m, int a, int d) {
        super(n, m, a, d);
    }
    
    public void useSkill(Skill n, Hero m) {
        n.activate(m, atk);
    }
}
