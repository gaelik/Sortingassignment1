import java.util.*;
public class bubblesort extends sortingmain{
	
	
	
	public void swap(int[] a, int x, int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
	public int[] bubblesortmethod(int a[]) {
		int count1 = 0;
		System.out.println("Sorting using bubble sort");
		// we need to track if we swapped or not to exit the recursive loops.
		boolean swaphappened = true;
		int k = 0;
		while((k<a.length - 1) && swaphappened) {
			swaphappened = false;
			k++;
			// goes thru the array, one element at the time and compare it with the next element
			for(int j = 0; j<a.length - k; j++) {
				//System.out.println("-before-" + a[j] + " " + a[j+1]);
				// if the second element is larger than the first element, swap the elements in the array.
				if(a[j] > a[j+1]) {
					swap(a, j, j+1);
					swaphappened = true;
				}
				//System.out.println("-after-" + a[j] + " " + a[j+1]);
			}
		}
		// returns the sorted array to the main class.
		return a;
	}
}
