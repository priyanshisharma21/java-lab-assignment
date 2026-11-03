# Assignment 8: Matrices: Transpose and Row Sums

## 1. Experiment Title

Matrices: Transpose and Row Sums in Java.

## 2. Aim

To write Java programs using two-dimensional arrays to fill a matrix, find its transpose, and calculate the sum of each row.

## 3. Software / Tools Required

- Programming Language: Java
- JDK (Java Development Kit)
- IDE: IntelliJ IDEA / Eclipse / VS Code
- Any text editor (if IDE is not available)

## 4. Theory

The following concepts are used in this experiment:

1. **Two-Dimensional Array:** An array of arrays, used to store data in rows and columns. `m[i][j]` refers to the element in row i and column j.
2. **Declaration:** `int[][] m = new int[3][4];` creates a matrix with 3 rows and 4 columns.
3. **Nested Loops:** The outer loop moves through rows and the inner loop moves through columns.
4. **Transpose:** The rows and columns of a matrix are interchanged, `t[j][i] = m[i][j]`.
5. **Row Sum:** All elements of one row are added together.

## 5. Algorithm / Procedure

### Question 1: Fill a 3 x 4 Matrix

1. Start the program.
2. Create a matrix m of size 3 x 4 and set value = 1.
3. Use nested loops to store value in m[i][j] and increase value by 1.
4. Use nested loops to print the matrix row by row.
5. Stop the program.

### Question 2: Transpose of a Matrix

1. Start the program.
2. Declare the 3 x 3 matrix m = {{1,2,3},{4,5,6},{7,8,9}}.
3. Create another 3 x 3 matrix t.
4. Store m[i][j] in t[j][i] using nested loops.
5. Print the matrix t.
6. Stop the program.

### Question 3: Sum of Each Row

1. Start the program.
2. Declare the 3 x 3 matrix m = {{1,2,3},{4,5,6},{7,8,9}}.
3. For each row, set sum = 0.
4. Add all elements of that row to sum.
5. Print the sum of each row.
6. Stop the program.

## 6. Input

The following values are used in the experiment:

**Question 1:**

```
Rows = 3
Columns = 4
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
1 2 3 4 
5 6 7 8 
9 10 11 12 
```

**Question 2:**

```
1 4 7 
2 5 8 
3 6 9 
```

**Question 3:**

```
Row 1 sum: 6
Row 2 sum: 15
Row 3 sum: 24
```

**Result:** All three Java programs were successfully executed to demonstrate two-dimensional arrays, matrix transpose, and row-wise sums.
