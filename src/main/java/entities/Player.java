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
class Player {
    private int id;
    private String name;
    private int level;
    private Guild guild;
    private List<Bag> bags;
    private List<Boss> killedBosses;

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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Guild getGuild() {
        return guild;
    }

    public void setGuild(Guild guild) {
        this.guild = guild;
    }

    public List<Bag> getBags() {
        return bags;
    }

    public void setBags(List<Bag> bags) {
        this.bags = bags;
    }

    public List<Boss> getKilledBosses() {
        return killedBosses;
    }

    public void setKilledBosses(List<Boss> killedBosses) {
        this.killedBosses = killedBosses;
    }
    
    
}
