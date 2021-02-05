package com.company;

public class Car {

    private int id;
    private String model;
    private Double price;

    private CarState state;
    private CarColor color;

    @Override
    public String toString() {
        return
                "id=" + id +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", state=" + state +
                ", color=" + color
                ;
    }

    public Car(int id, String model, double price, CarState state, CarColor color) {
        this.id = id;
        this.model = model;
        this.price = price;
        this.state = state;
        this.color=color;
    }
    public Car() {

    }




    public void setPrice(Double price) {
        this.price = price;
    }

    public CarColor getColor() {
        return color;
    }

    public void setColor(CarColor color) {
        this.color = color;
    }



    public CarState getState() {
        return state;
    }

    public void setState(CarState state) {
        this.state = state;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
