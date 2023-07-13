package day04.practice;


public abstract class Polygon {
    protected int numberOfSides;

    public Polygon(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public abstract double calculateArea();

    public abstract double calculateCircumference();
}
