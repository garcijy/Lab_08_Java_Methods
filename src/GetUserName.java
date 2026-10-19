import java.util.Scanner;

public class GetUserName
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        String firstName = "";
        String lastName = "";
        String userName = "";

        //getNonZeroLenString keeps asking until the user types something
        firstName = SafeInput.getNonZeroLenString(input,"Enter your first name");
        lastName = SafeInput.getNonZeroLenString(input,"Enter your last name");
        userName = SafeInput.getNonZeroLenString(input,"Enter a user name");

        //echo back
        System.out.println("\nName: " + firstName + " " + lastName);
        System.out.println("UserName: " + userName);




    }
}
