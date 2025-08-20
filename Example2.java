package Lab4_if_else;
import java.util.Scanner;
public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tuoi: ");
        int n = sc.nextInt();
        if(n>=0 && n<=12){
            System.out.println("Child");
        }else if(n>=13 && n<=19){
            System.out.println("Teenager");
        }else if(n>=20 && n<=59){
            System.out.println("Adult");
        }else if(n>=60){
            System.out.println("Senior");
        }
    }
}
