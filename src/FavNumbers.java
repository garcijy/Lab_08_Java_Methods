import java.util.Scanner;

public class FavNumbers
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);


        int favInt = 0;
        double favDouble =0;

        favInt = SafeInput.getInt(input,"Enter your favourite integer");
        favDouble = SafeInput.getDouble(input,"Enter your favourite double");

        System.out.println("\nYour favorite integer is: " + favInt);
        System.out.println("Your favourite double is: " + favDouble);
    }
}
