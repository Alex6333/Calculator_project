import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double operand1;
        double operand2;
        char operation;
        char end = 'c';
        double result = 0;

        do {
            if (end == 'c') {
                System.out.println("Please, enter first number.");
                operand1 = scanner.nextDouble();
                System.out.println("Press '+' to addition," +
                        " '-' to subtraction," +
                        " '*' to multiplication," +
                        " '/' to division");
                operation = scanner.next().charAt(0);
            } else {
                operand1 = result;
                operation = end;
            }
            System.out.println("Please, enter second number.");
            operand2 = scanner.nextDouble();
            result = calculate(operand1, operand2, operation);
            System.out.println(operand1 + " " + operation + " " + operand2 + " = " + result);
            end = scanner.next().charAt(0);
        }
        while (end != 's');
    }

    public static double calculate(double operand1, double operand2, char operation) {
        if (operation == '+') {
            return (add(operand1, operand2));
        } else if (operation == '-') {
            return (sub(operand1, operand2));
        } else if (operation == '*') {
            return (mult(operand1, operand2));
        } else if (operation == '/') {
            return (div(operand1, operand2));
        } else {
            System.out.println("Error: wrong operation.");
        }
        return operation;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double mult(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {
        return a / b;
    }
}
