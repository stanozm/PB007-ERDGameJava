/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.List;

/**
 *
 * @author stano
 */
class Boss {
    private int id;
    /**
     * Bosses can have the same name in the game, but there can't
     *  be two bosses with the same name in the same location.
     */
    private String name;
    private String location;
    //Zip code of the location where the boss is.
    private String zipCode;
    private int damage;
    //List of players that killed this boss.
    private List<Player> killedByList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public List<Player> getKilledByList() {
        return killedByList;
    }

    public void setKilledByList(List<Player> killedByList) {
        this.killedByList = killedByList;
    }
    
    
}
