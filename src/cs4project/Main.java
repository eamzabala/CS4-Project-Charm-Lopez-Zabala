package cs4project;

public class Main {

    public static void main(String[] args) {
        LightHero h1 = new LightHero("Ray", 15000, 3435, 1236, 500);
        MediumHero h2 = new MediumHero("Jake", 15000, 3435, 1236, 500);
        HeavyHero h3 = new HeavyHero("Kyle", 15000, 3435, 1236, 500);
        
        Area.generateLevel(0, 35, 65, 95);
        
        Battle b = new Battle(1, false);
        Shop s = new Shop(1); 
        RandomEvent e = new RandomEvent(1, "event", 1.2);
        
        // Scenario 1 - Battle
        h1.enter(b);
        h1.attack(e1);
        //h2.
        
        // Scenario 2 - Shop
        
        
        // Scenario 3 - Event
    }
    
}
