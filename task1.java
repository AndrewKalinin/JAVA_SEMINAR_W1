package W1;

/**
 * 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! 
 */

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Enter the first number please: ");
        int i = iScanner.nextInt();
        System.out.printf("Triangular number is: %d\n", giveMeNumber(i));
        iScanner.close();
    }

    public static int giveMeNumber(int a) {
        return (a * (a + 1)) / 2;
    }
}