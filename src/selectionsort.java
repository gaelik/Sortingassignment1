import java.util.*;

//  https://youtu.be/xWBP4lzkoyM

public class selectionsort {
    public static int[] selectionsortmethod (int[] array)  {
 
        int n = array.length;
        
        System.out.println("Sorting using Selection Sort");
        // One by one move boundary of unsorted array
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in the original array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (array[j] < array[min_idx])
                    min_idx = j;
 
            // Swap the minimum element with the first
            // element
            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    	
        return array;
        
    }
}