import java.util.Scanner;

class Calculator {
    private double result;

    public Calculator(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                this.result = num1 + num2;
                break;
            case '-':
                this.result = num1 - num2;
                break;
            case '*':
                this.result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    this.result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                System.out.println("Error: Invalid operator!");
        }
    }

    public double getResult() {
        return result;
    }
}

public class homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        Calculator calculator = new Calculator(num1, num2, operator);
        double result = calculator.getResult();

        System.out.println("Result: " + result);

        scanner.close();
    }
}