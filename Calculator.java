
package calculator;

import java.util.*;
public class Calculator {

    
    public static void main(String[] args) {
       Scanner calc=new Scanner(System.in);
        System.out.println("Enter First Value");
        double a=calc.nextInt();
        System.out.println("Enter Second Value");
        double b=calc.nextInt();
        System.out.println("Enter Arithmetic Operator");
        
        String Operator=calc.next();
        
            switch(Operator){
                case("+"):
                case("add"):
                    System.out.println("sum"+ (a+b));
                break;
                
                case("-"):
                case("Difference"):
                    System.out.println("Difference"+ (a-b));
                break;
                
                case("*"):
                case("Multiply"):
                    System.out.println("Multiply"+ (a*b));
                break;
                
                case("/"):
                case("Division"):
                    System.out.println("Division"+ (a/b));
                break;
                
                case("%"):
                case("Modulo"):
                    System.out.println("Modulo"+ (a%b));
                break;
            }
    }
    
}
