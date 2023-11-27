package com.workintech.store.models;

public class Coke extends ProductForSale{
    private double size;
    private boolean hasSugar;
    public Coke(String type, double price, String description,double size,boolean hasSugar) {
        super(type, price, description);
        this.size = size;
        this.hasSugar=hasSugar;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString() + this);
    }

    @Override
    public String toString() {
        return "Coke{" +
                "size=" + size +
                ", hasSugar=" + hasSugar +
                '}';
    }
}
