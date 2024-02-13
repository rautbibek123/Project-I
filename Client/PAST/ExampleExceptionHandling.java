package Client.PAST;
import java.util.Scanner;

public class ExampleExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter numerator: ");
            double numerator = scanner.nextDouble();

            System.out.print("Enter denominator: ");
            double denominator = scanner.nextDouble();

            if (denominator == 0) {
                throw new ArithmeticException("Error: Division by zero is not allowed.");
            } else {
                double result = numerator / denominator;
                System.out.println("Result of division: " + result);
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        } finally {
            scanner.close();
        }
    }
}
