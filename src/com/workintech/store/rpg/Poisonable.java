package com.workintech.store.rpg;

public interface Poisonable {
    default double poison(){
        return 0.3;
    }
}
