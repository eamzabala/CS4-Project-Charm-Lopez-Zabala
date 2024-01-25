package cs4project;

public class Shop extends Area {
    private Potion[] potionsList = new Potion[4];
    private Equipment[] equipmentsList = new Equipment[4];
    
    public Potion[] getPotionsList() {
        return potionsList;
    }
    public Equipment[] getEquipmentList() {
        return equipmentsList;
    }
}
