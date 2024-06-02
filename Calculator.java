import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n Welcome to Simple Calculator!");
        System.out.println("\n ♥︎ Please enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("\n Please enter the second number:");
        double num2 = scanner.nextDouble();

        System.out.println("\n ♥︎ Please choose an Operation:");
        System.out.println("1. Addition (+) ");
        System.out.println("2. Subtraction (-) ");
        System.out.println("3. Multiplication (x) ");
        System.out.println("4. Division (/)");
        System.out.println("Please select an Operation:");
        System.out.println(" ");

        int choice = scanner.nextInt();

        double result = 0;

        switch (choice) {
            case 1:
                result = num1 + num2;
                break;

            case 2:
                result = num1 - num2;
                break;

            case 3:
                result = num1 * num2;
                break;

            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
             } else {;
                    System.out.println("Error division by 0!");
                    return;
            }
            break;
            default:
                System.out.println("Invalid Choice!");
            return;
        }

        System.out.println("The Result is: " + result);
        System.out.println("\n Thank You for using my Program! ♥︎ ");

    }
}