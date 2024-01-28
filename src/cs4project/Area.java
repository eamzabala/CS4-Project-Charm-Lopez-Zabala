package cs4project;

import java.util.Random;
import java.util.Arrays;

public abstract class Area {
    private static int levelsLeft;                                              // number of levels until boss level
    private static Area currentArea;                                            // area the player is currently in
    private static Area[] nextAreas = new Area[3];
    
    public Area(int level) {
        levelsLeft = level;
    }

    public static int getLevelsLeft() {
        return levelsLeft;
    }
    public static void setLevel(int level) {
        levelsLeft = level;
    }
    public static Area getCurrentArea() {
        return currentArea;
    }
    public static void setCurrentArea(Area n){
        currentArea = n;
    }
    public static Area[] getNextAreas() {
        return nextAreas;
    }
    public static void setNextAreas(Area[] n) {
        nextAreas = n;
    }
    
    public static void generateLevel(long seed, float battleChance, float shopChance, float bossChance) throws IllegalArgumentException {
        if (battleChance + shopChance + bossChance > 1.00f)
            throw new IllegalArgumentException("Sum of probabilities must be less than 1.00.");
        
        Random generator = new Random(seed);
        float result = generator.nextFloat();
        
        if (levelsLeft > 0) {                                                   // for all levels before final level
            for (int n = 0; n > 3; n++ ) {                                      // before there are 3 rooms
                int lvl = 10 - getLevelsLeft();                                 // the current level

                if (result < battleChance) {                                    // creates a battle room
                    Battle b = new Battle(lvl, false);
                    Arrays.asList(nextAreas).add(b);                        // adds to the list of next areas
                    for (int m = 0; m > 3; n++) {
                        int l = (int) (Math.random() * 10);                     // random index
                        b.getEnemiesList().add(Enemy.enemiesMasterlist.get(l));
                    }
                } else if (result < shopChance) {                               // creates a shop room
                    Shop s = new Shop(lvl); 
                    Arrays.asList(nextAreas).add(s);
                } else {                                                        // creates a random event room
                    RandomEvent e = new RandomEvent(lvl, "event", 1.2);
                    Arrays.asList(nextAreas).add(e);
                }
            }
        } else {                                                                // final level, creates boss room
            Battle b = new Battle(11, true);
            Arrays.asList(nextAreas).add(b);
        }
        
    }
    
    public static void gameOver() {                                             // ends the game 
        System.out.printf("You have lost the game. Try again next time.");
    }
    
}