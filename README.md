# Data-Structures-and-Algorithms Study Guide
Data Structures Concepts and problems topic wise problems in Leet code 



TIME COMPLEXITY

It measures the amount of time an algorithm takes to complete as a function of the length of the input. It's an essential factor in determining how well an algorithm scales as the size of the input grows.

SPACE COMPLEXITY

This measures the amount of memory an algorithm uses as a function of the length of the input. It considers both the memory needed to  store the input and any additional memory required during the execution of the algorithm.


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

ASYMPTONIN NOTATION

BIG O Notation:

Big O describes the upper bound of an algorithm i.e showing the maximum time or space an algorithm will require. 

Example:

Consider Searching for an target element in array then

Best Case: The target is the first element, O(1).
Worst Case: The target is the last element or not present, O(n).

Since Big O focuses on the worst case, the time complexity of linear search is O(n).


Big Omega(Ω) Notation:

Big Omega Focuses on lower bound of an algorithm i.e best case scenario same consider above example Now, beasr-time Complexity is Ω(1)


Big Theta(Θ) Notation:

Theta notation describes the exact bound of an algorithm's time or space complexity. It provides both the upper and lower bounds, showing the average-case scenario. For linear search, if we consider the average case where the target is equally likely to be at any position:

Average Case: On average, the target will be found halfway through the array, Θ(n).

So average-case time complexity is Θ(n).


Now Lets Move onto Common Run times

1. O(1) -> Constant time

Simply put algorithms running time does not depend on input size.
Example:

Accessing an element in an array by index. so where ever the element may be either at start end or middle we can acces arr[i] thats it so, its constant time so O(1).

2. 0(log n) -> logarthmic time

The algorithm's runtime grows logarithmically with the input size.

Example of this Binary Search algorithm which donot search whole n but uses a technique to minimize search time from N to log n. we will learn more about this in the future.

3. O(n) -> Linear time
   
The algorithm's runtime grows linearly with the input size. example searching for an element in an array which is at nth position.

4. O(n log n) -> Log Linear time
   
Common in efficient sorting algorithms like merge sort and quicksort.

5. O(n^2) -> Quadratic time
   
The running time grows quadratically with the input size. Simply saying if we use  nested for loops
Simple sorting algorithms like bubble sort, insertion sort.


6. O(2^n) -> Exponential time
   
The running time doubles with each additional element in the input, typical in algorithms that solve problems by brute force.
Example: Recursive algorithms for the Fibonacci sequence.

7. O(n!) -> Factorial time

The running time grows factorially with the input size.
Example: Algorithms that generate all permutations of a string.

This is about the fundamental concepts of Asymptonic Notation.



Lets move on to SORTING Concept before we dig deep into Data Structures.

Most Common sorting Algorithms are Bubble sort, insertion sort, Selection sort, Merge sort, Quick Sort, Heap sort.

BUBBLE SORT:

Bubble sort goes through the array of numbers, and looks at each pair of adjacent numbers. Bubble sort will then place the lower number on the left, towards the beginning of the array, and the higher number on the right, towards the end. This process is repeated and bubble sort will continue to loop through the array until no swaps are made, thus leaving a sorted array. In every step the highest will be moved to right most position.

Bubble sort is Slow

Worst case time complexity is O(n^2)
Code is available in java in SrtingAlgorithms folder.

SELECTION SORT:

The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from the unsorted part and putting it at the beginning.

Selection sort is slow
Worst case time complexity is O(n^2).

INSERTION SORT:

Insertion sort works by building the final, sorted array one item at a time. The algorithm will iterate through the initial array, remove one element, and place it in its proper place as a part of the sorted list.

Insertion sort is also slow but mostly used among remaining quadratic time ones i.e. Bubble selection.
Worst Case time complexity is O(n^2).


MERGE SORT:

Merge sort is  known as a Divide and Conquer Algorithm

Merge sort operates by first breaking an array into its individual components. It then ‘pairs up’ an individual with another, putting them into their proper place (sorted) with reference to each other. Merge sort then continues to pair up each sublist of numbers and sort them in the process. This is continued until there is just one list remaining — the sorted array

Powerful sorting lgorithm
Worst case time complexity is just O(nlogn).


QUICK SORT:


First select a pivot number in the array,
Then sorting the other numbers by placing them before or after the pivot number respectively.
At this point, the pivot number is in the correct location, and the two groups of numbers (one on each side of the pivot number) still need to be sorted.
New pivot numbers are then chosen within the remaining subsets, and this process is repeated until no swaps are made.

Worst-case time complexity for quicksort is O(n²), although this is an algorithm that rarely falls into its worst-case performance, especially with minor amounts of customization. Typically the Big-O for quicksort is O(n log n). However, a worst case of O(n²) is a knock against it.



HEAP SORT:


Heapsort is, at its core, an upgraded version of selection sort. They are similar because heapsort breaks down the input data into two groups, sorted and unsorted, and builds the sorted group one number at a time.

Where they differ, is where heapsort uses, a heap, to build the unsorted group so its not blindly finding each number, one at a time. Heapsort adds the largest number from the unsorted group to the sorted group, then rebuilds the heap and repeats the process, adding the highest number to the sorted group.


Heapsort is yet another powerful worst-case O(n log n) algorithm. Meaning, at worst, it still outperforms all the simple algorithms and quicksort. That being said, heapsort is not a stable sort so choose wisely.

Heapsort also uses a fixed amount of auxiliary space to do the sorting, which is a big plus. Merge sort on the, on the other hand, uses more auxiliary space when there is more data.



SEARCHING


Linear search and Binary Search:

When we try to find an element in an array it takes O(n) time. but we can do that in O(log n) i.e Binary Search in this we break the array into two halves and then search in that half so like this it takes O(log n) time but there is also a catch for this i.e. the Array should be sorted before doing Binary search. 



























