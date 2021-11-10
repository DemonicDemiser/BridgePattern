package com.company;

public class AppleFruit extends Fruits{
    public AppleFruit(Size size) {
        super(size);
    }

    @Override
    public void sell() {
        System.out.println("Selling apple" + size.writeSize());

    }
}
