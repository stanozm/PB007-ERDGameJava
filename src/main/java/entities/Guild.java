/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Date;
import java.util.List;

/**
 *
 * @author stano
 */
class Guild {
    private int id;
    private String name;
    private Player leader;
    private Date leaderBirthDate;
    private List<Player> members;

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

    public Player getLeader() {
        return leader;
    }

    public void setLeader(Player leader) {
        this.leader = leader;
    }

    public Date getLeaderBirthDate() {
        return leaderBirthDate;
    }

    public void setLeaderBirthDate(Date leaderBirthDate) {
        this.leaderBirthDate = leaderBirthDate;
    }

    public List<Player> getMembers() {
        return members;
    }

    public void setMembers(List<Player> members) {
        this.members = members;
    }
    
    
}
