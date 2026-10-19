import java.util.Scanner;

public class BirthDate
{
    public  static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);


        int year = 0;
        int month = 0;
        int day = 0;


        year = SafeInput.getRangedInt(input, "Enter the year you were born", 1950, 2015);
        month = SafeInput.getRangedInt(input, "Enter the month you were born", 1, 12);

        //pick the right number of days for the month
        switch (month)
        {
            case 2:             // feburary
                day = SafeInput.getRangedInt(input, "Enter the day you were born", 1, 29);
                break;
            case 4, 6, 9, 11:       //april, june, sep, nov have 30 days
                day = SafeInput.getRangedInt(input, "Enter the day you were born", 1, 30);
                break;

            default:    // every other month had 31 days
                day = SafeInput.getRangedInt(input, "Enter the day you were born", 1, 31);
                break;

        }
        System.out.println("\nYour birth date is: " + month + "-" + day + "-" + year);

    }
}
