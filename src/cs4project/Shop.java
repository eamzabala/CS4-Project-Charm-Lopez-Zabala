package cs4project;

import java.util.Arrays;

public class Shop extends Area {
    private Potion[] potionsList = new Potion[3];
    private Equipment[] equipmentsList = new Equipment[3];
    
    public Potion[] getPotionsList() {
        return potionsList;
    }
    public Equipment[] getEquipmentList() {
        return equipmentsList;
    }
}
