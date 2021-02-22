package by.com.junit_test;

import by.com.junit.QuadraticEquation;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Unit test for simple App.
 */
public class TestQuadraticEquation {
    @Test
    public void quadraticEquation_validCoefficients_TwoRoots() {
        double[] expected = new double[]{-5, -1};
        double[] actual = QuadraticEquation.quadraticEquation(1, 6, 5);
        assertArrayEquals(expected, actual, 0);
    }

    @Test
    public void quadraticEquation_validCoefficients_OneRoots() {
        double[] expected = new double[]{0};
        double[] actual = QuadraticEquation.quadraticEquation(1, 0, 0);
        assertArrayEquals(expected, actual, 0);
    }

    @Test
    public void quadraticEquation_validCoefficients_NoRoots() {
        double[] expected = new double[]{};
        double[] actual = QuadraticEquation.quadraticEquation(5, 1, 1);
        assertArrayEquals(expected, actual, 0);
    }
}