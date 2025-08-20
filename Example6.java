package Lab4_if_else;
import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n=sc.nextInt();
        if(n<=10 && n>=9){
            System.out.print("Excellent");
        }else if(n<=8.9 && n>=8){
            System.out.print("Good");
        }else if(n<=7.9 && n>=6.5){
            System.out.print("Fair");
        }else if(n<=6.4 && n>=5){
            System.out.print("Average");
        }else if(n<5){
            System.out.print("Fail");
        }
    }
}
