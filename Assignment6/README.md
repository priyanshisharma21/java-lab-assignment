# Assignment 6: Arrays: Reverse and Duplicates

## 1. Experiment Title

Arrays: Reverse and Duplicates in Java.

## 2. Aim

To write Java programs that print an array in reverse order, find the smallest element with its index, and find a repeated value.

## 3. Software / Tools Required

- Programming Language: Java
- JDK (Java Development Kit)
- IDE: IntelliJ IDEA / Eclipse / VS Code
- Any text editor (if IDE is not available)

## 4. Theory

The following concepts are used in this experiment:

1. **Reverse Traversal:** A loop that starts from the last index (`arr.length - 1`) and moves down to 0.
2. **Minimum Element:** The smallest value is tracked along with its index while traversing the array.
3. **Duplicate Detection:** Each element is compared with all elements after it using nested loops.
4. **break Statement:** Used to exit a loop as soon as the required result is found.
5. **boolean Variable:** Used as a flag to record whether a repeated value is found.

## 5. Algorithm / Procedure

### Question 1: Print Array in Reverse

1. Start the program.
2. Declare the array arr = {10, 20, 30, 40, 50}.
3. Run a loop from i = arr.length - 1 down to 0.
4. Print arr[i] in each step.
5. Stop the program.

### Question 2: Smallest Element and Index

1. Start the program.
2. Declare the array arr = {2, 5, 1, 8, 3, 4}.
3. Initialize smallest = arr[0] and index = 0.
4. Traverse the array from index 1.
5. If an element is smaller than smallest, update smallest and index.
6. Print smallest and its index.
7. Stop the program.

### Question 3: Find Repeated Value

1. Start the program.
2. Declare the array arr = {4, 9, 2, 9, 7} and a flag found = false.
3. Use an outer loop for i and an inner loop for j = i + 1.
4. If arr[i] equals arr[j], set found = true, store the value and stop.
5. If found, print the repeated value, otherwise print that there is none.
6. Stop the program.

## 6. Input

The following values are used in the experiment:

**Question 1:**

```
arr = {10, 20, 30, 40, 50}
```

**Question 2:**

```
arr = {2, 5, 1, 8, 3, 4}
```

**Question 3:**

```
arr = {4, 9, 2, 9, 7}
```

## 7. Output

**Question 1:**

```
50
40
30
20
10
```

**Question 2:**

```
Smallest: 1 at index 2
```

**Question 3:**

```
Repeated value: 9
```

**Result:** All three Java programs were successfully executed to demonstrate reverse traversal, finding the minimum, and detecting a repeated element in an array.
