# Assignment 4: Writing Functions

## 1. Experiment Title

Writing Functions in Java.

## 2. Aim

To write Java programs using methods (functions) to calculate combinations, permutations, and the larger of two numbers.

## 3. Software / Tools Required

- Programming Language: Java
- JDK (Java Development Kit)
- IDE: IntelliJ IDEA / Eclipse / VS Code
- Any text editor (if IDE is not available)

## 4. Theory

The following concepts are used in this experiment:

1. **Method:** A block of code that performs a specific task and can be reused. A method is declared with a return type, a name, and parameters.
2. **static Keyword:** Allows a method to be called from `main()` without creating an object.
3. **return Statement:** Sends a value back to the place where the method was called.
4. **Combination:** nCr = n! / (r! x (n - r)!)
5. **Permutation:** nPr = n! / (n - r)!
6. **Reusing Methods:** The `fact()` method is called from other methods to avoid repeating code.

## 5. Algorithm / Procedure

### Question 1: Combination nCr

1. Start the program.
2. Create a method fact(n) that returns the factorial of n.
3. Create a method nCr(n, r) that returns fact(n) / (fact(r) * fact(n - r)).
4. Call nCr(5, 2) from main().
5. Print the result.
6. Stop the program.

### Question 2: Permutation nPr

1. Start the program.
2. Create a method fact(n) that returns the factorial of n.
3. Create a method nPr(n, r) that returns fact(n) / fact(n - r).
4. Call nPr(5, 2) from main().
5. Print the result.
6. Stop the program.

### Question 3: Larger of Two Numbers

1. Start the program.
2. Create a method maxOf(a, b).
3. If a is greater than b, return a, otherwise return b.
4. Call maxOf(14, 9) from main().
5. Print the larger number.
6. Stop the program.

## 6. Input

The following values are used in the experiment:

**Question 1:**

```
n = 5
r = 2
```

**Question 2:**

```
n = 5
r = 2
```

**Question 3:**

```
a = 14
b = 9
```

## 7. Output

**Question 1:**

```
5C2 = 10
```

**Question 2:**

```
5P2 = 20
```

**Question 3:**

```
Larger: 14
```

**Result:** All three Java programs were successfully executed to demonstrate the use of methods, parameters, and return values.
