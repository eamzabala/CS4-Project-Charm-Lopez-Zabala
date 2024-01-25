package cs4project;

import java.util.Arrays;
import java.util.Random;

public class Map {
    private static Area currentArea;
    private int bossLevel;
    
    public static void setCurrentArea(Area n){
        currentArea = n;
    }
    
    public void generateMap(long seed, float battleChance, float shopChance, float bossChance) throws IllegalArgumentException {
        if (battleChance + shopChance + bossChance > 1.00f)
            throw new IllegalArgumentException("Sum of probabilities must be less than 1.00.");
        
        Random generator = new Random(seed);
        float result = generator.nextFloat();
        
        if (result < battleChance) { // Creates BattleRoom
            
        } else if (result < shopChance) { // Creates a Shop
            
        } else if (result < bossChance) { // Creates a BattleRoom - Boss Variant
            
        } else { // Creates a RandomEvent
            
        }
    }
    
    public void enter(Map map, Area area) throws IllegalArgumentException {
        if (Arrays.asList(currentArea.getNextAreas()).contains(area))
            throw new IllegalArgumentException("Area inaccessible.");
        
        map.currentArea = area;
    }
    
    public void gameOver() {
        System.out.printf("You have lost the game. Try again next time.");
    }
}
