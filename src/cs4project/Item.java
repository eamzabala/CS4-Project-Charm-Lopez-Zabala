package cs4project;

public abstract class Item implements Understandable{
    protected String name;
    protected int modHP, modAtk, modDef, modMana, price;
    
    public Item(String n, int h, int a, int d, int m, int p){
        name = n;
        modHP = h;
        modAtk = a;
        modDef = d;
        modMana = m;
        price = p;
    }
    
    public int getModHP(){
        return modHP;
    }
    public int getModAtk(){
        return modAtk;
    }
    public int getModDef(){
        return modDef;
    }
    public int getModMana(){
        return modMana;
    }
    
    @Override
    public void getStats(){
        System.out.printf("%s: %d, %d, %d, %d", name, modHP, modAtk, modDef, modMana);
    }
}