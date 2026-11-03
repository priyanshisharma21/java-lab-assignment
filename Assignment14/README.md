# Assignment 14: Characters: Counting and Positions

## 1. Experiment Title

Characters: Counting and Positions in Java.

## 2. Aim

To write Java programs that traverse a string character by character to count vowels, count a particular character, and print each character with its index.

## 3. Software / Tools Required

- Programming Language: Java
- JDK (Java Development Kit)
- IDE: IntelliJ IDEA / Eclipse / VS Code
- Any text editor (if IDE is not available)

## 4. Theory

The following concepts are used in this experiment:

1. **char Data Type:** Stores a single character written in single quotes, for example `'a'`.
2. **charAt(i):** Returns the character at index i of a String. Indexing starts from 0.
3. **String Traversal:** A for loop from 0 to `length() - 1` visits every character.
4. **Vowels:** The characters a, e, i, o, u.
5. **Comparison:** Characters are compared using `==` and combined with the `||` (OR) operator.

## 5. Algorithm / Procedure

### Question 1: Count Vowels

1. Start the program.
2. Declare the String s = "programming" and vowels = 0.
3. Traverse the string using charAt(i).
4. If the character is a, e, i, o, or u, increase vowels by 1.
5. Print the number of vowels.
6. Stop the program.

### Question 2: Count a Character

1. Start the program.
2. Declare s = "programming" and count = 0.
3. Traverse the string.
4. If the character is 'g', increase count by 1.
5. Print the count.
6. Stop the program.

### Question 3: Characters with Index

1. Start the program.
2. Declare s = "hello".
3. Traverse the string using a for loop.
4. Print each index with its character.
5. Stop the program.

## 6. Input

The following values are used in the experiment:

**Question 1:**

```
s = "programming"
```

**Question 2:**

```
s = "programming"
```

**Question 3:**

```
s = "hello"
```

## 7. Output

**Question 1:**

```
Vowels: 3
```

**Question 2:**

```
Count of g: 2
```

**Question 3:**

```
0: h
1: e
2: l
3: l
4: o
```

**Result:** All three Java programs were successfully executed to demonstrate character-wise traversal and counting in a String.
