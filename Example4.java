package Lec4_if_else;
import java.util.Scanner;
public class Example4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so thu 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Nhap so thu 2: ");
        int num2 = scanner.nextInt();
        System.out.print("Chon dau (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        int result;
        switch (operator) {
            case '+': result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);break;
            case '-': result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);break;
            case '*': result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Bi Loi ");
                } else {
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                }
                break;
            default: System.out.println("Bi loi: khong gia tri ");
                break;
        }
        scanner.close();
    }
}