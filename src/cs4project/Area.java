package cs4project;

import java.util.Random;

public abstract class Area {
    private static int levelsLeft;                              // number of levels until boss level
    private static Area currentArea;                            // area the player is currently in
    
    public Area(int level) {
        levelsLeft = level;
    }

    public int getLevelsLeft() {
        return levelsLeft;
    }
    public void setLevel(int level) {
        levelsLeft = level;
    }
    public static Area getCurrentArea() {
        return currentArea;
    }
    public static void setCurrentArea(Area n){
        currentArea = n;
    }
    
    public void generateLevel(long seed, float battleChance, float shopChance, float bossChance) throws IllegalArgumentException {
        if (battleChance + shopChance + bossChance > 1.00f)
            throw new IllegalArgumentException("Sum of probabilities must be less than 1.00.");
        
        Random generator = new Random(seed);
        float result = generator.nextFloat();
        
        if (levelsLeft > 0) {
            int lvl = 10 - this.getLevelsLeft();

            if (result < battleChance) { 
                Battle b = new Battle(lvl, false);

            } else if (result < shopChance) { 
                Shop s = new Shop(lvl); 

            } else if (result < bossChance) { 
                Battle b = new Battle(lvl, true);
            } else { 
                RandomEvent e = new RandomEvent(lvl, "e", 1.2);
            }
            
        } else {
            Battle b = new Battle(11, true);
        }
        
    }
    
    public void gameOver() {                                                    // ends the game 
        System.out.printf("You have lost the game. Try again next time.");
    }
    
}