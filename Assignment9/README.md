# Assignment 9: Matrices: Rows and Columns

## 1. Experiment Title

Matrices: Rows and Columns in Java.

## 2. Aim

To write Java programs using two-dimensional arrays to print the first and last rows, find column sums, and count elements greater than a value.

## 3. Software / Tools Required

- Programming Language: Java
- JDK (Java Development Kit)
- IDE: IntelliJ IDEA / Eclipse / VS Code
- Any text editor (if IDE is not available)

## 4. Theory

The following concepts are used in this experiment:

1. **Two-Dimensional Array:** Data stored in rows and columns, accessed as `m[row][column]`.
2. **Row Access:** `m[0][j]` gives the first row and `m[2][j]` gives the last row of a 3 x 3 matrix.
3. **Column Sum:** The outer loop runs over columns and the inner loop runs over rows, so each column is added separately.
4. **Counting with a Condition:** A counter is increased whenever an element is greater than the given value.

## 5. Algorithm / Procedure

### Question 1: First and Last Row

1. Start the program.
2. Declare the 3 x 3 matrix m = {{1,2,3},{4,5,6},{7,8,9}}.
3. Print the elements m[0][j] for j = 0 to 2 as the first row.
4. Print the elements m[2][j] for j = 0 to 2 as the last row.
5. Stop the program.

### Question 2: Sum of Each Column

1. Start the program.
2. Declare the 3 x 3 matrix m = {{1,2,3},{4,5,6},{7,8,9}}.
3. For each column j, set sum = 0.
4. Add m[i][j] for i = 0 to 2.
5. Print the sum of each column.
6. Stop the program.

### Question 3: Count Elements Greater than 5

1. Start the program.
2. Declare the 3 x 3 matrix m = {{1,2,3},{4,5,6},{7,8,9}} and count = 0.
3. Traverse all elements using nested loops.
4. If an element is greater than 5, increase count by 1.
5. Print count.
6. Stop the program.

## 6. Input

The following values are used in the experiment:

**Question 1:**

```
m = {{1,2,3},{4,5,6},{7,8,9}}
```

**Question 2:**

```
m = {{1,2,3},{4,5,6},{7,8,9}}
```

**Question 3:**

```
m = {{1,2,3},{4,5,6},{7,8,9}}
```

## 7. Output

**Question 1:**

```
First row: 1 2 3 
Last row: 7 8 9 
```

**Question 2:**

```
Column 1 sum: 12
Column 2 sum: 15
Column 3 sum: 18
```

**Question 3:**

```
Values greater than 5: 4
```

**Result:** All three Java programs were successfully executed to demonstrate row and column operations on two-dimensional arrays.
