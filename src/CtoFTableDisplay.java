public class CtoFTableDisplay
{
    public static void main(String[] args)
    {
        System.out.println("Celsius\t\tFahrenheit");
        System.out.println("-------------------------");

        for (int c = -100; c <= 100; c++)
        {
            double fahrenheit = CtoF(c);
            System.out.printf("%6d\t\t%6.2f\n", c, fahrenheit);
        }
    }

    public static double CtoF(double Celsius)
    {
        return (Celsius * 9.0 / 5) + 32;
    }
}
