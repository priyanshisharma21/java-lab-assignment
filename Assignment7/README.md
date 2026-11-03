# Assignment 7: Counting Steps and Complexity

## 1. Experiment Title

Counting Steps and Complexity in Java.

## 2. Aim

To write Java programs that count the number of steps executed by loops and understand time complexity such as O(n), O(n^2), and O(log n).

## 3. Software / Tools Required

- Programming Language: Java
- JDK (Java Development Kit)
- IDE: IntelliJ IDEA / Eclipse / VS Code
- Any text editor (if IDE is not available)

## 4. Theory

The following concepts are used in this experiment:

1. **Time Complexity:** Describes how the number of steps of an algorithm grows as the input size n grows.
2. **O(n) Linear:** A single loop that runs n times.
3. **O(n^2) Quadratic:** Two nested loops that each run n times.
4. **O(log n) Logarithmic:** The problem size is halved in every step, for example `n = n / 2`.
5. **Step Counter:** A variable that is increased in every iteration to count the work done.

## 5. Algorithm / Procedure

### Question 1: Linear Steps O(n)

1. Start the program.
2. Initialize steps = 0.
3. Run a single loop for i = 1 to 10.
4. Increase steps by 1 in each iteration.
5. Print the number of steps.
6. Stop the program.

### Question 2: Quadratic Steps O(n^2)

1. Start the program.
2. Initialize steps = 0.
3. Run an outer loop for i = 1 to 10.
4. Run an inner loop for j = 1 to 10.
5. Increase steps by 1 in each inner iteration.
6. Print the number of steps.
7. Stop the program.

### Question 3: Logarithmic Steps O(log n)

1. Start the program.
2. Declare n = 1024 and count = 0.
3. While n is greater than 1, divide n by 2.
4. Increase count by 1 in each iteration.
5. Print the number of halving steps.
6. Stop the program.

## 6. Input

The following values are used in the experiment:

**Question 1:**

```
n = 10
```

**Question 2:**

```
n = 10
```

**Question 3:**

```
n = 1024
```

## 7. Output

**Question 1:**

```
Steps: 10
```

**Question 2:**

```
Steps: 100
```

**Question 3:**

```
Halving steps: 10
```

**Result:** All three Java programs were successfully executed to demonstrate step counting for O(n), O(n^2), and O(log n) time complexities.
