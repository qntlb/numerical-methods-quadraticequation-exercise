package info.quantlab.numericalmethods.assignments.computerarithmetics.quadraticequation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import info.quantlab.numericalmethods.assignments.computerarithmetics.check.QuadraticEquationImplemenationChecker;
import info.quantlab.numericalmethods.lecture.computerarithmetics.quadraticequation.QuadraticEquationFactory;

public class QuadraticEquationAssignmentTest {

	@Test
	void test() {
		QuadraticEquationFactory quadraticEquationFactory = new QuadraticEquationAssignment();

		System.out.println("Checking the QuadraticEquationAssignment.");

		boolean success = QuadraticEquationImplemenationChecker.check(quadraticEquationFactory);
		
		if(!success) {
			System.out.println("Sorry, the test failed.");
		}
		else {
			System.out.println("Congratulation! You solved the exercise.");
		}

		System.out.println("_".repeat(79));

		if(!success) fail();
	}
}
