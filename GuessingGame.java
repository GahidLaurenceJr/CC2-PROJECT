
package guessinggame;

import java.util.*;
public class GuessingGame {

    public static void main(String[] args) {
        Scanner guess=new Scanner(System.in);
        System.out.println("Input a Number");
        int a=guess.nextInt();
        
        while(a<0||a>1000){ 
             System.out.println("Invalid Number");
             System.out.println("Input a Number");
             a=guess.nextInt();
        }
        
                
                
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        System.out.println("What is your guess");
        int b=guess.nextInt();
        
        while(b<0||b>1000){
            System.out.println("Your guess is correct" + guess);
            System.out.println("Input a Number");
            b=guess.nextInt();
            
        }  
        
        while(b!=a) {
            if(a%2==0){
                System.out.println("Hint: The Number is Even");           
             
            }
            else{
                System.out.println("Hint: The Number is Odd");
               
            }
         if (b<a){ System.out.println("The number you have entered is Higher! ");
           System.out.println("What is your guess");
          
       }
        else if (b>a){
           System.out.println("The number you have entered is Lower!");
           
           
       }
         System.out.println("What is your guess");
         b=guess.nextInt();
         if(b == a){
             
           System.out.println("Correct");}
        
        }
        
    
        
    }
    
}
