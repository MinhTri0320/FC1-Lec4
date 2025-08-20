package Lab4_if_else;
import java.util.Scanner;
public class Example4 {
    public static void main(String[] args, int nam) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a ");
        double n = sc.nextDouble();
        System.out.print("Nhap b ");
        double n1 = sc.nextDouble();
        System.out.println("Chon phep (+,-,*,/): ");
        String ns=sc.nextLine();
        switch(nam){
            case '+': System.out.println(n+ " + " + n1 + " = " + (n + n1));break;
            case '-': System.out.println(n+ " - " + n1 + " = " + (n - n1));break;
            case '*': System.out.println(n+ " * " + n1 + " = " + (n * n1));break;
            case '/': if(n==0){
                 System.out.println("Error");
            }else{
                System.out.println(n+ " / " + n1 + " = " + ((double)n/n1));
                break;
            }
            default: System.out.println("Khong co gia tri");
        }
    }
}
