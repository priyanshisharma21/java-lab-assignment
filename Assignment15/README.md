# Assignment 15: StringBuilder Methods

## 1. Experiment Title

StringBuilder Methods in Java.

## 2. Aim

To write Java programs that use the StringBuilder class to append, delete, and insert text in a string efficiently.

## 3. Software / Tools Required

- Programming Language: Java
- JDK (Java Development Kit)
- IDE: IntelliJ IDEA / Eclipse / VS Code
- Any text editor (if IDE is not available)

## 4. Theory

The following concepts are used in this experiment:

1. **StringBuilder:** A mutable sequence of characters. Unlike String, it can be changed without creating a new object each time, so it is faster for repeated changes.
2. **Common Methods:** `append(x)` adds text at the end, `insert(i, x)` adds text at position i, `deleteCharAt(i)` removes the character at index i, `length()` returns the number of characters.
3. **Method Chaining:** `sb.append(i).append(",")` calls several methods one after another on the same object.

## 5. Algorithm / Procedure

### Question 1: Append to StringBuilder

1. Start the program.
2. Create a StringBuilder with the text "Hello".
3. Append " World".
4. Print the StringBuilder and its length.
5. Stop the program.

### Question 2: Build a Comma Separated String

1. Start the program.
2. Create an empty StringBuilder.
3. Run a loop for i = 1 to 5 and append i followed by a comma.
4. Delete the last comma using deleteCharAt().
5. Print the result.
6. Stop the program.

### Question 3: Insert into StringBuilder

1. Start the program.
2. Create a StringBuilder with the text "Java".
3. Insert "Hello " at index 0.
4. Print the result.
5. Stop the program.

## 6. Input

The following values are used in the experiment:

**Question 1:**

```
Initial text = "Hello"
Append = " World"
```

**Question 2:**

```
Numbers = 1 to 5
```

**Question 3:**

```
Initial text = "Java"
Insert = "Hello "
```

## 7. Output

**Question 1:**

```
Hello World
Length: 11
```

**Question 2:**

```
1,2,3,4,5
```

**Question 3:**

```
Hello Java
```

**Result:** All three Java programs were successfully executed to demonstrate the StringBuilder methods append, insert, and deleteCharAt.
