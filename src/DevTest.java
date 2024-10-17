import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstName = "";
        int age = 0;
        int favNum = 0;
        double salary = 0;
    /*
        firstName = getNonZeroLenString(in,"Enter your first name");

        System.out.println("Fname is " + firstName);


        age = getInt(in, "enter your age: ");
        System.out.println("You said your age is " + age);

    salary = getDouble(in, "Enter your salary");
        System.out.println("Salary is " + salary);
     */
        favNum = getRangedInt(in, "Enter your favorite number", 1, 10);
        System.out.println("Fav num is " + favNum);

    }


    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retVal = "";

        do
        {
            System.out.print(prompt + ": ");
            retVal = pipe.nextLine();

            if(retVal.isEmpty()) {
                System.out.println("You must enter at least one character!");
            }

        }while(retVal.isEmpty());

        return retVal;
    }
    /**
     * gets an int value from the user at the console with no constraint
     *
     * @param pipe a scanner used to get the input
     * @param prompt the prompt that tells the user what to enter
     * @return an int of any value
     */
    public static int getInt(Scanner pipe, String prompt)
    {

        int retVal = 0;
        boolean done = false;
        String trash = "";
        do
        {
            System.out.print(prompt + ": ");
            if(pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid integer not " + trash);
            }


        }while(!done);

        return retVal;
    }


    /**
     * gets a double value from the user at the console with no constraint
     *
     * @param pipe a scanner used to get the input
     * @param prompt the prompt that tells the user what to enter
     * @return a double of any value
     */
    public static Double getDouble(Scanner pipe, String prompt)
    {

        double retVal = 0;
        boolean done = false;
        String trash = "";
        do
        {
            System.out.print(prompt + ": ");
            if(pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid Double not " + trash);
            }


        }while(!done);

        return retVal;
    }

    /**
     * gets an intereger from the user via console within a specified range
     * \
     * @param pipe The scanner to use for input
     * @param prompt the prompt to tell the user what is required
     * @param low The low inclusive low bound
     * @param high the inclusive high bound
     * @return an int within the specified bounds
     */

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {

        int retVal = 0;
        boolean done = false;
        String trash = "";
        do
        {
            System.out.print(prompt + "[" + low + " - " + high + "]:");
            if(pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                if(retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter a value within the range [" + low + " - " + high + "]:");
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid integer not " + trash);
            }


        }while(!done);

        return retVal;
    }
}


