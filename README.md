# ACME
 Programming exercise that returns an employee's payment based on the hours worked

 ## Overview
 The solution implemented solves the problem of getting the payment of an employee from a list of employees in a .txt file. The solution is implemented in JAVA programming language with no GUI, the inputs are provided via console.

 ## Architecture
 The solution's architecture may be described as a semi-MVC (no Views are implemented). You can find 3 Models: Employee, Personnel and Workday. The classes describe the necessary atributes that the data should have to solve the problem of ACME. We only interact with the data via the controllers implemented. The InputController manage the input process from .txt file into actual data allocated in memmory. The PersonnelController enable the user to interact with the data saved; in this case, to calculate the payment of the employees according the business logic. Finally, the Main class describe the way the controllers should be called and used to solve the problem.

## Solution
The conditions for the payment calculation can be described and abstracted as a matrix. With days of the week in an x-axis and hours of the day in a y-axis. This is the abstraction implemented for solving the problem, establishing areas between an imaginary cartesian plane where the value of the hour work changes, depending on its day (X) and hour of the day (Y) worked. Also, there should be considered some typical problems when dealing with .txt input files like a correctly substrings use, parse the text into a correct data type, etc. 

## Requirements
1. Install Java from it's official site: https://www.java.com/en/download/ . Select the correct version for your OS.
2. You can find a JAR Executable file to run. 
3. Be sure that the .txt file is in the same directory as the executable file, and make sure that it's name is "data.txt".
4. Follow the instructions of the program.

### Or

* Install in your computer an IDE of your preference. I highly recommend Eclipse IDE. Site: https://www.eclipse.org/downloads/.
* Be sure to download the Java SE Development Kit. Latest version: https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html.
* Download or clone this repository and open it in your IDE.
* Execute the Main.java archive. Be sure that the .txt file is in the same directory as the bin and src folders. Make sure that it's name is "data.txt".

## Code
If you want to explore the code, I highly recommend the use of the Eclipse IDE. You may find it here: https://www.eclipse.org/downloads/.

### Hope you enjoy using my solution!





