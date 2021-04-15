# numerical-methods-quadraticequation-exercise

This exercise is related to computer arithmetic:

## Computer Arithmetic / Machine Precision (1): Quadratic Equation Solver

1) Implement a class that implements the interface `QuadraticEquation` of the package `info.quantlab.numericalmethods.lecture.computerarithmetics`.

This class should allow to solve the equation x^2 + p x + q = 0, finding the smallest root of this
equation in a *numerically stable way*



2) When done with 1) implement the method `getQuadraticEquation` of the class `QuadraticEquationAssignment`,
such that it allows to create an object of the class you have implemented in 1).

A class like `QuadraticEquationAssignment` is called a Factory, because it allows to create objects. It basically allows us to create object of your class, without knowing the name of your class. We will use this method to test your implementation.

*Hint*: This is a trivial task. If you class in 1) is named `MyQuadraticEquation` and if
it has a constructor `MyQuadraticEquation(q,p)`, then body of the implementation of the factory class
is just

```
  public QuadraticEquation createQuadraticEquation(double q, double p) {
    return new MyQuadraticEquation(q,p);
  }
```


You can test your implementation by running the unit test in `src/test/java`.

# Main Task

The main task of this exercise is to provide a *numerically stable* formula implementation of the method `getSmallestRoot`.
Depending on the value of the coefficients q and p of the quadratic equation,
the well known formulas for the root of the quadratic equation may exhibit
large *cancellation errors*.

