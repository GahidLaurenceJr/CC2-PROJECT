 

package array;

public class Array {

    public static void main(String[] args) {
       int[] sample = {3,9,15,20,65,23,18,4,2,14,21};
       int [] arrayeven=new int[sample.length];
       int[] arrayodd=new int [sample.length];
       
       int odd=0;
       int even=0;
      
        System.out.println("Elements of Array: ");
      for (int c=0; c<sample.length; c++){
          System.out.print(sample[c] + "\t");
      }
    
          
             System.out.println("");
             
             
             System.out.println("\nEven\nODD");   
             for (int c=0;c<sample.length;c++){
                 if (sample[c]%2==0){
                   arrayeven[even]=sample[c];
                     System.out.println(arrayeven[even]);
                     even++;
        }          
      }
              for(int c=0;c<sample.length;c++){
               if (sample[c]%2!=0){
                 arrayodd[odd]=sample[c];
                   System.out.println("\t" + arrayodd[odd]);
                   odd++;
          }
        }
      }
    }        
               
         
     
                  
         
      
    
         
      


