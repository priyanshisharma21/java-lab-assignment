# Assignment 3: Star and Number Patterns

## 1. Experiment Title

Star and Number Patterns in Java.

## 2. Aim

To write Java programs that print star and number patterns using nested loops.

## 3. Software / Tools Required

- Programming Language: Java
- JDK (Java Development Kit)
- IDE: IntelliJ IDEA / Eclipse / VS Code
- Any text editor (if IDE is not available)

## 4. Theory

The following concepts are used in this experiment:

1. **Nested Loops:** A loop inside another loop. The outer loop controls the rows and the inner loop controls the columns.
2. **System.out.print():** Prints text without moving to the next line.
3. **System.out.println():** Prints a blank line or moves the cursor to the next line, used at the end of each row.
4. **Pattern Logic:** The number of times the inner loop runs depends on the row number (`j <= i`) to form a triangle.

## 5. Algorithm / Procedure

### Question 1: Square of Stars

1. Start the program.
2. Run the outer loop for i = 1 to 4 (rows).
3. Run the inner loop for j = 1 to 4 (columns).
4. Print * in each step of the inner loop.
5. Move to the next line after each row.
6. Stop the program.

### Question 2: Right Triangle of Stars

1. Start the program.
2. Run the outer loop for i = 1 to 4.
3. Run the inner loop for j = 1 to i.
4. Print * in each step of the inner loop.
5. Move to the next line after each row.
6. Stop the program.

### Question 3: Number Triangle

1. Start the program.
2. Run the outer loop for i = 1 to 4.
3. Run the inner loop for j = 1 to i.
4. Print the value of j followed by a space.
5. Move to the next line after each row.
6. Stop the program.

### Question 4: Inverted Star Triangle

1. Start the program.
2. Run the outer loop for i = 4 down to 1.
3. Run the inner loop for j = 1 to i.
4. Print * in each step of the inner loop.
5. Move to the next line after each row.
6. Stop the program.

## 6. Input

The following values are used in the experiment:

**Question 1:**

```
No input required.
```

**Question 2:**

```
No input required.
```

**Question 3:**

```
No input required.
```

**Question 4:**

```
No input required.
```

## 7. Output

**Question 1:**

```
****
****
****
****
```

**Question 2:**

```
*
**
***
****
```

**Question 3:**

```
1 
1 2 
1 2 3 
1 2 3 4 
```

**Question 4:**

```
****
***
**
*
```

**Result:** All four pattern programs were successfully executed using nested loops.
