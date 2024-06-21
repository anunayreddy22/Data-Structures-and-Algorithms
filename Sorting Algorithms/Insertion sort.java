import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i] = sc.nextInt();
		}
	    for (int i = 1; i < n; ++i) {
          int key = arr[i];
            int j = i - 1;
            // Move elements greater than key to one position ahead
            // of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
	}
}
