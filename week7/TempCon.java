public class TempCon
{
    private double temp;
    private boolean isCelsius;

    public TemperatureConverter(double celsius)
    {
        temperature = celsius
        isCelsius = true;
    }
    public void convertToF()
    {

        if (isCelsius)
        {
            temp = temp * 9 / 5 + 32;
        }
    }
    public String toString()
    {
        String result = "The current temperature is " + temp + " degrees";
        if (isCelsius)
        {
            result += "Celsius";
        }
        else
        {
            result += "Fahrenheit";
        }
    }