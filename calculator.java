import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner nani = new Scanner(System.in);

        double num1, num2, result;
        char operator;

        System.out.print("Enter first number: ");
        num1 = nani.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        operator = nani.next().charAt(0);

        System.out.print("Enter second number: ");
        num2 = nani.nextDouble();

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                System.out.println("Error: Invalid operator!");
        }

        nani.close();
    }
}

