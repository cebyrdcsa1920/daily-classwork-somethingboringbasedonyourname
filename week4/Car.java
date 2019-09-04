import java.awt.Color;

public class Car
{
    private String model;
    private Color color;
    private int numPassengers;
    private double amountOfGas;

    public Car()
    {
        model = "Mustang";
        color = Color.YELLOW;
        numPassengers = 69;
        amountOfGas = 1000;
    }
    public String toString()
    {
        return "This is my Mustang";
    }
}