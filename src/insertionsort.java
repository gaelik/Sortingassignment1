import java.util.*;

//  https://youtu.be/OGzPmgsI-pQ

public class insertionsort {
    public static int[] insertionsortmethod (int[] array)  {
    	int n = array.length;
    System.out.println("sorting the array using Insertion Sort");
        
    	for (int i=1; i<n; ++i)
    {
            int key = array[i];
            int j = i-1;


            
            /* If the element is greater than the key, then we move it ahead by one position ahead
              of their current position */

            while (j>=0 && array[j] > key)
            {
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = key;
        }
    return array;
    }
}




