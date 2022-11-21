
import java.util.Scanner;

public class SqrtException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number;

        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a positive number: ");
            number = input.nextInt();
            if (number < 0)
                throw new ArithmeticException();
            System.out.println("The square root of " + number + " is " + Math.sqrt(number));
        } catch (ArithmeticException e) {
            System.out.println("Can't take square root of negative number.");
        }
    }
}
