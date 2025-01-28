import java.util.Scanner;

public class ArrayInputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Declare the array
        int[] array = new int[size];

        // Input the elements of the array
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) { // Correct loop condition
            array[i] = scanner.nextInt();
        }

        // Print the elements of the array
        System.out.println("The elements of the array are:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        scanner.close();
    }
}
