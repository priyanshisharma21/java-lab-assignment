# Assignment 13: Strings: Methods and Palindromes

## 1. Experiment Title

Strings: Methods and Palindromes in Java.

## 2. Aim

To write Java programs that use String methods to find the length, search a character, change case, reverse a string, check a palindrome, and print all substrings.

## 3. Software / Tools Required

- Programming Language: Java
- JDK (Java Development Kit)
- IDE: IntelliJ IDEA / Eclipse / VS Code
- Any text editor (if IDE is not available)

## 4. Theory

The following concepts are used in this experiment:

1. **String:** A sequence of characters. Strings in Java are objects of the `String` class and are immutable.
2. **Common Methods:** `length()` returns the number of characters, `charAt(i)` returns the character at index i, `indexOf(c)` returns the first position of a character, `toUpperCase()` converts to capital letters, `substring(i, j)` returns the part of the string from i to j - 1.
3. **Reversing a String:** Characters are read from the last index to the first and joined together.
4. **Palindrome:** A string that reads the same forwards and backwards, for example "racecar".

## 5. Algorithm / Procedure

### Question 1: String Methods

1. Start the program.
2. Declare the String word = "Programming".
3. Print word.length().
4. Print word.indexOf('g').
5. Print word.toUpperCase().
6. Stop the program.

### Question 2: Reverse a String

1. Start the program.
2. Declare word = "Java" and an empty String reversed.
3. Run a loop from the last index to 0.
4. Add word.charAt(i) to reversed.
5. Print reversed.
6. Stop the program.

### Question 3: Palindrome Check

1. Start the program.
2. Declare word = "racecar" and a flag palindrome = true.
3. Compare charAt(i) with charAt(n - 1 - i) for the first half of the string.
4. If any pair does not match, set the flag to false and stop.
5. Print whether the word is a palindrome.
6. Stop the program.

### Question 4: All Substrings

1. Start the program.
2. Declare word = "abc".
3. Run an outer loop for i from 0 to length - 1.
4. Run an inner loop for j from i + 1 to length.
5. Print word.substring(i, j).
6. Stop the program.

## 6. Input

The following values are used in the experiment:

**Question 1:**

```
word = "Programming"
```

**Question 2:**

```
word = "Java"
```

**Question 3:**

```
word = "racecar"
```

**Question 4:**

```
word = "abc"
```

## 7. Output

**Question 1:**

```
Length: 11
Position of g: 3
Upper case: PROGRAMMING
```

**Question 2:**

```
Reversed: avaJ
```

**Question 3:**

```
racecar is a palindrome
```

**Question 4:**

```
a
ab
abc
b
bc
c
```

**Result:** All four Java programs were successfully executed to demonstrate String methods, reversing, palindrome checking, and substring generation.
