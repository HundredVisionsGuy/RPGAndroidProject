package com.hundredvisions.myapplication;

/**
 * Created by winikkc on 5/9/2016.
 */
public class Item extends Entity {
    private int cost;
    private int durability;
    private int materialStrength;
    private int weight;

    // Constructor Methods
    // Parameterless/Default
    public Item() {
        // call the base class constructor
        super();
        // Set initial property values
        cost = 0;
        durability = 0;
        materialStrength = 0;
        weight = 0;
    }
    // Constructor Overload (with parameters)
    public Item(String name, String description,
                int itemCost, int itemDurability,
                int itemMaterialStrength,
                int itemWeight) {
        super(name, description);
        cost = itemCost;
        durability = itemDurability;
        materialStrength = itemMaterialStrength;
        weight = itemWeight;
    }
    public int getCost() {
        return cost;
    }
    public int getDurability() {
        return durability;
    }
    public int getMaterialStrength() {
        return materialStrength;
    }
    public int getWeight() {
        return weight;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public void setDurability(int durability) {
        this.durability = durability;
    }
    public void setMaterialStrength(int materialStrength) {
        this.materialStrength = materialStrength;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    @Override
    public String toString() {
        String output;
        output = "Type: Item\nName: " + getName();
        output += "\nDescription: " + getDescription();
        output += "\nDurability: " + durability;
        output += "\nMaterial Strength: " + materialStrength;
        output += "\nWeight: " + weight;
        output += "\nCost: $" + cost;
        return output;
    }
}
