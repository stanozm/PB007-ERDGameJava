/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import enums.BagColor;

/**
 *
 * @author stano
 */
public class Bag {
    private int id;
    private Player owner;
    private BagColor color;
    
    //How many kilograms can go inside.
    private int capacity;
    
    /**
     * Items and their weight separated with ;
       Example:
       "Silver witcher sword,2kg;Fine leather boots,1kg;"
     */
    private String items;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public BagColor getColor() {
        return color;
    }

    public void setColor(BagColor color) {
        this.color = color;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }
    
    
}
