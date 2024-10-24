import java.util.Scanner;
public class Reggie
{
    public static void main(String[] args)
    {
        Scanner String = new Scanner(System.in);
        String SSN = "";
        String mNumber = "";
        String mChoice = "";
        SSN = SafeInput.getRegExString(String,"Enter your social security Number " , "^\\d{3}-\\d{2}-\\d{4}$");
        mNumber = SafeInput.getRegExString(String, "Enter your UC M number ", "^(M|m)\\d{5}$");
        mChoice = SafeInput.getRegExString(String, "Enter a menu choice ", "^[OoSsVvQq]$");
        System.out.println("You Social Security Number is " + SSN);
        System.out.println("You UC M Number is " + mNumber);
        System.out.println("You menu Choice is " + mChoice);
    }
}