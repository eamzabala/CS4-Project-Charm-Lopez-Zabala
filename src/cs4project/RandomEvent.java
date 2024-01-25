package cs4project;

public class RandomEvent extends Area {
    private String name;
    private double riskToReward = 1;
    
    public RandomEvent(String n, double r) {
        name = n;
        riskToReward = r;
    }
    
    public void success(Hero n, Item m) {
        n.getInventory().add(m);
        int buff = (int) (Math.round(Math.random() * 100) * riskToReward);
        n.setAtk(buff);
    }
    
    public void fail(Hero n) {
        n.setMoney((int) (n.getMoney() - (int) 10 * riskToReward));
        n.setCurrentHP((int) (n.getCurrentHP() - (int) 100 * riskToReward));
    }
   
}
