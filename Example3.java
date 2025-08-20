package Lab4_if_else;
import java.util.Scanner;
public class Example3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap nam: ");
        int n=sc.nextInt();
        if((n%4)==0 && !((n%100)==0) || (n%400)==0){
            System.out.println(n+ " is a lap year");
        }else{
            System.out.println(n+ " is not a lap year");
        }
    }
}
