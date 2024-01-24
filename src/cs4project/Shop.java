package cs4project;

import java.util.Arrays;

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
