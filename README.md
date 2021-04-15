# numerical-methods-quadraticequation-exercise

This exercise is related to computer arithmetic:

## Computer Arithmetic / Machine Precision (1): Quadratic Equation Solver

Implement a class with the following properties:

- It implements the interface `QuadraticEquation` of the package `info.quantlab.numericalmethods.lecture.computerarithmetics`.
- It has a constructor consuming a `double[]` array of length 2 representing the coefficients a_0 and a_1 of x^2 + a_1 x + a_0 = 0.
- The methods of the interface are implemented according to their specification in the JavaDoc.

Then, run the corresponding unit test to test your implementation.

The main task of this exercise is to provide a *numerically stable* formula implementation of the method `getSmallestRoot`.
Depending on the value of the coefficients a_0 and a_1 the well known formulas for the root of the quadratic equation
may exhibit large *cancellation errors*.

