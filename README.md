# numerical-methods-quadraticequation-exercise

This exercise is related to computer arithmetic:

## Computer Arithmetic / Machine Precision (1): Quadratic Equation Solver

1) Implement a class that implements the interface `QuadraticEquation` of the package `info.quantlab.numericalmethods.lecture.computerarithmetics.quadraticequation`.

*Important*: The interface you have to implement is not part of this project. It is imported
from another project that is referenced by this project. To take a look at this interface,
you can select "Open Declaration" in your IDE (right-click on the interface name) or look here:
https://github.com/qntlb/numerical-methods-lecture/blob/master/src/main/java/info/quantlab/numericalmethods/lecture/computerarithmetics/quadraticequation/QuadraticEquation.java

The class implementing `QuadraticEquation` should allow solving the equation x^2 + p x + q = 0, finding the smallest root of this equation in a *numerically stable way*.

*Note*: As your task is to implement the interface, read the JavaDoc of that interface for a specification of what to do.

2) When done with 1), implement the method `createQuadraticEquation` of the class `QuadraticEquationAssignmentSolution`,
such that it allows to create an object of the class you have implemented in 1).

A class like `QuadraticEquationAssignmentSolution` is called a *Factory*, because it allows to create objects. It allows us to create an object of *your* class, without knowing the name of your class. We will use this method to test your implementation.

*Hint*: This is a trivial task. If your class in 1) is named `QuadraticEquationFromCoefficients` and if
it has a constructor `QuadraticEquationFromCoefficients(q,p)`, then the body of the implementation of the factory class
is just

```
  public QuadraticEquation createQuadraticEquation(double q, double p) {
    return new QuadraticEquationFromCoefficients(q,p);
  }
```

You can test your implementation by running the unit test in `src/test/java`.

## Main Task

The main task of this exercise is to provide a *numerically stable* formula implementation of the method `getSmallestRoot`.

Depending on the value of the coefficients q and p of the quadratic equation,
the well known formulas for the root of the quadratic equation may exhibit
large *cancellation errors*.


---


## Importing in Eclipse from GitHub

Import this git repository into Eclipse and start working.

- Click on the link to your repository (the link starts with qntlb/computational-finance… )
- Click on “Clone or download” and copy the URL to your clipboard.
- Go to Eclipse and select File -> Import -> Git -> Projects from Git **(with smart import)**.
- Select “Clone URI” and paste the GitHub URL from step 2.
- Select “master” or "main", then Next -> Next -> Finish.

Note: If you choose "Projects from Git" without the option "(with smart import)" you may experience that
the project is not imported into Eclipse, but it was successfully *checked out* (downloaded) via git, i.e. you
find the project files in your local git folder. In that case, you can import the project "as maven project"
(see below).

### Importing in Eclipse (as Maven Project)

If you checked out the git repository manually (`git clone`), then import
the local git folder as Maven Project;

- File -> Import -> Maven -> Existing Maven Projects
- Select the project folder in your *local* git folder.

---


## Notes

The project is configured to run automated Unit Test, JavaDoc, and Checkstyle upon a git push (via GitHub Actions).

### Code Style

We are checking your codestyle via *Checkstyle*. A failing checkstyle run is not impacting your grade, but you could try to improve. If desired, you can run the check locally on a command line via the maven command

```
mvn checkstyle:check 
```

(run from the project directory).

Checkstyle will report style issues of your code. If you like to clean up the formatting, you may use *Source -> Clean up...* in Eclipse.


### JavaDoc

We are generating documentation from the code via *JavaDoc*. A failing JavaDoc run is not impacting your grade, but you could try to improve your documentation.  If desired, you can generate the documentation locally on a command line via the maven command

```
mvn javadoc:javadoc 
```

If successful, the javadoc will then reside in `target/apidocs`. The project is configured to support
LaTeX in JavaDocs (use `\(` and `\)` to open and close a math environment).

Note that JavaDoc is HTML. This implies that an `<` needs to be written as `&lt;` and `>` needs to be written as `>`.


---


<script type="text/javascript"
  src="https://cdnjs.cloudflare.com/ajax/libs/mathjax/2.7.0/MathJax.js?config=TeX-AMS_CHTML">
</script>
<script type="text/x-mathjax-config">
  MathJax.Hub.Config({
    tex2jax: {
      inlineMath: [['$','$'], ['\\(','\\)']],
      processEscapes: true},
      jax: ["input/TeX","input/MathML","input/AsciiMath","output/CommonHTML"],
      extensions: ["tex2jax.js","mml2jax.js","asciimath2jax.js","MathMenu.js","MathZoom.js","AssistiveMML.js", "[Contrib]/a11y/accessibility-menu.js"],
      TeX: {
      extensions: ["AMSmath.js","AMSsymbols.js","noErrors.js","noUndefined.js"],
      equationNumbers: {
      autoNumber: "AMS"
      }
    }
  });
</script>

