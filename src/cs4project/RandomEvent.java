package cs4project;

public class RandomEvent extends Area {
    private String name;
    private double riskToReward = 1;
    
    public RandomEvent(int n, String a, double r) {
        super(n);
        name = a;
        riskToReward = r;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getRiskToReward() {
        return riskToReward;
    }
    public void setRiskToReward(double riskToReward) {
        this.riskToReward = riskToReward;
    }
    
    public void success(Hero n, Item m) {
        n.getInventory().add(m);
        int buff = (int) (Math.round(Math.random() * 100) * getRiskToReward());
        n.setAtk(buff);
    }
    
    public void fail(Hero n) {
        Hero.setMoney((int) (Hero.getMoney() - (int) 10 * getRiskToReward()));
        n.setCurrentHP((int) (n.getCurrentHP() - (int) 100 * getRiskToReward()));
    }
}
