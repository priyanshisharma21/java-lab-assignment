# Assignment 10: Switch and ArrayList

## 1. Experiment Title

Switch and ArrayList in Java.

## 2. Aim

To write Java programs using the switch statement and the ArrayList class to store, access, update, and remove elements.

## 3. Software / Tools Required

- Programming Language: Java
- JDK (Java Development Kit)
- IDE: IntelliJ IDEA / Eclipse / VS Code
- Any text editor (if IDE is not available)

## 4. Theory

The following concepts are used in this experiment:

1. **switch Statement:** Selects one block of code to execute from many choices based on the value of a variable. `break` stops execution from falling to the next case and `default` runs when no case matches.
2. **ArrayList:** A resizable array from the `java.util` package. Unlike an array, its size can grow or shrink.
3. **Common Methods:** `add(x)` adds an element, `get(i)` returns the element at index i, `set(i, x)` replaces an element, `remove(i)` removes an element, `size()` returns the number of elements.
4. **import Statement:** `import java.util.ArrayList;` is required to use the ArrayList class.

## 5. Algorithm / Procedure

### Question 1: Switch Statement

1. Start the program.
2. Declare an integer day and initialize it with 3.
3. Use switch(day) with cases 1, 2, and 3 for Monday, Tuesday, and Wednesday.
4. Use default to print Invalid day.
5. Print the day name that matches.
6. Stop the program.

### Question 2: ArrayList Basics

1. Start the program.
2. Import java.util.ArrayList.
3. Create an ArrayList of Integer.
4. Add the elements 10, 20, 30, and 40.
5. Print the list, its size, and the element at index 2.
6. Stop the program.

### Question 3: Update and Remove in ArrayList

1. Start the program.
2. Create an ArrayList and add 10, 20, 30, and 40.
3. Replace the element at index 1 with 25 using set().
4. Remove the element at index 3 using remove().
5. Print the list and its size.
6. Stop the program.

## 6. Input

The following values are used in the experiment:

**Question 1:**

```
day = 3
```

**Question 2:**

```
Elements = 10, 20, 30, 40
```

**Question 3:**

```
Elements = 10, 20, 30, 40
set(1, 25)
remove(3)
```

## 7. Output

**Question 1:**

```
Wednesday
```

**Question 2:**

```
[10, 20, 30, 40]
Size: 4
Item at index 2: 30
```

**Question 3:**

```
[10, 25, 30]
Size: 3
```

**Result:** All three Java programs were successfully executed to demonstrate the switch statement and basic ArrayList operations.
