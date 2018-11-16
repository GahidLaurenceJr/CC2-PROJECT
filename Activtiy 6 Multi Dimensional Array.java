
package multidimensionalarray;

import java.util.Scanner;
public class MultiDimensionalArray {


    public static void main(String[] args) {
       Scanner array=new Scanner(System.in);
       
        System.out.println("Enter Row size");
            int x=array.nextInt();
        System.out.println("Enter Column size");
            int y=array.nextInt();
        System.out.println("Enter Elements:");
       
       String [][] names = new String[x][y];

        for (int c=0; c<x;c++){
            for (int f=0; f<y; f++){
            System.out.println("Row:" +c+ "Column:" +f+":");
            String e=array.next();
            names[c][f]=e;
            }
        }
        System.out.println("2D Array"); 
        for(int z=0; z<x; z++ ){
            for(int g=0; g<y; g++){
                System.out.print(names[z][g]+"\t");
            }
            System.out.println("");
        }

        
}
}




