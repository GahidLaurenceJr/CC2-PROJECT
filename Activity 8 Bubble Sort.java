
package bubblesort;


public class BubbleSort {

    
    public static void main(String[] args) {
      int arr[]=new int[] {2,4,3,5,7,4,6,9,0};
      
        System.out.println("Before Sorting: \n");
        for (int i=0; i<arr.length;i++){
          System.out.print(arr[i] + "");
        }
        BubbleSort(arr);
        System.out.println("\n");
        
        System.out.println("After Sorting: \n");
        for(int i=0;i<arr.length;i++){
          System.out.print(arr[i] + "");
            
        }
    } 
    public static void BubbleSort(int[]arr){
        int len=arr.length;
        int temp=0;
        
        for(int i=0;i<len;i++){
          for(int j=1;j<(len-1);j++){
            if (arr[j-1]>arr[j]){
                temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
            }
          }
        }
    }
}
