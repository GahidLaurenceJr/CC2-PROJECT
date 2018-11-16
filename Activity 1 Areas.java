
package areas;
import java.util.*;
public class Areas {


    public static void main(String[] args) {
        Scanner area=new Scanner(System.in);
        
        System.out.println("Enter Radius: ");
        double a=area.nextDouble();
        System.out.println("Triangle Base: ");
        double b=area.nextInt();
        System.out.println("Triangle Height: ");
        double c=area.nextInt();
        System.out.println("Enter Sqaure Side: ");
        double d=area.nextInt();
        
        double circle=Math.PI*Math.pow(a,2);
        double triangle=c*b/2;
        double square=Math.pow(d, 2);
        
        System.out.println("Area of Circle" + circle);
        System.out.println("Area of Triangle" + triangle);
        System.out.println("Area of Square" + square);
        
    }
    
}
