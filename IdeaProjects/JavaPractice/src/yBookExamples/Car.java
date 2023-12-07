package yBookExamples;

abstract class Car {
    private double price;
    private String model;
    private String year;
    public abstract void goFast();
    public abstract void goUpHill();
    public abstract void impressNeighbors();
    //abstract classes are used to define a template for a group of subclasses
}
