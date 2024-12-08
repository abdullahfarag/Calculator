Features
•	User-friendly GUI built using Swing.
•	Supports basic arithmetic operations:
o	Addition (+)
o	Subtraction (-)
o	Multiplication (*)
o	Division (/)
•	Real-time display of calculations.
•	"Clear" button to reset the input and output.
________________________________________
System Requirements
•	Java Development Kit (JDK) version 8 or later.
•	Operating System: Windows, macOS, or Linux.
•	Minimum 2GB RAM.
________________________________________
Installation
1.	Clone or download the project from the repository.
2.	Open the project folder in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse, NetBeans) or a text editor.
3.	Compile and run the application:
bash
Copy code
javac Calculator.java
java Calculator
________________________________________
How to Use
1.	Launch the Application: Run the program using your IDE or terminal as described in the installation steps. A calculator window will appear.
2.	Enter Numbers:
o	Click the buttons 0-9 to enter numbers.
o	Use the . button for decimal numbers.
3.	Perform Operations:
o	Click any operator (+, -, *, /) to perform an operation.
o	After entering the second number, click = to calculate the result.
4.	Clear:
o	Press the C button to reset the input and output.
________________________________________
Arithmetic Operations
Button	Description
+	Adds two numbers.
-	Subtracts the second number from the first.
*	Multiplies two numbers.
/	Divides the first number by the second. Displays 0 if division by zero occurs.
=	Computes the result of the current operation.
C	Clears the input and resets the calculator.
________________________________________
Known Issues
1.	Unsupported Keys: The calculator does not support keyboard inputs; only button clicks are valid.
2.	Floating Point Precision: Results of some operations may have floating-point precision issues (e.g., 0.1 + 0.2 ≠ 0.3).
________________________________________
Troubleshooting
•	Issue: Calculator window does not appear after running.
Solution: Ensure the Java environment is correctly configured.
•	Issue: Incorrect result for operations.
Solution: Double-check your inputs and operations before pressing =.

