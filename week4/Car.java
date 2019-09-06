import java.awt.Color;

public class Car
{
    private String model;
    private Color color;
    private int numPassengers;
    private double amountOfGas;
    private final double mpg;

    public Car()
    {
        model = "Mustang";
        color = Color.YELLOW;
        numPassengers = 69;
        amountOfGas = 1000;
        mpg = 15.0;
    }
    /**
     * Drives the car the given distance. Subtracts gas from the tank.
     *
     * @param distance The distance driven in miles
     */
    public void drive(double distance)
    {
        amountOfGas -= distance / mpg;
    }

    public double getAmountOfGas()
    {
        return amountOfGas;
    }

    public String toString()
    {
        return "This is my Mustang";
    }
}