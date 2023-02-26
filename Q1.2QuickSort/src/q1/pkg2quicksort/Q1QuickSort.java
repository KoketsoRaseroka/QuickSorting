/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q1.pkg2quicksort;

/**
 *
 * @author Koki
 */


public class Q1QuickSort {
    
    
    //method to switch two elements
   static void swap (int [] array, int a, int n){
       int qs = array[a];
       array[a] = array[n];
       array[n] = qs;
   }
   //method to print the arrays
       void ArrayPrint(int arrayp [],int e){
        
        
        int b; 
        for( b = 0; b< e;b++){
              System.out.print(arrayp[b]+ " ");
        }
    }

    
   static int partition(int [] array,int begin, int end){
       
       //declaring the pivot
        int pivot = array[end];
        
        
      //finds index of smaller element and right pivot position so far
        int index = (begin-1);
        
        
        for(int n = begin; n <= end-1; n++){
            
            //check if current element is less than the pivot
            if(array[n]<pivot){
                
                //index of smaller element increment
                index++;
                
                //swap the position
                swap(array,index,n); 
                
                        
                
            }
        }
    swap(array,index+1,end); 
    return index+1;
    }
     static void QuickSort(int [] array,int begin, int end){
       
        if(begin<end){
             
           
            int partition1 = partition(array,begin,end);
            
            
            //sorting elements before parition
            QuickSort(array,begin,partition1-1);
            //sorting elements after parition
            QuickSort(array,partition1+1,end);
             

            
        }
    }
    public static void main(String[] args) {
        //declaring array with values
      int  arrayqs [] = {4,2,6,5,3,9};
      //fetching array length
      int  i  = arrayqs.length;
      //calling the Q1QuickSort class
      Q1QuickSort values = new Q1QuickSort();
  
      System.out.println("The Array values before Quick Sort are : ");
       //printing array values before quick sort applied
      values.ArrayPrint(arrayqs ,i);
      System.out.println();
     System.out.println("The Array values after Quick Sort are : "); 
   //applying the QuickSort method to the array 
     QuickSort(arrayqs,0,i-1);
     //print array values after quick sort applied
     values.ArrayPrint(arrayqs ,i);
      
    }
    
}
