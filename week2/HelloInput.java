public class HelloInput
{
    public static void main(String[] args)
    {
        if (args.length != 2)
        {
            System.out.println("Hey idiot you need your first AND last name");
        }
        else
        {
            String firstName = args[0];
            String lastName = args[1];
            System.out.println("Aye wassup " + firstName + " " + lastName);
     }
    }
}