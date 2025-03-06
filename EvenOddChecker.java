import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        int userInput = getIntegerInput(); 
        String resultMessage = checkEvenOrOdd(userInput); 
        displayResult(resultMessage); 
    }
    public static int getIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer.");
            scanner.next();
            System.out.print("Enter an integer: ");
        }
        return scanner.nextInt();
    }
    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return number + " is an Even number.";
        } else {
            return number + " is an Odd number.";
        }
    }
    public static void displayResult(String message) {
        System.out.println(message);
    }
}