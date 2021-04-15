package info.quantlab.numericalmethods.assignments.computerarithmetics.quadraticequation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import info.quantlab.numericalmethods.assignments.computerarithmetics.check.QuadraticEquationImplemenationChecker;
import info.quantlab.numericalmethods.assignments.computerarithmetics.quadraticequation.QuadraticEquationAssignment;
import info.quantlab.numericalmethods.lecture.computerarithmetics.quadraticequation.QuadraticEquationFactory;

public class QuadraticEquationAssignmentTest {

	@Test
	void test() {
		QuadraticEquationAssignment solution = new QuadraticEquationAssignment();

		System.out.println("Checking the QuadraticEquationAssignment.");

		boolean success = true;
		
		QuadraticEquationFactory quadraticEquationFactory = null;
		try {
			quadraticEquationFactory = solution.getQuadraticEquationFactory();
		}
		catch(Exception e) {
			System.out.println("Could not create a QuadraticEquationFactory.");
			System.out.println(e.getMessage());
			success = false;
		}
		
		if(quadraticEquationFactory != null) {
			System.out.println("Testing " + QuadraticEquationAssignment.class.getCanonicalName());
			success &= QuadraticEquationImplemenationChecker.check(quadraticEquationFactory);
		}
		
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
