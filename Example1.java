package lab4_if_else;
import java.util.Scanner;
public class Example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println("Nhap n: ");
        if(n % 2 ==0) {
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }
    }
}