package com.haziqhassan;
public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;



    public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);

    this.eyes = eyes;
    this.legs = legs;
    this.tail = tail;
    this.teeth = teeth;
    this.coat = coat;


    }

    public void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() called");
    }

    public void run(){
        System.out.println("Dog.run() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move called");
        super.move(speed);
    }
}
