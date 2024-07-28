import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        // Do-while loop
        do {
            System.out.print("Enter a number (negative number to exit): ");
            number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } while (number >= 0);

        System.out.println("You entered a negative number. Program terminated.");
        scanner.close();
    }
}
