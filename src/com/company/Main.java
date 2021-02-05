package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Car car1 = new Car(2, "BMW", 50000.0, CarState.USED, CarColor.RED);
        Car car2 = new Car(3, "Audi", 100000.0, CarState.NEW, CarColor.BROWN);
        System.out.println(car1);
        System.out.println(CarColor.BROWN.name());
        System.out.println(CarColor.BROWN.ordinal());


        if (car1.getState().equals(CarState.NEW)) ;
        {
            System.out.println("false");
        }
        if (car2.getState().equals(CarState.NEW)) ;
        {
            System.out.println("new audi");
        }
        if (car1.getColor().equals(CarColor.RED)) ;
        {
            System.out.println("red bmw");

        }
        switch (car1.getColor()) {
            case RED:

            case BROWN:

        }
    }
}