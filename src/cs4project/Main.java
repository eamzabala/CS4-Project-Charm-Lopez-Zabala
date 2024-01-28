package cs4project;

public class Main {

    public static void main(String[] args) {
        LightHero h1 = new LightHero("Ray", 15000, 3435, 1236, 500);
        MediumHero h2 = new MediumHero("Jake", 15000, 3435, 1236, 500);
        HeavyHero h3 = new HeavyHero("Kyle", 15000, 3435, 1236, 500);
        
        Enemy goblin1 = new Enemy("Goblin", 16204, 1157, 606);
        Enemy bandit1 = new Enemy("Bandit", 17217, 1901, 662);
        Enemy heretic1 = new Enemy("Heretic", 15193, 1781, 580);
        
        PlayerAbility s1 = new PlayerAbility("Chop", "attack", 800, 0, 10, 0, 10, 1);
        PlayerAbility s2 = new PlayerAbility("Chop", "attack", 800, 0, 10, 0, 10, 1);
        PlayerAbility s3 = new PlayerAbility("Chop", "attack", 800, 0, 10, 0, 10, 1);
        PlayerAbility s4 = new PlayerAbility("Chop", "attack", 800, 0, 10, 0, 10, 1);
        
        Battle b = new Battle(1, false);
        Shop s = new Shop(1); 
        RandomEvent e = new RandomEvent(1, "event", 1.2);
        
        // Scenario 1 - Battle
        h1.enter(b);
        h1.attack(goblin1);
        h2.useSkill(s1, bandit1);
        //h2.
        
        // Scenario 2 - Shop
        
        
        // Scenario 3 - Event
        
    }
    
}
