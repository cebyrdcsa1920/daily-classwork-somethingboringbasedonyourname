public class TempCon
{
    private double temp;
    private boolean isCelsius;

    public TempCon(double celsius)
    {
        temp = celsius;
        isCelsius = true;
    }
    public void convertToF()
    {

        if (isCelsius)
        {
            temp = temp * 9 / 5 + 32;
            isCelsius = false;
        }
    }

    public void convertToC()
    {
     if (!isCelsius)
     {
        temp = (temp - 32) * 5/9;
        isCelsius = true;
     }
    }
    public String toString()
    {
        String result = "The current temperature is " + temp + " degrees ";
        if (isCelsius)
        {
            result += "Celsius";
        }
        else
        {
            result += "Fahrenheit";
        }
        return result;
    }

    public static void main(String[] args)
    {
        TempCon myTemp = new TempCon(25.6);
        System.out.println(myTemp);
        myTemp.convertToF();
        System.out.println(myTemp);
        myTemp.convertToC();
        System.out.println(myTemp);
    }
}