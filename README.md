# Simple Interest Calculator

## Overview
This project is a Simple Interest Calculator developed in Java. It uses a graphical user interface (GUI) created with Swing to interact with the user. The program calculates the simple interest based on user inputs: principal amount, rate of interest, and time period.

## How to Run
1. Compile the Java file:
   ```sh
   javac SimpleInterestCalculator.java
   ```
2. Run the compiled Java program:
   ```sh
   java SimpleInterestCalculator
   ```

## Main Components
- `SimpleInterestCalculator` class: Contains the entire logic for the GUI, input validation, interest calculation, and file saving.
- GUI components: Created using Swing for a user-friendly interface.

## Input Validation
- The program checks if the inputs are valid numbers and greater than zero.
- If the inputs are invalid, appropriate error messages are displayed to the user.

## File Saving
- The calculated interest along with the input values are saved to a file named "interest_result.txt".
