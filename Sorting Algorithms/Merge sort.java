class MergetSort{
	void sort(int[] arr,int l,int r){
		if(l<r){
			int m = (l+r)/2;
			//sorting firt half
			sort(arr,l,m);
			//sorting second half
			sort(arr,m+1,r);
			//merge the sorted halves
			merge(arr,l,m,r);
		}
	}

	void merge(int[] arr,int l,int m,int r){
		// x and y will be sizes of two subarrays that are divided
		int x = m-l+1;
		int y = r-m;
		// create two temporary arrays
		int[] L = new int[x];
		int[] R = new int[y];
		
		// Copy data to temp arrays
        for (int i = 0; i <x; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j <y; ++j)
            R[j] = arr[m + 1 + j];
		
        // Merge the temp arrays
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < x && j < y) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
		 // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		MergeSort mg = new MergeSort();
		mg.sort(arr,0,n-1);
		
		}
}
