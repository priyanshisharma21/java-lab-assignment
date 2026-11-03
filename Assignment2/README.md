# Assignment 2: Decisions and Loops with Numbers

## 1. Experiment Title

Decisions and Loops with Numbers in Java.

## 2. Aim

To write Java programs that use if-else statements and loops to check even or odd numbers, assign grades, check leap years, and calculate a factorial.

## 3. Software / Tools Required

- Programming Language: Java
- JDK (Java Development Kit)
- IDE: IntelliJ IDEA / Eclipse / VS Code
- Any text editor (if IDE is not available)

## 4. Theory

The following concepts are used in this experiment:

1. **if-else Statement:** Executes a block of code depending on whether a condition is true or false. `else if` is used to check multiple conditions.
2. **Relational Operators:** `==`, `!=`, `<`, `>`, `<=`, `>=` are used to compare values.
3. **Logical Operators:** `&&` (AND), `||` (OR), `!` (NOT) combine conditions.
4. **Modulus Operator:** `n % 2 == 0` checks whether a number is even.
5. **Leap Year Rule:** A year is a leap year if it is divisible by 4 but not by 100, or if it is divisible by 400.
6. **for Loop:** Repeats a block of code a fixed number of times.
7. **Factorial:** n! = 1 x 2 x 3 x ... x n.

## 5. Algorithm / Procedure

### Question 1: Even or Odd

1. Start the program.
2. Declare an integer n and initialize it with 27.
3. Check whether n % 2 is equal to 0.
4. If true, print that the number is even.
5. Otherwise, print that the number is odd.
6. Stop the program.

### Question 2: Grade Calculation

1. Start the program.
2. Declare an integer marks and initialize it with 83.
3. If marks is 90 or more, print Grade A.
4. Else if marks is 75 or more, print Grade B.
5. Otherwise, print Grade C.
6. Stop the program.

### Question 3: Leap Year

1. Start the program.
2. Declare an integer year and initialize it with 2024.
3. Check whether (year % 4 == 0 and year % 100 != 0) or year % 400 == 0.
4. If true, print Leap year.
5. Otherwise, print Not a leap year.
6. Stop the program.

### Question 4: Factorial

1. Start the program.
2. Declare n = 5 and fact = 1.
3. Run a for loop from i = 1 to n.
4. In each step, multiply fact by i.
5. Print the value of fact.
6. Stop the program.

## 6. Input

The following values are used in the experiment:

**Question 1:**

```
n = 27
```

**Question 2:**

```
marks = 83
```

**Question 3:**

```
year = 2024
```

**Question 4:**

```
n = 5
```

## 7. Output

**Question 1:**

```
27 is odd
```

**Question 2:**

```
Grade: B
```

**Question 3:**

```
Leap year
```

**Question 4:**

```
Factorial of 5 is 120
```

**Result:** All four Java programs were successfully executed to demonstrate decision making with if-else statements and repetition with loops.
