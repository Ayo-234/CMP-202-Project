# Simple Interest Calculator
This Java code creates a simple interest calculator GUI application using the Swing library. 
The application allows users to input the principal amount, interest rate, and time period, and then calculates the simple interest based on these inputs. 
The calculated interest is displayed in the GUI and also saved to a file named "interest_result.txt".

Here's a breakdown of the code:

	• The main method creates a new instance of the SimpleInterestCalculator class and calls its createGUI method. 
       This method sets up the GUI components such as labels, text fields, buttons, and labels for displaying the calculated interest.

	• The createGUI method creates a new JFrame and sets its properties like size, layout, and default close operation. 
       It then adds various GUI components like labels, text fields, and buttons to the frame.

	• The calculateButton is an instance of JButton. When clicked, it triggers the actionPerformed method of the anonymous inner class ActionListener. 
      This method calls the calculateInterest method, passing the principal, rate, and time fields as arguments along with the result label.

	• The calculateInterest method takes the principal, rate, and time values from the text fields, checks if they are valid numbers, and then calculates the simple interest. 
      If any of the values are invalid, it displays an error message using JOptionPane. If the values are valid, it checks if the principal, rate, and time are greater than zero. 
      If any of them are not, it displays an error message. Otherwise, it calculates the interest and updates the result label with the calculated value. 
      It also calls the saveResultToFile method to save the calculated interest to a file.

	• The isValidDouble method checks if a given string can be converted to a valid double value. It uses a try-catch block to attempt parsing the string as a double. 
      If parsing is successful, it returns true; otherwise, it returns false.

	• The saveResultToFile method writes the principal, rate, time, and interest values to a file named "interest_result.txt". 
      It uses a try-catch statement to open a FileWriter and write the values to the file. If an IOException occurs during writing, it displays an error message using JOptionPane.

Overall, this code is a simple interest calculator GUI application that allows users to input principal, rate, and time values, calculates the interest, displays the result in the GUI, and saves the result to a file.