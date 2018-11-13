
package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Arraylist {

    
    public static void main(String[] args) {
      int[]sort={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
   
      List<Integer> Odd= new ArrayList<Integer>();
      List<Integer>Even= new ArrayList<Integer>();
      
      for (int a:sort){
          if ((a&1)==1){
              Odd.add(a);
          }
          else{
              Even.add(a);
          }
      }
        Collections.sort(Odd);
        Collections.sort(Even);
        System.out.println("Odd"+ Odd);
        System.out.println("Even"+ Even);
}
}