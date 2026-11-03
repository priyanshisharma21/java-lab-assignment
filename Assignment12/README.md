# Assignment 12: Insertion Sort

## 1. Experiment Title

Insertion Sort in Java.

## 2. Aim

To write Java programs to sort an array using insertion sort and to count the number of shifts performed.

## 3. Software / Tools Required

- Programming Language: Java
- JDK (Java Development Kit)
- IDE: IntelliJ IDEA / Eclipse / VS Code
- Any text editor (if IDE is not available)

## 4. Theory

The following concepts are used in this experiment:

1. **Insertion Sort:** Builds the sorted array one element at a time. Each element (the key) is picked and inserted into its correct position in the already sorted part on its left.
2. **Shifting:** Elements greater than the key are moved one position to the right to make space.
3. **while Loop:** `while (j >= 0 && arr[j] > key)` keeps shifting elements until the correct position is found.
4. **Time Complexity:** Worst case O(n^2) (reverse sorted array), best case O(n) (already sorted array).

## 5. Algorithm / Procedure

### Question 1: Insertion Sort

1. Start the program.
2. Declare the array arr = {7, 3, 5, 1}.
3. For i = 1 to n - 1, store arr[i] in key and set j = i - 1.
4. While j >= 0 and arr[j] > key, shift arr[j] to arr[j + 1] and decrease j.
5. Place key at arr[j + 1].
6. Print the sorted array.
7. Stop the program.

### Question 2: Insertion Sort on Another Array

1. Start the program.
2. Declare the array arr = {14, 3, 9, 21, 6}.
3. Apply insertion sort as in the previous question.
4. Print the sorted array.
5. Stop the program.

### Question 3: Count Shifts

1. Start the program.
2. Declare the array arr = {6, 5, 4, 3, 2, 1} and shifts = 0.
3. Perform insertion sort.
4. Increase shifts by 1 every time an element is shifted.
5. Print the total number of shifts.
6. Stop the program.

## 6. Input

The following values are used in the experiment:

**Question 1:**

```
arr = {7, 3, 5, 1}
```

**Question 2:**

```
arr = {14, 3, 9, 21, 6}
```

**Question 3:**

```
arr = {6, 5, 4, 3, 2, 1}
```

## 7. Output

**Question 1:**

```
Sorted: [1, 3, 5, 7]
```

**Question 2:**

```
Sorted: [3, 6, 9, 14, 21]
```

**Question 3:**

```
Shifts: 15
```

**Result:** All three Java programs were successfully executed to demonstrate insertion sort and the counting of shifts.
