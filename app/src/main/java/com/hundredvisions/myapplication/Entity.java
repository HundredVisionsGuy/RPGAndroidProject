package com.hundredvisions.myapplication;

/**
 * Created by winikkc on 5/5/2016.
 * Entity: Base class for all objects with a name and description
 */
public class Entity {
    // instance variables (Properties)
    private String name;
    private String description;

    // Default Constructor
    public Entity() {
        name = "";
        description = "";
    }
    // Constructor Method with parameters
    // Method overload (same method, different parameters
    public Entity(String entityName, String entityDescription) {
        name = entityName;
        description = entityDescription;
    }
    // Accessor Methods AKA getter methods
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }

    // Mutator Methods AKA setter methods
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    // toString() override to make toString() more readable
    @Override
    public String toString() {
        String output;
        output = "Type: Entity\nName: " + name;
        output += "\nDescription: " + description;
        return output;
    }
}
