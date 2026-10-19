import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String ssn = "";
        String mNumber = "";
        String menuChoice = "";

        //SSn: 3 digits - 2 - 4
        ssn = SafeInput.getRegExString(input, "Enter your SSN (###-##-####)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("SSn accepted: " + ssn);

        //UC Student ID #
        mNumber = SafeInput.getRegExString(input, "Enter your UC Student M number (M#####)", "^(M|m)\\d{5}$");
        System.out.println("UC Student M number accepted: " + mNumber);

        //menu choice
        menuChoice = SafeInput.getRegExString(input, "Enter a menu choice: [O]pen [S]ave [V]iew [Q]uit", "^[OoSsVvQq]$");
    }
}
