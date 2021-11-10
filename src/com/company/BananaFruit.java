package com.company;

public class BananaFruit extends Fruits{
    public BananaFruit(Size size) {
        super(size);
    }

    @Override
    public void sell() {
        System.out.println("Selling banana" + size.writeSize());
    }
}
