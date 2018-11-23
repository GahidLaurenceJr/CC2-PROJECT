package javaapplication42;

import java.util.Scanner;

public class JavaApplication42 {

    public static void main(String[] args) {
            display();
    }
    static void display(){
        Scanner fibo = new Scanner(System.in);
        String operation = operationInput();
        int []userArray = new int[arraySize()];
        
        System.out.println("\nEnter Elements:");
        for (int i = 0; i != userArray.length; i++){
            userArray[i] = fibo.nextInt();
        }
        System.out.println("");
        
        for (int i = 0; i != userArray.length; i++){
            System.out.print("f(" + userArray[i] + ")\t");
        }
        
        if (operation.equalsIgnoreCase("fibonacci")){
            System.out.println("\nThe Fibonacci is:");
            for (int i = 0; i != userArray.length; i++){
                System.out.print(fibonacci(userArray[i]) + "\t");
            }
        } else if (operation.equalsIgnoreCase("factorial")){
            System.out.println("\nThe Factorial is:");
            for (int i = 0; i != userArray.length; i++){
                System.out.print(factorial(userArray[i]) + "\t");
            }    
        }
    }
    static String operationInput(){
        Scanner arr = new Scanner(System.in);
        System.out.println("What do you want to get? Factorial/Fibonacci?");
        String ans = arr.next();
        
        if (!ans.equalsIgnoreCase("factorial") && !ans.equalsIgnoreCase("fibonacci")){
            return operationInput();
        }
        return ans;
    }
    static int arraySize(){ 
        Scanner fin = new Scanner(System.in);
        System.out.print("\nEnter size of array: ");
        int num = fin.nextInt();
        return num;
    }
    static int fibonacci(int n){
        switch (n) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return (fibonacci(n-1)) + (fibonacci(n-2));
                        }
    }
    static int factorial(int n){
        if (n<=1){
            return 1;
        } else {
            return n*factorial(n-1);
        }
    }
    
}
