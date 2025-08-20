package Lab4_if_else;
import java.util.Scanner;
public class Example7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so dau tien: ");
        int n1=sc.nextInt();
        System.out.print("Nhap so thu 2: ");
        int n2=sc.nextInt();
        System.out.print("Nhap so thu 3: ");
        int n3=sc.nextInt();
        if(n1 > n2){
            System.out.println("The max number is: " +n1);
        }else if(n2 > n3){
            System.out.println("The max number is: " +n2);
        }else if(n3 > n1){
            System.out.println("The max number is: " +n3);
        }
    }
}
