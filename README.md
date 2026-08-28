# CI245 Java Textbook Code

Student-facing code for *Programming Practice in Java*. Every folder here matches a
numbered section of the textbook, so section 1.2 in the book is the folder
`1.2 Getting User Input`.

## What's in a folder

- **`.java` files** — the code the book gives you. Some sections hand you a complete
  program, others hand you only a test program that you have to write the rest of.
- **`.txt` files** — the expected output for that section, copied from the book. Run
  your program, then compare what your console shows against the matching `.txt`.

A folder with only a `.txt` file and no `.java` file is a section where you write the
whole program yourself; the expected output is there so you know what you're aiming for.

## Reading the expected output files

The `.txt` files show a whole console session, so where a program prompts for input the
file contains both the prompt and the value that was typed:

```
Enter an int: 5
Your int: 5
```

Here `Enter an int: ` is what the program printed and `5` is what the user typed. Type
the same values and your output should match.

Some sections have several expected-output files because the book shows more than one
run — different inputs, error cases, or edge cases. The filename says which is which:

```
1.10 Solving Quadratic Equations/
    expected-output-two-real-roots.txt
    expected-output-one-real-root.txt
    expected-output-complex-roots.txt
```

Where a book section shows output that varies from run to run (anything random, timed,
or threaded), the filename says `one-possible-run` — match the shape of it, not the
exact values.

## Running the code

Most sections are plain console programs. From inside a section folder:

```
javac Example.java
java Example
```

The JavaFX sections need more setup than a bare `javac` — appendices A and B in the book
walk through it. Those sections are 15.1, all of chapter 16, all of chapter 17, 18.1,
18.2, 18.4, 21.8, and B.4.

## Notes

- Folder names use the book's section numbers, including the appendices (`A.4`, `D.8`,
  `E.5`, and so on).
- The GUI chapters have no expected-output files, since their result is a window rather
  than console text. The book shows screenshots for those.
- Compiled `.class` files are ignored by git — don't commit them.
