# DSA in JAVA Study Guide


Topics Covered so far in this Study guide

       1. Time and Space Complexity
       2. Sorting Algorithms
              1. Bubble sort
              2. Insertions sort
              3. Selection sort
              4. Merge sort
              5. Quick sort
              6. Heap sort
       3. Searching
              1. Linear search
              2. Binary Search
       4. Linked List (problems 92, 19 tuesdday)
          1. Fast and slow pointer
       5. Stack
       6.Queue
         1. Priority Queue
          

------------------------------------------------------------------------------------------------------------------------------------------------------


Learning Time complexity and Space Complexity is First and foremost thing when we learn not only DSA but any Programming Language so that we can optimize the solution when we need.

TIME COMPLEXITY

It measures the amount of time an algorithm takes to complete as a function of the length of the input. It's an essential factor in determining how well an algorithm scales as the size of the input grows.

SPACE COMPLEXITY

This measures the amount of memory an algorithm uses as a function of the length of the input. It considers both the memory needed to  store the input and any additional memory required during the execution of the algorithm.

------------------------------------------------------------------------------------------------------------------------------------------------------


Calculating Complexity

To calculate complexity, we typically use the following steps:

Identify the input size: Determine the parameter that affects the algorithm's performance the most (e.g., array size, number of nodes).
Count the operations: Calculate the number of operations performed in terms of the input size.
Simplify the expression: Remove lower-order terms and ignore constants.

To calculate the complexity of an algorithm, we focus on the dominant term in the algorithm's runtime expression. The dominant term is the one that grows the fastest as the input size increases. We ignore constants and lower-order terms because they become insignificant as the input size 
becomes very large.

Example:

Consider a simple algorithm that sums all the elements in an array. The loop runs n times (where n is the length of the array). Inside the loop, a constant-time addition operation is performed.Thus, the time complexity is O(n), meaning it scales linearly with the input size.

Calculating Space Complexity using the same sum algorithm. The space used by the algorithm consists of the input array and a few integer variables. The space for the input array is O(n).The space for the variables is O(1) (constant space).Thus, the space complexity is O(n).

Thus, this how you calculate Space and Time Complexity for algorithms, Now lets look into Asymptonic Notations which are basically used to describe the nature of complexity i.e behaviour of an algorithms as the input size increases.

------------------------------------------------------------------------------------------------------------------------------------------------------

ASYMPTONIC NOTATION

BIG O Notation:

Big O describes the upper bound of an algorithm i.e showing the maximum time or space an algorithm will require. 

Example:

Consider Searching for an target element in array then

Best Case: The target is the first element, O(1).
Worst Case: The target is the last element or not present, O(n).

Since Big O focuses on the worst case, the time complexity of linear search is O(n).

------------------------------------------------------------------------------------------------------------------------------------------------------

Big Omega(Ω) Notation:

Big Omega Focuses on lower bound of an algorithm i.e best case scenario same consider above example Now, best-time Complexity is Ω(1)

------------------------------------------------------------------------------------------------------------------------------------------------------

Big Theta(Θ) Notation:

Theta notation describes the exact bound of an algorithm's time or space complexity. It provides both the upper and lower bounds, showing the average-case scenario. For linear search, if we consider the average case where the target is equally likely to be at any position:

Average Case: On average, the target will be found halfway through the array, Θ(n).

So average-case time complexity is Θ(n).


------------------------------------------------------------------------------------------------------------------------------------------------------

Now Lets Move onto Common Run times

1. O(1) -> Constant time

Simply put algorithms running time does not depend on input size.
Example:

Accessing an element in an array by index. so where ever the element may be either at start end or middle we can acces arr[i] thats it so, its constant time so O(1).

------------------------------------------------------------------------------------------------------------------------------------------------------

2. 0(log n) -> logarthmic time

The algorithm's runtime grows logarithmically with the input size.

Example of this Binary Search algorithm which donot search whole n but uses a technique to minimize search time from N to log n. we will learn more about this in the future.

------------------------------------------------------------------------------------------------------------------------------------------------------

3. O(n) -> Linear time
   
The algorithm's runtime grows linearly with the input size. example searching for an element in an array which is at nth position.

------------------------------------------------------------------------------------------------------------------------------------------------------

4. O(n log n) -> Log Linear time
   
Common in efficient sorting algorithms like merge sort and quicksort.

------------------------------------------------------------------------------------------------------------------------------------------------------

5. O(n^2) -> Quadratic time
   
The running time grows quadratically with the input size. Simply saying if we use  nested for loops
Simple sorting algorithms like bubble sort, insertion sort.

------------------------------------------------------------------------------------------------------------------------------------------------------

6. O(2^n) -> Exponential time
   
The running time doubles with each additional element in the input, typical in algorithms that solve problems by brute force.
Example: Recursive algorithms for the Fibonacci sequence.

------------------------------------------------------------------------------------------------------------------------------------------------------

7. O(n!) -> Factorial time

The running time grows factorially with the input size.
Example: Algorithms that generate all permutations of a string.

This is about the fundamental concepts of Asymptonic Notation.

------------------------------------------------------------------------------------------------------------------------------------------------------

Lets move on to SORTING Concept before we dig deep into Data Structures.

Most Common sorting Algorithms are Bubble sort, insertion sort, Selection sort, Merge sort, Quick Sort, Heap sort.


BUBBLE SORT:

Bubble sort goes through the array of numbers, and looks at each pair of adjacent numbers. Bubble sort will then place the lower number on the left, towards the beginning of the array, and the higher number on the right, towards the end. This process is repeated and bubble sort will continue to loop through the array until no swaps are made, thus leaving a sorted array. In every step the highest will be moved to right most position.
      
               for (int i = 0; i < n - 1; i++){
                  for (int j = 0; j < n - i - 1; j++){
                      if (arr[j] > arr[j + 1]) {
                          int temp = arr[j];
                          arr[j] = arr[j + 1];
                          arr[j + 1] = temp;
                      }
                  }

Bubble sort is Slow

Worst case time complexity is O(n^2)
Code is available in java in SrtingAlgorithms folder.

------------------------------------------------------------------------------------------------------------------------------------------------------

SELECTION SORT:

The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from the unsorted part and putting it at the beginning.

               for (int i = 0; i < n - 1; i++) { 
                     // Find the minimum element in unsorted array 
                     int min_idx = i; 
                     for (int j = i + 1; j < n; j++) { 
                         if (arr[j] < arr[min_idx]) 
                             min_idx = j; 
                     } 
     
                     // Swap the found minimum element with the first 
                     // element 
                     int temp = arr[min_idx]; 
                     arr[min_idx] = arr[i]; 
                     arr[i] = temp; 
              }

Selection sort is slow
Worst case time complexity is O(n^2).

------------------------------------------------------------------------------------------------------------------------------------------------------

INSERTION SORT:

Insertion sort works by building the final, sorted array one item at a time. The algorithm will iterate through the initial array, remove one element, and place it in its proper place as a part of the sorted list.

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
Insertion sort is also slow but mostly used among remaining quadratic time ones i.e. Bubble selection.
Worst Case time complexity is O(n^2).

------------------------------------------------------------------------------------------------------------------------------------------------------

MERGE SORT:

Merge sort is  known as a Divide and Conquer Algorithm

Merge sort operates by first breaking an array into its individual components. It then ‘pairs up’ an individual with another, putting them into their proper place (sorted) with reference to each other. Merge sort then continues to pair up each sublist of numbers and sort them in the process. This is continued until there is just one list remaining — the sorted array

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

Powerful sorting lgorithm
Worst case time complexity is just O(nlogn).

------------------------------------------------------------------------------------------------------------------------------------------------------

QUICK SORT:


First select a pivot number in the array,
Then sorting the other numbers by placing them before or after the pivot number respectively.
At this point, the pivot number is in the correct location, and the two groups of numbers (one on each side of the pivot number) still need to be sorted.
New pivot numbers are then chosen within the remaining subsets, and this process is repeated until no swaps are made.

               int partition(int arr[], int low, int high)
            	{
            		int pivot = arr[high]; 
            		int i = (low-1); // index of smaller element
            		for (int j=low; j<high; j++)
            		{
            			// If current element is smaller than or
            			// equal to pivot
            			if (arr[j] <= pivot)
            			{
            				i++;
            
            				// swap arr[i] and arr[j]
            				int temp = arr[i];
            				arr[i] = arr[j];
            				arr[j] = temp;
            			}
            		}
            
            		// swap arr[i+1] and arr[high] (or pivot)
            		int temp = arr[i+1];
            		arr[i+1] = arr[high];
            		arr[high] = temp;
            
            		return i+1;
            	}
            
            
            	/* The main function that implements QuickSort()
            	arr[] --> Array to be sorted,
            	low --> Starting index,
            	high --> Ending index */
            	void sort(int arr[], int low, int high)
            	{
            		if (low < high)
            		{
            			/* pi is partitioning index, arr[pi] is 
            			now at right place */
            			int pi = partition(arr, low, high);
            
            			// Recursively sort elements before
            			// partition and after partition
            			sort(arr, low, pi-1);
            			sort(arr, pi+1, high);
            		}
            	}

Worst-case time complexity for quicksort is O(n²), although this is an algorithm that rarely falls into its worst-case performance, especially with minor amounts of customization. Typically the Big-O for quicksort is O(n log n). However, a worst case of O(n²) is a knock against it.

------------------------------------------------------------------------------------------------------------------------------------------------------

HEAP SORT:


Heapsort is, at its core, an upgraded version of selection sort. They are similar because heapsort breaks down the input data into two groups, sorted and unsorted, and builds the sorted group one number at a time.

Where they differ, is where heapsort uses, a heap, to build the unsorted group so its not blindly finding each number, one at a time. Heapsort adds the largest number from the unsorted group to the sorted group, then rebuilds the heap and repeats the process, adding the highest number to the sorted group.

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


Heapsort is yet another powerful worst-case O(n log n) algorithm. Meaning, at worst, it still outperforms all the simple algorithms and quicksort. That being said, heapsort is not a stable sort so choose wisely.

Heapsort also uses a fixed amount of auxiliary space to do the sorting, which is a big plus. Merge sort on the, on the other hand, uses more auxiliary space when there is more data.

------------------------------------------------------------------------------------------------------------------------------------------------------


SEARCHING



Linear search and Binary Search:


When we try to find an element in an array it takes O(n) time. but we can do that in O(log n) i.e Binary Search in this we break the array into two halves and then search in that half so like this it takes O(log n) time but there is also a catch for this i.e. the Array should be sorted before doing Binary search.

To understand how binary search works, imagine you are looking for a specific word in a dictionary. You could start by opening the dictionary to the middle page and looking for the word there. If the word is on that page,** you're done.** If the word is not on that page, you can then narrow down your search to either the first half of the dictionary or the second half of the dictionary.

Binary search can be applied to any problem that can be expressed as a search problem over a monotonic function. This means that if you can find a way to represent your problem as a monotonic function, then you can use binary search to solve it.


Binary Search (Iterative Approach):

             while (low <= high) {
                    int mid = low  + ((high - low) / 2);
                    if (sortedArray[mid] < key) {
                        low = mid + 1;
                    } else if (sortedArray[mid] > key) {
                        high = mid - 1;
                    } else if (sortedArray[mid] == key) {
                        index = mid;
                        break;
                    }


Binary Search(Recursive Approach):


            public int runBinarySearchRecursively(int[] sortedArray, int key, int low, int high) {
                   int middle = low  + ((high - low) / 2);
                                   
                      if (high < low) {
                          return -1;
                      }
                  
                      if (key == sortedArray[middle]) {
                          return middle;
                      } else if (key < sortedArray[middle]) {
                          return runBinarySearchRecursively(
                            sortedArray, key, low, middle - 1);
                      } else {
                          return runBinarySearchRecursively(
                            sortedArray, key, middle + 1, high);
                      }
               }

------------------------------------------------------------------------------------------------------------------------------------------------------

LINKED LISTS

Linked list is linear data structures which consists of a group of nodes in a sequence in which we store data in linear from!. you may think that array is also same right then why we need linked list so to get that doubt clarified lets look at the differences between them now.

In array we have to first define the size of the Array
Let's say:-

      int arr[] = new int[8]
      Array :- [10, 20, 15, 18, 16, 10, 20, 16]
      And each bit has it's memory address, where 1 bit size = 4, therefore 8 bit = 8 * 4 = 32 bit.

But linked list is dynamic, we don't have to define it's size.


![0077520a-2f86-46e2-b671-d80b66d0ce8a_1645804599 646257](https://github.com/anunayreddy22/Data-Structures-and-Algorithms/assets/156383908/8fb8ec52-5d8d-4aac-802f-935fe5a7ee1b)



as we see in thiss above picture each node in a linked has two values in it

      1. Data
      2. reference to the next node

Lets See Advantages and Disadvantages of Linked list


            Advantages                                              DisAdvantages

      1. Dynamic Nature                                      1. More memory usage due to address pointer
      2. Optimal insertion & deletion                        2. Slow traversal compared to arrays
      3. Stack's & queues can be easily implemented          3. No reverse traversal in singly linked list
      4. No memory wastage                                   4. No random access

      
Real life Applications
 
      Previous - n - next page in browser
      Image Viewer
      Music Player

------------------------------------------------------------------------------------------------------------------------------------------------------

Types of Linked List


Single Linked List

linked list in which each node points to the next node and the last node points to null



![bcf16f73-d3c8-4ec0-9157-b103fdb366ca_1645805815 6222517](https://github.com/anunayreddy22/Data-Structures-and-Algorithms/assets/156383908/b5327edd-4014-4652-bfda-6da147a38797)

------------------------------------------------------------------------------------------------------------------------------------------------------

Doubly Linked List

Linked list in which each node has two pointers, p and n, such that p points to the previous node and n points to the next node; the last node's n pointer points to null



![c387a2cd-dd81-403a-b683-3beb0372b1c0_1645806588 8987987](https://github.com/anunayreddy22/Data-Structures-and-Algorithms/assets/156383908/0b4da2e8-56f4-4d9b-aa7b-6d4b3b4693c8)

------------------------------------------------------------------------------------------------------------------------------------------------------

Circular Linked List

linked list in which each node points to the next node and the last node points back to the first node


![52dfe1b9-fbb5-4067-b045-6625b243c21a_1645806772 6599798](https://github.com/anunayreddy22/Data-Structures-and-Algorithms/assets/156383908/fe1b7d6d-9c13-4a81-a4d9-996043b5d16d)

------------------------------------------------------------------------------------------------------------------------------------------------------

Now Lets Move on to How create a Linked list

Code:

         class Node{
            int data;
            int next;
            node(int data){
               this.data = data;
            }
         }

         void main(){
            Node n1 = new Node(10);
            Node n2 = new Node(20);
            Node.head = n1;
            n1.next = n2;
            n2.next = null;
         }

Output:-

      --------       --------       --------
      |  10  |  -->  |  20  |  -->  |  30  |
      --------       --------       --------


------------------------------------------------------------------------------------------------------------------------------------------------------

Now so far we Know howw to create a linked list lets see how can we traverse in a linked list

Now, Lets Create a Linked list wiht 3 nodes or you can can repalce 3 with if n if the user is specifing the input  
Next, traverse and print all the nodes data.

Code:

      class Node {
          int data;
          Node next;
          Node(int data)
          {
              this.data = data;
              this.next = null;
          }
      }

     public class Main {
          public static void main(String[] args) {
              // Creating the head node
              Node head = new Node(1);
              Node current = head;
      
              // Adding more nodes using a loop
              for (int i = 2; i <= 3; i++) {
                  current.next = new Node(i);
                  current = current.next;
              }
      
              // Traverse the linked list
              traverse(head);
          }
      
          // Method to traverse the linked list
          public static void traverse(Node head) {
              Node current = head;
              while (current != null) {
                  System.out.print(current.data + " ");
                  current = current.next;
              }
              System.out.println();
          }
      }

Output:

      Output:-

         --------       --------       --------
         |  10  |  -->  |  20  |  -->  |  30  |  -->  X
         --------       --------       --------
         curr^
         
         print:- 10
         
         **************************************************
         
         --------       --------       --------
         |  10  |  -->  |  20  |  -->  |  30  |  -->  X
         --------       --------       --------
                        curr^
         
         print:- 10, 20
         
         **************************************************
         
         --------       --------       --------
         |  10  |  -->  |  20  |  -->  |  30  |  -->  X
         --------       --------       --------
                                       curr^
         
         print:- 10, 20, 30
         
         
         **************************************************
         
         --------       --------       --------
         |  10  |  -->  |  20  |  -->  |  30  |  -->  X
         --------       --------       --------
                                                    curr^


         Return answer :- 10, 20, 30

------------------------------------------------------------------------------------------------------------------------------------------------------

Now Lets Manipulate Linked list like inserting and delting a node from a Linked List


Inserting a Node into Linked List at the user specified position


Exaplanation:



![OIP](https://github.com/anunayreddy22/Data-Structures-and-Algorithms/assets/156383908/108c9266-f397-4b2c-a501-5cfb50509531)






              10->20->30->40->50-> Null

              Assume we are adding 60 at pos 3 i.e after 30
              
              Base Condition 
              
              if(pos==0) check if we are adding at first i.e at head then
              newnode.next = head  (After adding newlink only we should Brake the older Link)
              head = newnode  (assign newnode as head node)
              return;
              
              if not at first pos then all other follwoing code will handle it
              assign prev = head and then contninue for tarversing the linked list
              Traverse upto pos-1 (prev = prev.next)
              (After adding newlink only we should Brake the older Link)
              we will then point new node assume 60 to 40  i.e newnode.next = prev.next
              and the point prev to newnode i.e prev.next = newnode 


Sample Code:

              public static void main(String[] args){
                   .......code for creadting a linked list
                   System.out.println(insert(60,head,3)) // Calling function for inserting
              }

              void insert(int data, Node head, int pos){
                     Node newNode = new Node(data);

                     // Base Condition
                     if(pos==0){
                            newnode.next.head;
                            head = newnode;
                            return;
                     }
                     Node prev = head;
                     for(int i=0;i<pos-1;i++){
                            prev = prev.next;
                     }
                     newnode.next = prev.next;
                     prev.next = newnode;
                     
              }


Output:

              intially:10->20->30->40->50->null
              after insertion: 10>20->30->60->40->50->null;

------------------------------------------------------------------------------------------------------------------------------------------------------

Deletion of Node from a linked list:

Deleting a Node at a Specified position


![Untitleddesign](https://github.com/anunayreddy22/Data-Structures-and-Algorithms/assets/156383908/87d9a6c0-7fee-4c5b-a60e-fb6e64e2c7a9)







Explanation:

       Check for the base condition if the pos==0then assign head to the second node head = head.next 
       so intial head node linked will be no longer refernced and hence will be deleted
       if not then traverse using prev= prev.next  to the position before the pos we want to delete.
       then now if we assign this to directly to the node ater thee node we want to delete there will(using prev.next = prev.next.next)
       be no node referencing the node at pos hence it will be deleted


Sample Code: 

               public static void main(String[] args){
                   .......write code for creating a linked list
                   System.out.println(delete(head,3)) // Calling function for deleting
              }

              void delete(Node head,int pos){
                     //base Condition
                     if(pos==0){
                            head = head.next;
                     }
                     Node prev = head;
                     for(in ti=0;i<pos-1;i++){
                            prev = prev.next;
                     }
                     prev.next = prev.next.next;
              }


Output:

       Given :-
              --------       --------       --------        --------         --------
              |  5  |  -->   |  10  |  -->  | 15  |  -->    |  12  |  -->    |  14  |  -->    X
              --------       --------       --------        --------         --------
              
              delete 3rd element from linked list
              
              --------       --------       --------        --------         --------
              |  5  |  -->   |  10  |  -->  | 15  | |-X-    |  12   | |----> |  14  |  -->    X
              --------       --------       --------|       --------  |      --------
               
                                                    |-----------------|
              Final anser 5->10->15->14

              

------------------------------------------------------------------------------------------------------------------------------------------------------


***Floyd's Fast Pointer and Slow pointer or Hare and tortoise:


Let’s imagine a problem, there are 2 trains, one is faster running with 2x speed and the other is slower with x speed. They have to cover 100km distance. For sure, faster train is going to reach its destination earlier, when fast covers 100km, slower is going to cover half of its destination at that time, as it is moving at half the speed of faster train.


Sample Code:

                 while( fast!=null && fast.next!=null){
                       fast = fast.next.next; // moving fast by 2 step
                       slow = slow.next;
                   }
                   return slow;

Applications:

       Middle of the Linked list
       Nth node from the end of the Linked list
       Remove nth node from the end of the Linked list
       Detect loop in the Linked list
       Find the starting point of loop in the Linked list
       Remove Loop in the Linked List


Dummy Node:

A node which contains bogus value (-1) Create a dummy node you can get head easily just by returning dummy.nxt.

------------------------------------------------------------------------------------------------------------------------------------------------------


Stack

A Stack is a linear data structure that follows a particular order in which the operations are performed. Stack follows LIFO. LIFO implies that the element that is inserted last, comes out first.





![java-stack-data-structure](https://github.com/anunayreddy22/Data-Structures-and-Algorithms/assets/156383908/c2db5f2c-d350-49b1-8c6e-1974bb7618e9)



Operations on Stack

              Push: Adds an element to the top of the stack.
              Pop: Removes the top element from the stack.
              Peek: Returns the top element without removing it.
              IsEmpty: Checks if the stack is empty.
              IsFull: Checks if the stack is full (in case of fixed-size arrays).

Implemnetation of Stack:

       
       public class Samplecode {
           public static void main(String[] args) {
               // Create a new stack
               Stack<Integer> stack = new Stack<>();
       
               // Push elements onto the stack
               stack.push(1);
               stack.push(2);
               stack.push(3);
               stack.push(4);
       
               // Pop elements from the stack
               while(!stack.isEmpty()) {
                   System.out.println(stack.pop());
               }
           }
       }
              
Applications of Stack 

              Recursion
              Expression Evaluation and Parsing
              Depth-First Search (DFS)
              Undo/Redo Operations
              Browser History
              Function Calls

------------------------------------------------------------------------------------------------------------------------------------------------------

Monotonic Stack

A Monotonic stack is a variation of the traditional stack data structure that maintains either a strictly increasing or strictly decreasing order of elements. Unlike a regular stack, where elements can be inserted and removed freely, a monotonic stack enforces a specific order to its elements.

When to use Monotonic Stack Technique ?


       Next greater Element
       Next smaller Element
       Previous greater Element
       Previous smaller Element
       Lexicographically Smallest/Greatest
       Histogram Related Problems left and right boundaries for each bar

------------------------------------------------------------------------------------------------------------------------------------------------------

Queue:

A datstrcuture which follows FIFO order i.e first in first Out. the element which comes first goes out first  

![OIP](https://github.com/anunayreddy22/Data-Structures-and-Algorithms/assets/156383908/43aaacc3-2960-4742-866b-9dedfd331efa)


              a stack’s push function is similar to a queue’s enqueue function
              a stack’s pop function is similar to a queue’s dequeue function
              size and isEmpty are really helpful functions to have around in general

Applications of Queue

       Task scheduling in operating systems
       Data transfer in network communication
       Simulation of real-world systems (e.g., waiting lines)
       Priority queues for event processing queues for event processing

Implementing and Traversing Queue:

Sample Code:

              public class Main {
              
                  public static void main(String args[])
                  {
                      Queue<String> pq = new PriorityQueue<>();
              
                      pq.add("Anunay");
                      pq.add("Reddy");
                      pq.add("Kallem");
              
                      Iterator iterator = pq.iterator();
              
                      while (iterator.hasNext()) {
                          System.out.print(iterator.next() + " ");
                      }
                  }
              }



Queue Implementation using Linked List class

LinkedList is a class which is implemented in the collection framework which inherently implements the linked list data structure. It is a linear data structure where the elements are not stored in contiguous locations and every element is a separate object with a data part and address part. The elements are linked using pointers and addresses. Each element is known as a node. Due to the dynamicity and ease of insertions and deletions, they are preferred over the arrays or queues. Let’s see how to create a queue object using this class.


Code: 


       class Main{

           public static void main(String args[])
           {
               Queue<Integer> ll = new LinkedList<Integer>();
       
               ll.add(10);
               ll.add(20);
               ll.add(15);
       
               // Printing the top element and removing it from the LinkedList container
               System.out.println(ll.poll());
       
               // Printing the top element again
               System.out.println(ll.peek());
           }
       }

Deque:

Deque, which stands for Double Ended Queue, is a special type of queue that allows adding and removing elements from both front and rear ends.



![anod](https://github.com/user-attachments/assets/7e886ade-df12-454e-b9d0-26343cdbfaca)











