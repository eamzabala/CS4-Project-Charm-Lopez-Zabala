package cs4project;

public class RandomEvent extends Area {
    private String name;
    private double ratio = 0.5;
    
    public void good() {
        ratio += .05;
    }
}
