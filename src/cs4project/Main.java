package cs4project;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LightHero h1 = new LightHero("Cloud", 15000, 3435, 1236, 500);
        MediumHero h2 = new MediumHero("Aerith", 15000, 3435, 1236, 500);
        HeavyHero h3 = new HeavyHero("Clive", 15000, 3435, 1236, 500);
        
        Enemy goblin1 = new Enemy("Goblin", 16204, 1157, 606);
        Enemy bandit1 = new Enemy("Bandit", 17217, 1901, 662);
        Enemy heretic1 = new Enemy("Heretic", 15193, 1781, 580);
        
        PlayerAbility s1 = new PlayerAbility("Chop", "attack", 800, 0, 10, 0, 10, 1);
        PlayerAbility s2 = new PlayerAbility("Slash", "attack", 800, 0, 10, 0, 10, 1);
        PlayerAbility s3 = new PlayerAbility("Hack", "attack", 800, 0, 10, 0, 10, 1);
        PlayerAbility s4 = new PlayerAbility("Slice", "attack", 800, 0, 10, 0, 10, 1);
        
        Potion p1 = new Potion("healPotion", 100, 0, 0, 0, 10, 3);
        Equipment q1 = new Equipment("steelSword", 0, 600, 0, 0, 50);
        
        Skill e5 = new Skill("Thrash", "attack", 800, 10, 10, 0);
        
        Battle b = new Battle(1, false);
        Shop s = new Shop(1); 
        RandomEvent e = new RandomEvent(1, "event", 1.2);
        
        // Scenario 1 - Battle
        Hero.enter(b);
        h1.attack(goblin1);
        h2.useSkill(s1, bandit1);
        heretic1.attack(h3);
        goblin1.useSkill(e5, h1);
        h3.useSkill(s4, heretic1);
        h1.useSkill(s2, bandit1);
        // pretend the enemies die 
        Hero.enter(s);
        
        // Scenario 2 - Shop
        Hero.enter(s);
        h1.buyPotion(s,p1);
        h2.buyEquipment(s, q1);
        
        
        // Scenario 3 - Event
        Hero.enter(e);
        Scanner scan = new Scanner(System.in);
        System.out.printf("The Left path leads into a dark room while the right path leads into a well lit corridor. %n Which path do you choose? (L/R)");
        String choice = scan.nextLine();
        if (choice.equals("L")) {
            System.out.printf("After entering the dark room and lighting up a torch you realize that its filled with piles of gold");
            Hero.setMoney(Hero.getMoney() + 100);
        } else if (choice.equals("R")) {
            System.out.printf("As you walk along the corridor you feel the tile below you sink as you step onto it. A trap is triggered as poison tipped arrows run");
            for (int counter = 0; counter < Hero.getHeroesList().size(); counter++) { 		      
                Hero.getHeroesList().get(counter).setCurrentHP(Hero.getHeroesList().get(counter).getCurrentHP() - 100);
            }   
        }
        Hero.enter(s);
        
    }
    
}
