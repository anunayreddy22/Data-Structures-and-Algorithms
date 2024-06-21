USING JAVA COLLECTIONS

  
import java.util.*;

public class HeapSortUsingSTL {

	// Function to perform the heap sort
	public static void heapSort(int[] arr)
	{
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		// Remove the top element of the max heap and place it at the end of the array.
		for (int i = 0; i < arr.length; i++) {
			maxHeap.offer(arr[i]);
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			arr[i] = maxHeap.poll();
		}
	}

	// Driver Code
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc,nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
     		}
		heapSort(arr);
	  	for(int i=0;i<n;i++){
     		 System.out.print(arr[i]+" ");
		}
	}
}
