# Assignment 11: Bubble Sort and Selection Sort

## 1. Experiment Title

Bubble Sort and Selection Sort in Java.

## 2. Aim

To write Java programs to sort an array using bubble sort and selection sort, and to count the number of swaps in bubble sort.

## 3. Software / Tools Required

- Programming Language: Java
- JDK (Java Development Kit)
- IDE: IntelliJ IDEA / Eclipse / VS Code
- Any text editor (if IDE is not available)

## 4. Theory

The following concepts are used in this experiment:

1. **Sorting:** Arranging the elements of an array in ascending or descending order.
2. **Bubble Sort:** Repeatedly compares adjacent elements and swaps them if they are in the wrong order. After each pass, the largest element moves to the end.
3. **Selection Sort:** Repeatedly finds the smallest element in the unsorted part and places it at the beginning.
4. **Swapping:** Uses a temporary variable: `temp = a; a = b; b = temp;`
5. **Arrays.toString():** Converts an array into a printable string.
6. **Time Complexity:** Both algorithms take O(n^2) time.

## 5. Algorithm / Procedure

### Question 1: Bubble Sort

1. Start the program.
2. Declare the array arr = {5, 1, 4, 2, 8}.
3. Run an outer loop for i = 0 to n - 2.
4. Run an inner loop for j = 0 to n - 2 - i.
5. If arr[j] > arr[j + 1], swap them.
6. Print the sorted array.
7. Stop the program.

### Question 2: Selection Sort

1. Start the program.
2. Declare the array arr = {64, 25, 12, 22, 11}.
3. For each position i, assume arr[i] is the minimum.
4. Search the remaining elements for a smaller value.
5. Swap the minimum element with arr[i].
6. Print the sorted array.
7. Stop the program.

### Question 3: Count Swaps in Bubble Sort

1. Start the program.
2. Declare the array arr = {5, 1, 4, 2, 8} and swaps = 0.
3. Perform bubble sort.
4. Increase swaps by 1 every time two elements are swapped.
5. Print the total number of swaps.
6. Stop the program.

## 6. Input

The following values are used in the experiment:

**Question 1:**

```
arr = {5, 1, 4, 2, 8}
```

**Question 2:**

```
arr = {64, 25, 12, 22, 11}
```

**Question 3:**

```
arr = {5, 1, 4, 2, 8}
```

## 7. Output

**Question 1:**

```
Sorted: [1, 2, 4, 5, 8]
```

**Question 2:**

```
Sorted: [11, 12, 22, 25, 64]
```

**Question 3:**

```
Swaps: 4
```

**Result:** All three Java programs were successfully executed to demonstrate bubble sort, selection sort, and counting swaps.
