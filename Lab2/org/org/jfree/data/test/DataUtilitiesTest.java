package org.jfree.data.test;

import static org.junit.Assert.*;
import org.jfree.data.DataUtilities;
import org.jfree.data.DefaultKeyedValues;
import org.jfree.data.DefaultKeyedValues2D;
import org.jfree.data.KeyedValues;
import org.jfree.data.Values2D;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DataUtilitiesTest extends DataUtilities {

    private Values2D values2D;

    @Before
    public void setUp() throws Exception {
        DefaultKeyedValues2D testValues = new DefaultKeyedValues2D();
        values2D = testValues;
        testValues.addValue(1, 0, 0);
        testValues.addValue(4, 1, 0);
    }

    @After
    public void tearDown() throws Exception {
        values2D = null;
    }

    // Tests for calculateColumnTotal(Values2D data, int column)
    
    // Test case for valid data and column
    @Test
    public void testValidDataAndColumnColumnTotal() {
        // Assert that the sum of values in the specified column is correct
        assertEquals("Wrong sum returned. It should be 5.0", 5.0, DataUtilities.calculateColumnTotal(values2D, 0), 0.00000001d);
    }

    // Test case for null data
    @Test
    public void testNullDataColumnTotal() {
        // Check if an IllegalArgumentException is thrown when null data is provided
        try {
            DataUtilities.calculateColumnTotal(null, 0);
            fail("No exception thrown. The expected outcome was: a thrown exception of type: IllegalArgumentException");
        } catch (Exception e) {
            assertTrue("Incorrect exception type thrown", e.getClass().equals(IllegalArgumentException.class));
        }
    }

    // Test case for empty data
    @Test
    public void testEmptyDataColumnTotal() {
        // Assert that the sum of values in an empty dataset for a given column is zero
        assertEquals("Sum of values in column -47: 0 (as there are no rows in the empty dataset)",
                0.0, DataUtilities.calculateColumnTotal(new DefaultKeyedValues2D(), -47), 0.00000001d);
    }

    // Test case for out-of-range column index
    @Test
    public void testOutOfRangeColumnTotal() {
        // Check if the sum of values in a column with an out-of-range index is zero
        try {
            double sum = DataUtilities.calculateColumnTotal(values2D, -47);
            assertEquals("Sum of values in column -47: 0 (as the column index is out of range)",
                    0.0, sum, 0.00000001d);
        } catch (IndexOutOfBoundsException e) {
            fail("Unexpected IndexOutOfBoundsException: " + e.getMessage());
        }
    }

    // Tests for calculateRowTotal(Values2D data, int row)

    // Test case for valid data and row
    @Test
    public void testValidDataAndRowRowTotal() {
        // Assert that the sum of values in the specified row is correct
        assertEquals("Sum of values in row 3: 6-834=-828",
                -828.0, DataUtilities.calculateRowTotal(values2D, 3), 0.00000001d);
    }

    // Test case for null data
    @Test
    public void testNullDataRowTotal() {
        // Check if an IllegalArgumentException is thrown when null data is provided
        try {
            DataUtilities.calculateRowTotal(null, -47);
            fail("No exception thrown. The expected outcome was: a thrown exception of type: IllegalArgumentException");
        } catch (Exception e) {
            assertTrue("Incorrect exception type thrown", e.getClass().equals(IllegalArgumentException.class));
        }
    }

    // Test case for empty data
    @Test
    public void testEmptyDataRowTotal() {
        // Assert that the sum of values in an empty dataset for a given row is zero
        assertEquals("Sum of values in row -47: 0 (as there are no rows in the empty dataset)",
                0.0, DataUtilities.calculateRowTotal(new DefaultKeyedValues2D(), -47), 0.00000001d);
    }

    // Test case for out-of-range row index
    @Test
    public void testOutOfRangeRowTotal() {
        // Assert that the sum of values in a row with an out-of-range index is zero
        assertEquals("Sum of values in row -47: 0 (as the column index is out of range)",
                0.0, DataUtilities.calculateRowTotal(values2D, -47), 0.00000001d);
    }

    // Additional test case: Open to interpretation since case is not clearly specified
    @Test
    public void testOpenToInterpretation() {
        // Implement the test logic here based on the specific requirements
        // You may need to define the expected outcome for this case
        // For now, I'll leave this test case empty
    }

    // Test cases for createNumberArray method
    
    @Test
    public void testValidDataArray() {
        // Test that the method correctly converts a double array to a Number array
        double[] validData = {1.5, 2.7, 3.2, 4.8};
        Number[] expected = {1.5, 2.7, 3.2, 4.8};
        assertArrayEquals("Array of Number objects containing same values as input",
                expected, DataUtilities.createNumberArray(validData));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullDataArray() {
        // Test that the method throws an IllegalArgumentException when null data is provided
        DataUtilities.createNumberArray(null);
    }

    @Test
    public void testEmptyDataArray() {
        // Test that the method returns an empty array when provided with an empty data array
        double[] emptyData = {};
        Number[] expected = {};
        assertArrayEquals("An empty array of Number objects is returned",
                expected, DataUtilities.createNumberArray(emptyData));
    }

    // Test cases for createNumberArray2D method
    
    @Test
    public void testValidDataArray2D() {
        // Test that the method correctly converts a 2D double array to a 2D Number array
        double[][] validData = {
            {1.5, 2.7},
            {3.2, 4.8}
        };
        Number[][] expected = {
            {1.5, 2.7},
            {3.2, 4.8}
        };
        assertArrayEquals("An array of arrays of Number objects containing the same values as the input array",
                expected, DataUtilities.createNumberArray2D(validData));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullDataArray2D() {
        // Test that the method throws an IllegalArgumentException when null data is provided
        DataUtilities.createNumberArray2D(null);
    }

    @Test
    public void testEmptyDataArray2D() {
        // Test that the method returns an empty 2D array when provided with an empty 2D data array
        double[][] emptyData = {};
        Number[][] expected = {};
        assertArrayEquals("An empty array of arrays of Number objects is returned",
                expected, DataUtilities.createNumberArray2D(emptyData));
    }

    @Test
    public void testVaryingDimensionsDataArray2D() {
        // Test that the method correctly handles a 2D array with varying dimensions
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0},
            {6.0, 7.0, 8.0, 9.0}
        };
        Number[][] expected = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0},
            {6.0, 7.0, 8.0, 9.0}
        };
        assertArrayEquals("The returned array should have the same structure as the input array, with each element converted to a Number object",
                expected, DataUtilities.createNumberArray2D(data));
    }
    
    // Test cases for getCumulativePercentages method
    
    @Test
    public void testValidDataCumulativePercentages() {
        // Test that the method correctly calculates cumulative percentages for keyed values
        KeyedValues validData = new DefaultKeyedValues();
        ((DefaultKeyedValues) validData).addValue("Key 0", 5);
        ((DefaultKeyedValues) validData).addValue("Key 1", 9);
        ((DefaultKeyedValues) validData).addValue("Key 2", 2);

        KeyedValues expected = new DefaultKeyedValues();
        ((DefaultKeyedValues) validData).addValue("Key 0", 0.3125); // 5 / 16
        ((DefaultKeyedValues) validData).addValue("Key 1", 0.875);  // (5 + 9) / 16
        ((DefaultKeyedValues) validData).addValue("Key 2", 1.0);    // (5 + 9 + 2) / 16

        KeyedValues result = DataUtilities.getCumulativePercentages(validData);
        assertEquals("Cumulative percentages match expected values", expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullDataCumulativePercentages() {
        // Test that the method throws an IllegalArgumentException when null data is provided
        DataUtilities.getCumulativePercentages(null);
    }

    
}
