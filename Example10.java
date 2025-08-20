package Lec4_if_else;
import java.util.Scanner;
public class Example10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap 1: ");
        int s1 = scanner.nextInt();
        System.out.print("Nhap 2: ");
        int s2 = scanner.nextInt();
        System.out.print("Nhap 3: ");
        int s3 = scanner.nextInt();
        if (s1 + s2 > s3 && s1 + s3 > s2 && s2 + s3 > s1) {
            if (s1 == s2 && s2 == s3) {
                System.out.println("This is an equilateral triangle.");
            } else if (s1 == s2 || s1 == s3 || s2 == s3) {
                System.out.println("This is an isosceles triangle.");
            } else {
                System.out.println("This is a scalene triangle.");
            }
        } else {
            System.out.println("These sides cannot form a triangle.");
        }
        scanner.close();
    }
}

