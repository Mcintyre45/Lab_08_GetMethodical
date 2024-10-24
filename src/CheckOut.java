import java.util.Scanner;
public class CheckOut
{
    public static void main(String[] args)
    {
       Scanner Double = new Scanner(System.in);
       double itemPrice = 0;
       double totalCost = 0;
       boolean done = false;
       do {

       itemPrice = SafeInput.getRangedDouble(Double, "Enter your item price: ", 0.50,10.00);
       totalCost = totalCost + itemPrice;
        System.out.printf ("The total cost is %-10.2f\n" ,totalCost);
       done=SafeInput.getYNConfirm(Double, "Do you want to add another item? ");
       }while(done);
    }
}
