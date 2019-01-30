package com.company.com.java.java820190125.lambdas.Bean;

public class Apple {
    private String color;

    private Integer weight;

    public Apple(Integer weight,String color) {
        this.color = color;
        this.weight = weight;
    }
    public Apple(String color, Integer weight) {
        this.color = color;
        this.weight = weight;
    }public Apple( Integer weight) {

        this.weight = weight;
    }

    public Apple(Object weight){

    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
