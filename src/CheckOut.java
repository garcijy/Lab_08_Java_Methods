import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double price = 0;       //price of one item
        double total = 0;       //running total of all items
        boolean moreItems = false;  //true if user has another item

        //keep adding items while the user says Y
        do
        {
            price = SafeInput.getRangedDouble(input, "Enter the price of your item", 0.50, 10.00);
            total = total + price;
            moreItems = SafeInput.getYNConfirm(input, "Do you have more items?");
        }
        while (moreItems);

        //%.2f shows total with 2 decimal places
        System.out.printf("%nYour total cost is: $%.2f%n", total);

    }
}
