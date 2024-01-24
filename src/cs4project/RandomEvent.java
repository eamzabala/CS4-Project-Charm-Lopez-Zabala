package cs4project;

public class RandomEvent extends Area {
    private String name;
    private double riskToReward = 1;
    
    public RandomEvent(String n, double r) {
        name = n;
        riskToReward = r;
    }
    
    public void success(Hero n, Item m) {
        n.getInvetory().add(m);
        int buff = (int) (Math.round(Math.random() * 100) * riskToReward);
        n.addAtk(buff);
    }
    
    public void fail(Hero n) {
        n.money -= (int) 10 * riskToReward;
        n.currentHP -= (int) 100 * riskToReward;
    }
   
}
