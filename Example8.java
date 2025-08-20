package Lab4_if_else;
import java.util.Scanner;
public class Example8 {
    public static int quadrant(double x,double y){
        if(x > 0 && y > 0){
            System.out.print("The point is in the 1nd quadrant");
        }else if(x < 0 && y > 0){
            System.out.print("The point is in the 2nd quadrant");
        }else if(x < 0 && y < 0){
            System.out.print("The point is in the 3nd quadrant");
        }else if(x > 0 && y < 0){
            System.out.print("The point is in the 4nd quadrant");
        }else if(x == 0 || y == 0){
            System.out.print("The point is on an axis");
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap x: ");
        double x=sc.nextDouble();
        System.out.print("Nhap y: ");
        double y=sc.nextDouble();
        System.out.println(quadrant(x,y));
    }
}
