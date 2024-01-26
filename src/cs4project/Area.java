package cs4project;

public abstract class Area {
    private int level;
    private Area[] nextAreas;

    public int getLevel() {
        return level;
    }
    public Area[] getNextAreas() {
        return nextAreas;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public void setNextAreas(Area[] nextAreas) {
        this.nextAreas = nextAreas;
    }
    
}