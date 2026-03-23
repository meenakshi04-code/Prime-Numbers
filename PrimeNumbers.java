import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        // Prompt the user for an integer
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        // Print all prime numbers up to the entered integer
        System.out.println("Prime numbers up to " + n + " are:");
        // Loop through numbers from 2 to n and check if each is prime
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        } 
        // Close the scanner object
        scanner.close();
    }
    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        // Handle edge cases for numbers less than 2
        if (num <= 1) {
            return false;
        }
        // Check divisibility from 2 to the square root of num
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false; // Not a prime number
            }
        }
        // If no divisors found, it's a prime number
        return true;
    }
}