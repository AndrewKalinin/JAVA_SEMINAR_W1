package W1;

/**
 * Реализовать простой калькулятор
 */

import java.util.Scanner;

public class task4 {
    
    private static Scanner scan;

static int scanNumber() {
        scan = new Scanner(System.in);
        int number = scan.nextInt();
        return number;
        
    }

    static String scanOperations() {
        scan = new Scanner(System.in);
        String operations = scan.nextLine();
        return operations;
        
    }

    static int getResult(String opr, int num1, int num2) {
        int result = 0;
        switch (opr) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;

            default:
                System.out.println("Enter operator: -, +, *, /");
                break;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println("Enter the first number: ");
        int num1 = scanNumber();
        System.out.println("Enter perator: -, +, *, /");
        String operations = scanOperations();
        System.out.println("Enter the second number: ");
        int num2 = scanNumber();
        int result = getResult(operations, num1, num2);
        System.out.printf("%d %s %d = %d", num1, operations, num2, result);

    }

}
