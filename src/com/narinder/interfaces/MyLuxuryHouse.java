package com.narinder.interfaces;

public class MyLuxuryHouse implements LuxuryHouse{
    @Override
    public void pool() {}
    @Override
    public void backyard() {}
    @Override
    public void parkings() {}
    @Override
    public void rooms() {}
    @Override
    public void washrooms() {}
    @Override
    public void livingArea() {}
    @Override
    public void kitchen() {
        System.out.println("Big Kitchen");
    }

    public static void main(String[] args) {
        HouseMap houseMap = new MyLuxuryHouse();
        houseMap.kitchen();

        MyLuxuryHouse myLuxuryHouse = new MyLuxuryHouse(){
            @Override
            public void kitchen() {
                System.out.println("This is a new kitchen i would like in my Luxury House");
            }
        };
        myLuxuryHouse.kitchen();
    }
}
