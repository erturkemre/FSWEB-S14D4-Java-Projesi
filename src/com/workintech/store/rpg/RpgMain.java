package com.workintech.store.rpg;

public class RpgMain {
    public static void main(String[] args) {
        Monster troll = new Troll("Shrek", 1000, 60);
        System.out.println(troll.attack());

        Monster werewolf = new Werewolf("X", 600, 75);
        System.out.println(werewolf.attack());
    }
}
