package cs4project;

public class Shop extends Area {
    private Potion[] potionsList = new Potion[4];
    private Equipment[] equipmentsList = new Equipment[4];
    
    public Shop(int n) {
        super(n);
    }
    
    public Potion[] getPotionsList() {
        return potionsList;
    }
    public void setPotionsList(Potion[] potionsList) {
        this.potionsList = potionsList;
    }
    public Equipment[] getEquipmentsList() {
        return equipmentsList;
    }
    public void setEquipmentsList(Equipment[] equipmentsList) {
        this.equipmentsList = equipmentsList;
    }
}
