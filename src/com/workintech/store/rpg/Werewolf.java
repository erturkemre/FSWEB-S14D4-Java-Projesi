package com.workintech.store.rpg;

public class Werewolf extends Monster implements Bleedable{

    public Werewolf(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double attack() {
        return getDamage()+bleed();
    }

    @Override
    public double bleed() {
        return getDamage()*.25;
    }

    @Override
    public double bleed(int level) {
        return getDamage()*0.25*level;
    }
}
