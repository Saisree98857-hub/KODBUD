import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== SIMPLE CALCULATOR =====");

        // Taking first number
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        // Taking second number
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Showing operations
        System.out.println("\nChoose an operation:");
        System.out.println("+  : Addition");
        System.out.println("-  : Subtraction");
        System.out.println("*  : Multiplication");
        System.out.println("/  : Division");

        System.out.print("Enter operation: ");
        char operation = sc.next().charAt(0);

        double result;

        // Switch case for operations
        switch(operation) {

            case '+':
                result = num1 + num2;
                System.out.println("Result = " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result = " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result = " + result);
                break;

            case '/':
                if(num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid operation!");
        }

        sc.close();
    }
}