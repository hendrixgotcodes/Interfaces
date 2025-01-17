package com.company;

import java.util.ArrayList;
import java.util.List;

public class classOne implements ISaveable
{
    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public ArrayList<String> write() {
        ArrayList<String> values = new ArrayList<>();
        values.add(0,this.name);
        values.add(1, ""+this.hitPoints);
        values.add(2,""+this.strength);
        values.add(3,this.weapon);

        return values;
    }

    @Override
    public void read(ArrayList<String> sth) {

        if (!sth.isEmpty())
        {
            this.name = sth.get(0);
            this.hitPoints = Integer.parseInt(sth.get(1));
            this.strength = Integer.parseInt(sth.get(2));
            this.weapon = sth.get(3);
        }

    }
}
