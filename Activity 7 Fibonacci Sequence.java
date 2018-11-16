//Final Activity 1
package FibonnacciSequence;

import java.util.*;

public class FibonacciSequence {
    
    static int fibonacci (int a){
    if (a==0|| a==1)
    return a;
    else
    return fibonacci(a-1)+ fibonacci(a-2);
}

    public static void main(String[] args) {
          System.out.println("Enter Number upto which FIBONACCI series to Print: ");
          int b=new Scanner(System.in).nextInt();
         
          System.out.println("\n" + "\n" + "The Fibonacci Series Upto"  + b  +" Number is:" + "\n" + "\n" + "\n");
          
          for (int c=0; c<=b; c++){
          System.out.print("f("+c+")" + "\t");
                 
        }
            System.out.println("");
         
            for (int d=0; d<=b;d++){ //outerloop
             
                for (int e=0; e<=d; e++){ //innerloop
                    System.out.print(fibonacci(e) + "\t");     
            }
            System.out.println("");   
       } 
    }       
}


    


    


