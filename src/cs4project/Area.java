package cs4project;

public abstract class Area {
    protected int level;
    protected Area[] nextAreas;

    public int getLevel() {
        return level;
    }

    public Area[] getNextAreas() {
        return nextAreas;
    }
    
}
