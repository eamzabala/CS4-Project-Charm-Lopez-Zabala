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
    
    public void success(Hero hero, Item item) {
        hero.getInventory().add(item);
        int buff = (int) (Math.round(Math.random() * 100) * getRiskToReward());
        hero.setAtk(buff);
    }
    
    public void fail(Hero hero) {
        Hero.setMoney((int) (Hero.getMoney() - (int) 10 * getRiskToReward()));
        hero.setCurrentHP((int) (hero.getCurrentHP() - (int) 100 * getRiskToReward()));
    }
}
