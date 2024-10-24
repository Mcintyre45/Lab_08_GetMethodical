import java.util.Scanner;
public class FavNumbers
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int FavInt = 0;
        double FavDouble = 0;
        FavInt = SafeInput.getInt(in, "Enter your favorite integer");
        FavDouble = SafeInput.getDouble(in, "Enter your favorite Double");
        System.out.println("Your favorite integer is " + FavInt);
        System.out.println("Your favorite Double is " + FavDouble);
    }
}