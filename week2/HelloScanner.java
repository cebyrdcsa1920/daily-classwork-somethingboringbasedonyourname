import java.util.Scanner;

public class HelloScanner
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Aye yo ma what's yo name?");
        String name = keyboard.nextLine();
        System.out.println("Wassup, " + name);
        keyboard.close();
    }
}