import java.util.*;

public class sortingmain {
	
	public static void displayarray(int[] array) {
		int n = array.length;
		System.out.println("Displaying sorted array");
		for ( int i=0; i< n; i++ ) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
	}
	
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		bubblesort bubblesort = new bubblesort();
		Random rand = new Random();
		System.out.println("This program will do random sorts");
		int input1, input2, count1=0, count2=0; int values=10;

		while(count1 != 2) {
			System.out.println("1. 10 numbers" + "\n2. 100 numbers " + "\n3. 1000 numbers ");
			input1 = reader.nextInt();
			switch(input1) {
				case 1:

					values=10;
//					while(num <= a.length) {
//						for(int i = 0; i<a.length; i++) {
//							a[i] = rand.nextInt(100)+1;
//							System.out.println(a[i]);
//							num++;
//						}
//					}
//				
					break;	
				case 2: 
					int value100 = rand.nextInt(100)+1;
					values = 100;
				
					break;	
			
				case 3:
					values = 1000;
					break;
				
			}
			int num = 0; 
			int[] a = new int[values];
			while(num <= values) {
				for(int i = 0; i<a.length; i++) {
					a[i] = rand.nextInt(100)+1;
					System.out.println(a[i]);
					num++;
				}
			}			
			
			int[] sortedarray;
			while(count2 != 2) {
				System.out.println("1. Bubble Sort" + "\n2. Insertion Sort" + "\n3. Selection Sort" + "\n4. Quick Sort" + "\n5. Merge Sort" + "\n6. Sequential and Binary search" );
				input2 = reader.nextInt();
				switch(input2) {
				case 1:
					sortedarray=bubblesort.bubblesortmethod(a);
					displayarray(sortedarray);
					break;
				case 2:
					sortedarray=insertionsort.insertionsortmethod(a);
					displayarray(sortedarray);
					break;
				case 3:
					sortedarray=selectionsort.selectionsortmethod(a);
					displayarray(sortedarray);
					break;
					
				case 4:
					sortedarray=quicksort.quicksortmethod(a);
					displayarray(sortedarray);
					break;
				case 5:
					sortedarray=mergesort.mergesortmethod(a);
					displayarray(sortedarray);
					break;
					
				case 6:
					
				}
			}
		}
	}

}
