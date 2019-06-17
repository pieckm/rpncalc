# rpncalc
Simple RPN Calculator.  CalculatorTest class demonstrates features.

Given no input (null or empty list) or only an operator (+ or -), returns 0.0f;
Given one operand (e.g. 1.0), return that operand's value.
Given a well formatted intput (e.g. 1, 2, +), performs according to RPN.

Here to demonstrate that the actual evaluate method in Calculator makes no reference to the specific Token subclass.
Does not demonstrate 
- using refactoring to discover available Token subclasses
- parsing a string and using the 'matches' functions to generate the appropriate Token subclasses
