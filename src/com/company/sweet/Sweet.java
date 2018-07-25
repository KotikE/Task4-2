package com.company.sweet;

public abstract class Sweet {
    private String name;
    private int weight;
    private double price;
    public Sweet(){}

    public Sweet(String name, int weigth, double price) {
        this.name = name;
        this.weight = weigth;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeigth(int weigth) {
        this.weight = weigth;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString(){
        return "наименование - " + name + ", вес = " + weight + " г., цена = " + price + " руб.";
    }

   }

