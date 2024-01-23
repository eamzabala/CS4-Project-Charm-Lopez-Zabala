package cs4project;

import java.util.ArrayList;

public abstract class Entity implements Understandable{
    protected String name;
    protected int maxHP, currentHP, atk, def;
    protected ArrayList<PlayerAbility> skills = new ArrayList<>();
    
    public Entity(String n, int m, int c, int a, int d) {
        name = n;
        maxHP = m;
        currentHP = c;
        atk = a;
        def = d;
    }
    
    @Override
    public void getStats(){
        System.out.printf("%s: %d, %d, %d, %d", name, maxHP, currentHP, atk, def);
    }
    
    public void useSkill(Skill n) {
    }
    
    // use skill: get using name, get using index number
    // when u have the skill, you skill.something
    
    public void attack(Entity n) {
        // figure this out <33
    }
}

