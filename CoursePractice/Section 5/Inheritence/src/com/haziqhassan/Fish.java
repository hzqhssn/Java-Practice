package com.haziqhassan;

public class Fish extends Animal {

    private int fins;
    private int gills;
    private int eyes;

    public Fish(String name, int brain, int body, int size, int weight, int fins, int gills, int eyes) {
        super(name, 1, 1, size, weight);
        this.fins = fins;
        this.gills = gills;
        this.eyes = eyes;
    }

    private void rest(){

    }

    private void moveMuscles(){

    }

    private void moveBackFin(){

    }
    private void swim(int speed){
       moveMuscles();
       moveBackFin();
       super.move(speed);
    }
}
