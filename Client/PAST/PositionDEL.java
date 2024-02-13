package Client.PAST;

import java.util.Scanner;

public class PositionDEL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array of size 10
        int[] array = new int[10];

        // Prompt the user to input 10 elements
        System.out.println("Enter 10 elements for the array:");
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }

        // Prompt the user to specify the position to delete
        System.out.print("Enter the position (0-9) to delete an element: ");
        int positionToDelete = scanner.nextInt();

        // Validate the position
        if (positionToDelete < 0 || positionToDelete >= 10) {
            System.out.println("Invalid position. Position should be between 0 and 9.");
        } else {
            // Delete the element at the specified position
            for (int i = positionToDelete; i < 9; i++) {
                array[i] = array[i + 1];
            }
            array[9] = 0; // Set the last element to 0

            // Print the updated array
            System.out.println("Array after deleting element at position " + positionToDelete + ":");
            for (int i = 0; i < 10; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

