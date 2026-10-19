import java.util.Scanner;

public class DevTest {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //method A: get NonZeroLenString
        String name = SafeInput.getNonZeroLenString(input, "Enter your name: ");
        System.out.println("You entered: " + name);

        //method B: getInt
        int age = SafeInput.getInt(input,"Enter you age");
        System.out.println("You entered: " + age);


        //method C: getDouble
        double price = SafeInput.getDouble(input,"Enter your price");
        System.out.println("You entered: " + price);

        //method D: getRangedInt
        int rating = SafeInput.getRangedInt(input,"Enter your rating", 1, 10);
        System.out.println("You entered: " + rating);

        //method E: getRangedDouble
        double gpa = SafeInput.getRangedDouble(input,"Enter your GPA", 0.0, 4.0);
        System.out.println("You entered: " + gpa);

        //method F: getYNConfirm
        boolean answer = SafeInput.getYNConfirm(input, "Is it October?");
        System.out.println("You answered: " + answer);

        //method G: getRegExString
        String code = SafeInput.getRegExString(input, "Enter a 3 letter code", "^[A-Z]{3}$");
        System.out.println("You entered: " + code);



    }
}
