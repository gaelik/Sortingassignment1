import java.util.*;

//  https://youtu.be/xWBP4lzkoyM

public class quicksort {
    
    	   /* This function takes last element as pivot,
        places the pivot element at its correct
        position in sorted array, and places all
        smaller (smaller than pivot) to left of
        pivot and all greater elements to right
        of pivot */
     int partition(int array[], int low, int high)
     {
         int pivot = array[high]; 
         int i = (low-1); // index of smaller element
         for (int j=low; j<high; j++)
         {
             // If current element is smaller than or
             // equal to pivot
             if (array[j] <= pivot)
             {
                 i++;
  
                 // swap array[i] and array[j]
                 int temp = array[i];
                 array[i] = array[j];
                 array[j] = temp;
             }
         }
  
         // swap array[i+1] and array[high] (or pivot)
         int temp = array[i+1];
         array[i+1] = array[high];
         array[high] = temp;
  
         return i+1;
     }
  
  
     /* The main function that implements QuickSort()
       array[] --> Array to be sorted,
       low  --> Starting index,
       high  --> Ending index */
     int[] sort(int array[], int low, int high)
     {
         if (low < high)
         {
             /* pi is partitioning index, array[pi] is 
               now at right place */
             int pi = partition(array, low, high);
  
             // Recursively sort elements before
             // partition and after partition
             sort(array, low, pi-1);
             sort(array, pi+1, high);
         }
         return array;
     }
     
     static int[] quicksortmethod(int[] array) {
    	 	
         int n = array.length;
         
         System.out.println("Sorting using Quick Sort");
         
         quicksort ob = new quicksort();
         ob.sort(array, 0, n-1);
    	 
    	 return array;
     }
    }
