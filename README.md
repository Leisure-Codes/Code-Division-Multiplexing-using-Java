# Code-Division-Multiplexing-using-Java
Implementing a Code Division Multiplexing Algorithm using Java with Static Input sequence of 6 Signals

## Detailed Explanation of the Code
### Key Components of the Code:
#### **1} Main Class: CDM**

The main class contains the main method, which is the entry point of the program.

#### **2} Function to Perform CDM and Recover Signals: recoverSignals**

Input: A list of chip sequences and a list of transmissions.

Output: A list of recovered signals.

Logic: For each transmission, calculate the sum of the dot products of the transmission with each chip sequence.
If the sum is greater than or equal to 0, the recovered bit is 1; otherwise, it is 0.
Add the recovered bit to the list of recovered signals.

#### **3} Function to Calculate Dot Product: calculateDotProduct**

Input: Two lists representing sequences.

Output: The dot product of the two sequences.

Logic: Iterate through the elements of the sequences, multiplying corresponding elements and summing the results.

#### **4} Main Method: main**

Define Chip Sequences:

Four chip sequences representing four stations (A, B, C, D).

Define Transmissions: Six transmissions (S1 to S6) to be processed.

Recover Signals: Call the recoverSignals function with the chip sequences and transmissions.

Print Recovered Signals: Print the recovered signals to the console.

#### **5} Input Code**
The input code is part of the main method where chip sequences and transmissions are defined. We don't need to change this unless you have specific sequences and transmissions you want to use.
