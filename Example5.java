package Lab4_if_else;
import java.util.Scanner;
public class Example5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int nam = sc.nextInt();
        switch(nam){
            case 2: System.out.println("Thu 2");break;
            case 3: System.out.println("Thu 3");break;
            case 4: System.out.println("Thu 4");break;
            case 5: System.out.println("Thu 5");break;
            case 6: System.out.println("Thu 6");break;
            case 7: System.out.println("Thu 7");break;
            case 8: System.out.println("Chu Nhat");break;
            default: System.out.println("Khong co ngay ");
        }
    }
}
