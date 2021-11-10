package com.company;

public abstract class Fruits {
    protected Size size;

    public Fruits(Size size){
        this.size = size;
    }

    public abstract void sell();
}
