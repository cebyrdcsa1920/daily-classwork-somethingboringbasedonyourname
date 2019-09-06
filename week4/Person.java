import java.awt.Color;

public class Person
{
    private String gender;
    private Color color;
    private Color hairColor;
    private String hairLength;
    int lengthInches;

    public Person()
    {
        gender = "Female";
        color = Color.YELLOW;
        hairLength = "Long";
        lengthInches = 0;
    }

    public Person(String name, String gender, Color color, Color hairColor, String hairLength, lengthInches);
    {
        this.name = name;
        this.gender = gender;
        this.color = Color;
        this.hairColor = Color;
        this.hairLength =  hairLength;
        this.lengthInches = lengthInches;
    }
    /*
    public Person()
    {
        gender = "Male";
        color = Color.BLACK;
        hairLength = "Short";
        lengthInches = 18;
    }
    public Person()
    {
        gender = "War Helicopter";
        color = Color.PINK;
        hairLength = "Bald";
        lengthInches = 2000;
    }
    */
}
