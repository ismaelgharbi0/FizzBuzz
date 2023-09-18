import java.util.Scanner;
public class Reduce {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        int i = 0;

        while (number > 0) {

            // Find out which numbers divide i.
            boolean divisibleBy2 = number % 2 == 0;


            // Print our appropriate result.
            if (divisibleBy2) {

                number = number / 2;
                i++;


            } else {

                number = number - 1 ;
                i++;

            }
        }
        System.out.println(i);
    }
}