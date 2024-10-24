import java.util.Scanner;
public class BirthDateTime
{
    public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in);
      int birthYear = 0;
      int birthMonth = 0;
      int birthDay = 0;
      int birthHour = 0;
      int birthMinute = 0;

      birthYear = SafeInput.getRangedInt(in, "Enter your Birth year" ,1950,2015);
      birthMonth =SafeInput.getRangedInt(in, "Enter your Birth month" ,1,12);
      birthHour = SafeInput.getRangedInt(in, "Enter your Birth hour" ,1,24);
      birthMinute =SafeInput.getRangedInt(in, "Enter your Birth minute" ,1,59);
        System.out.println("Your Birth year is " + birthYear);
        System.out.println("Your Birth month is " + birthMonth);
        System.out.println("Your Birth hour is " + birthHour);
        System.out.println("Your Birth minute is " + birthMinute);
        switch (birthMonth)
        {
            // 29
            case 2:
                birthDay = SafeInput.getRangedInt(in, "Enter your Birth day" ,1,29);
                System.out.println("Your Birth day is " + birthDay);
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                birthDay = SafeInput.getRangedInt(in, "Enter your Birth day" ,1,31);
                System.out.println("Your Birth day is " + birthDay);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                birthDay = SafeInput.getRangedInt(in, "Enter your Birth day" ,1,30);
                System.out.println("Your Birth day is " + birthDay);
            break;
        }
    }
}
