package jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RangeTest {

	private Range rangeObjectUnderTest;
	@Before
	public void setUp() throws Exception {
		rangeObjectUnderTest = null;
	}

	@After
	public void tearDown() throws Exception {
	}

	

	@Test
	public void testGetLengthBothPositiveandNotEqual() {
		Range r2= new Range(4,9);
		assertEquals("getLength: Did not return the expected output",5.0,r2.getLength(),0.000000000001d);
	}
	@Test
	public void testGetLengthBothNegativeandEqual() {
		Range r3= new Range(-99,-99);
		assertEquals("getLength: Did not return the expected output",0.0,r3.getLength(),0.000000000001d);
	}
	@Test
	public void testGetLengthBothNegativeandNotEqual() {
		Range r4= new Range(-11,-4);
		assertEquals("getLength: Did not return the expected output",7.0,r4.getLength(),0.000000000001d);
	}
	@Test
	public void testGetLengthOnePositiveOneNegative() {
		Range r5= new Range(-5,3);
		assertEquals("getLength: Did not return the expected output",8.0,r5.getLength(),0.000000000001d);
	}
	
	
	@Test
	public void testconstrainbothbositivedataaboverange() {
		int UpperBound=10;
		int LowerBound=0;
		int Data=15;
		int ExpectedValue=10;
		
		rangeObjectUnderTest = new Range(LowerBound,UpperBound);
		
		assertEquals("constrain TC2: Did not return the expected output",ExpectedValue,rangeObjectUnderTest.constrain(Data),0.00000000001d);
	}
	@Test
	public void testconstrainbothbositivedatabelowrange() {
		int UpperBound=10;
		int LowerBound=0;
		int Data=-10;
		int ExpectedValue=0;
		
		rangeObjectUnderTest = new Range(LowerBound,UpperBound);
		
		assertEquals("constrain TC3: Did not return the expected output",ExpectedValue,rangeObjectUnderTest.constrain(Data),0.00000000001d);
	}	
	@Test
	public void testconstrainbothbositivedatainrange() {
		int UpperBound=10;
		int LowerBound=0;
		int Data=5;
		int ExpectedValue=5;
		
		rangeObjectUnderTest = new Range(LowerBound,UpperBound);
		
		assertEquals("constrain TC1: Did not return the expected output",ExpectedValue,rangeObjectUnderTest.constrain(Data),0.00000000001d);
	}	
	@Test
	public void testconstrainonepositiveonenegativedatainrange() {
		int UpperBound=10;
		int LowerBound=-5;
		int Data=0;
		int ExpectedValue=0;
		
		rangeObjectUnderTest = new Range(LowerBound,UpperBound);
		
		assertEquals("constrain TC4: Did not return the expected output",ExpectedValue,rangeObjectUnderTest.constrain(Data),0.00000000001d);
	}
	@Test
	public void testconstrainonepositiveonenegativedataaboverange() {
		int UpperBound=10;
		int LowerBound=-5;
		int Data=11;
		int ExpectedValue=10;
		
		rangeObjectUnderTest = new Range(LowerBound,UpperBound);
		
		assertEquals("constrain TC5: Did not return the expected output",ExpectedValue,rangeObjectUnderTest.constrain(Data),0.00000000001d);
	}
	@Test
	public void testconstrainonepositiveonenegativedatabelowrange() {
		int UpperBound=10;
		int LowerBound=-5;
		int Data=-100;
		int ExpectedValue=-5;
		
		rangeObjectUnderTest = new Range(LowerBound,UpperBound);
		
		assertEquals("constrain TC4: Did not return the expected output",ExpectedValue,rangeObjectUnderTest.constrain(Data),0.00000000001d);
	}
	@Test
	public void testconstrainbothnegativedatainrange() {
		int UpperBound=-10;
		int LowerBound=-100;
		int Data=-50;
		int ExpectedValue=-50;
		
		rangeObjectUnderTest = new Range(LowerBound,UpperBound);
		
		assertEquals("constrain TC4: Did not return the expected output",ExpectedValue,rangeObjectUnderTest.constrain(Data),0.00000000001d);
	}
	public void testconstrainbothnegativedataaboverange() {
		int UpperBound=-10;
		int LowerBound=-100;
		int Data=0;
		int ExpectedValue=0;
		
		rangeObjectUnderTest = new Range(LowerBound,UpperBound);
		
		assertEquals("constrain TC4: Did not return the expected output",ExpectedValue,rangeObjectUnderTest.constrain(Data),0.00000000001d);
	}
	public void testconstrainbothnegativedatabelowrange() {
		int UpperBound=-10;
		int LowerBound=-100;
		int Data=-300;
		int ExpectedValue=-100;
		
		rangeObjectUnderTest = new Range(LowerBound,UpperBound);
		
		assertEquals("constrain TC4: Did not return the expected output",ExpectedValue,rangeObjectUnderTest.constrain(Data),0.00000000001d);
	}
	
	@Test
	public void testgetCentralValueBothRangePositive() {
		int UpperBound=10;
		int LowerBound=1;
		double ExpectedValue=5.5;
		
		rangeObjectUnderTest = new Range(LowerBound,UpperBound);
		
		assertEquals("getCentralValue TC1: Did not return the expected output",ExpectedValue,rangeObjectUnderTest.getCentralValue(),0.00000000001d);
	}	
	@Test
	public void testgetCentralValueUpperPositiveLower0() {
		int UpperBound=10;
		int LowerBound=0;
		double ExpectedValue=5;
		
		rangeObjectUnderTest = new Range(LowerBound,UpperBound);
		
		assertEquals("getCentralValue TC2: Did not return the expected output",ExpectedValue,rangeObjectUnderTest.getCentralValue(),0.00000000001d);
	}	
	@Test
	public void testgetCentralValueUpperPositiveLowerNegative() {
		int UpperBound=10;
		int LowerBound=-10;
		double ExpectedValue=0;
		
		rangeObjectUnderTest = new Range(LowerBound,UpperBound);
		
		assertEquals("getCentralValue TC3: Did not return the expected output",ExpectedValue,rangeObjectUnderTest.getCentralValue(),0.00000000001d);
	}	
	@Test
	public void testgetCentralValueUpper0LowerNegative() {
		int UpperBound=0;
		int LowerBound=-10;
		double ExpectedValue=-5;
		
		rangeObjectUnderTest = new Range(LowerBound,UpperBound);
		
		assertEquals("getCentralValue TC4: Did not return the expected output",ExpectedValue,rangeObjectUnderTest.getCentralValue(),0.00000000001d);
	}	
	@Test
	public void testgetCentralValueBothRangeNegative() {
		int UpperBound=-10;
		int LowerBound=-20;
		double ExpectedValue=-15;
		
		rangeObjectUnderTest = new Range(LowerBound,UpperBound);
		
		assertEquals("getCentralValue TC5: Did not return the expected output",ExpectedValue,rangeObjectUnderTest.getCentralValue(),0.00000000001d);
	}	
	
	@Test
	public void testGetLengthBothRangePositive() {
		int UpperBound=10;
		int LowerBound=1;
		
		int ExpectedValue=9;
		
		rangeObjectUnderTest = new Range(LowerBound,UpperBound);
		
		assertEquals("getLength TC1: Did not return the expected output",ExpectedValue,rangeObjectUnderTest.getLength(),0.00000000001d);
	}
	@Test
	public void testGetLengthUpperPositiveNegative0() {
		int UpperBound=10;
		int LowerBound=0;
		
		int ExpectedValue=10;
		
		rangeObjectUnderTest = new Range(LowerBound,UpperBound);
		
		assertEquals("getLength TC2: Did not return the expected output",ExpectedValue,rangeObjectUnderTest.getLength(),0.00000000001d);
	}
	@Test
	public void testGetLengthUpperPositiveLowerNegative() {
		int UpperBound=10;
		int LowerBound=-10;
		
		int ExpectedValue=20;
		
		rangeObjectUnderTest = new Range(LowerBound,UpperBound);
		
		assertEquals("getLength TC3: Did not return the expected output",ExpectedValue,rangeObjectUnderTest.getLength(),0.00000000001d);
	}
	@Test
	public void testGetLengthUpper0LowerNegative() {
		int UpperBound=0;
		int LowerBound=-10;
		
		int ExpectedValue=10;
		
		rangeObjectUnderTest = new Range(LowerBound,UpperBound);
		
		assertEquals("getLength TC4: Did not return the expected output",ExpectedValue,rangeObjectUnderTest.getLength(),0.00000000001d);
	}
	@Test
	public void testGetLengthBothRangeNegative() {
		int UpperBound=-10;
		int LowerBound=-20;
		
		int ExpectedValue=10;
		
		rangeObjectUnderTest = new Range(LowerBound,UpperBound);
		
		assertEquals("getLength TC5: Did not return the expected output",ExpectedValue,rangeObjectUnderTest.getLength(),0.00000000001d);
	}
	
	@Test
	public void testintersectsBothRangePositiveNewRangeFullyInside() {
		int UpperBound=10;
		int LowerBound=1;
		int newUpper=9;
		int newLower=1;
		
		rangeObjectUnderTest = new Range(LowerBound,UpperBound);
		
		assertTrue("intersects TC1: Did not return the expected output",rangeObjectUnderTest.intersects(newLower, newUpper));
	}
	@Test
	public void testintersectsBothRangePositiveNewRangeSlightlyInsideAbove() {
		int UpperBound=10;
		int LowerBound=1;
		int newUpper=20;
		int newLower=9;
		
		rangeObjectUnderTest = new Range(LowerBound,UpperBound);
		
		assertTrue("intersects TC2: Did not return the expected output",rangeObjectUnderTest.intersects(newLower, newUpper));
	}
	@Test
	public void testintersectsBothRangePositiveNewRangeFullyAbove() {
		int UpperBound=10;
		int LowerBound=1;
		int newUpper=20;
		int newLower=15;
		
		rangeObjectUnderTest = new Range(LowerBound,UpperBound);
		
		assertFalse("intersects TC3: Did not return the expected output",rangeObjectUnderTest.intersects(newLower, newUpper));
	}
	@Test
	public void testintersectsBothRangePositiveNewRangeSlightlyInsideBelow() {
		int UpperBound=10;
		int LowerBound=1;
		int newUpper=1;
		int newLower=-10;
		
		rangeObjectUnderTest = new Range(LowerBound,UpperBound);
		
		assertTrue("intersects TC4: Did not return the expected output",rangeObjectUnderTest.intersects(newLower, newUpper));
	}
	@Test
	public void testintersectsBothRangePositiveNewRangeFullyBelow() {
		int UpperBound=10;
		int LowerBound=1;
		int newUpper=-10;
		int newLower=-15;
		
		rangeObjectUnderTest = new Range(LowerBound,UpperBound);
		
		assertFalse("intersects TC5: Did not return the expected output",rangeObjectUnderTest.intersects(newLower, newUpper));
	}
	@Test
	public void testintersectsOnePositiveOneNegativeNewRangeFullyInside() {
		int UpperBound=10;
		int LowerBound=-10;
		int newUpper=5;
		int newLower=-5;
		
		rangeObjectUnderTest = new Range(LowerBound,UpperBound);
		
		assertTrue("intersects TC6: Did not return the expected output",rangeObjectUnderTest.intersects(newLower, newUpper));
	}
	@Test
	public void testintersectsOnePositiveOneNegativeNewRangeSlightlyInsideAbove() {
		int UpperBound=10;
		int LowerBound=-10;
		int newUpper=11;
		int newLower=10;
		
		rangeObjectUnderTest = new Range(LowerBound,UpperBound);
		
		assertTrue("intersects TC7: Did not return the expected output",rangeObjectUnderTest.intersects(newLower, newUpper));
	}
	@Test
	public void testintersectsOnePositiveOneNegativeNewRangeFullyAbove() {
		int UpperBound=10;
		int LowerBound=-10;
		int newUpper=15;
		int newLower=12;
		
		rangeObjectUnderTest = new Range(LowerBound,UpperBound);
		
		assertFalse("intersects TC8: Did not return the expected output",rangeObjectUnderTest.intersects(newLower, newUpper));
	}
	@Test
	public void testintersectsOnePositiveOneNegativeNewRangeSlightlyInsideBelow() {
		int UpperBound=10;
		int LowerBound=-10;
		int newUpper=-10;
		int newLower=-20;
		
		rangeObjectUnderTest = new Range(LowerBound,UpperBound);
		
		assertTrue("intersects TC9: Did not return the expected output",rangeObjectUnderTest.intersects(newLower, newUpper));
	}
	@Test
	public void testintersectsOnePositiveOneNegativeNewRangeFullyBelow() {
		int UpperBound=10;
		int LowerBound=-10;
		int newUpper=-20;
		int newLower=-30;
		
		rangeObjectUnderTest = new Range(LowerBound,UpperBound);
		
		assertFalse("intersects TC10: Did not return the expected output",rangeObjectUnderTest.intersects(newLower, newUpper));
	}
	@Test
	public void testintersectsBothNegativeNewRangeInside() {
		int UpperBound=-10;
		int LowerBound=-20;
		int newUpper=-13;
		int newLower=-19;
		
		rangeObjectUnderTest = new Range(LowerBound,UpperBound);
		
		assertTrue("intersects TC11: Did not return the expected output",rangeObjectUnderTest.intersects(newLower, newUpper));
	}
	@Test
	public void testintersectsBothNegativeNewRangeSlightlyInsideAbove() {
		int UpperBound=-10;
		int LowerBound=-20;
		int newUpper=20;
		int newLower=-10;
		
		rangeObjectUnderTest = new Range(LowerBound,UpperBound);
		
		assertTrue("intersects TC12: Did not return the expected output",rangeObjectUnderTest.intersects(newLower, newUpper));
	}
	@Test
	public void testintersectsBothNegativeNewRangeFullyAbove() {
		int UpperBound=-10;
		int LowerBound=-20;
		int newUpper=100;
		int newLower=30;
		
		rangeObjectUnderTest = new Range(LowerBound,UpperBound);
		
		assertFalse("intersects TC13: Did not return the expected output",rangeObjectUnderTest.intersects(newLower, newUpper));
	}
	@Test
	public void testintersectsBothNegativeNewRangeSlightlyInsideBelow() {
		int UpperBound=-10;
		int LowerBound=-20;
		int newUpper=-20;
		int newLower=-40;
		
		rangeObjectUnderTest = new Range(LowerBound,UpperBound);
		
		assertTrue("intersects TC11: Did not return the expected output",rangeObjectUnderTest.intersects(newLower, newUpper));
	}
	@Test
	public void testintersectsBothNegativeNewRangeFullyBelow() {
		int UpperBound=-10;
		int LowerBound=-20;
		int newUpper=-30;
		int newLower=-40;
		
		rangeObjectUnderTest = new Range(LowerBound,UpperBound);
		
		assertFalse("intersects TC11: Did not return the expected output",rangeObjectUnderTest.intersects(newLower, newUpper));
	}
	@Test
	public void testExpandToIncludeBothPositiveValueInside() {
		int UpperBound=10;
		int LowerBound=3;
		double value =5.0;
		int newUpper=10;
		int newLower=3;
		rangeObjectUnderTest = new Range(LowerBound,UpperBound);
		Range NewRangeObject=Range.expandToInclude(rangeObjectUnderTest, value);
		assertEquals("ExpandToIncludeTC1.1: Did not return the expected Lower",newLower,NewRangeObject.getLowerBound(),0.000000000001d);
		assertEquals("ExpandToIncludeTC1.2: Did not return the expected Upper",newUpper,NewRangeObject.getUpperBound(),0.000000000001d);
		
	}
	@Test
	public void testExpandToIncludeBothPositiveValueAbove() {
		int UpperBound=10;
		int LowerBound=3;
		double value =15.0;
		int newUpper=15;
		int newLower=3;
		rangeObjectUnderTest = new Range(LowerBound,UpperBound);
		Range NewRangeObject=Range.expandToInclude(rangeObjectUnderTest, value);
		assertEquals("ExpandToIncludeTC2.1: Did not return the expected Lower",newLower,NewRangeObject.getLowerBound(),0.000000000001d);
		assertEquals("ExpandToIncludeTC2.2: Did not return the expected Upper",newUpper,NewRangeObject.getUpperBound(),0.000000000001d);
		
	}
	@Test
	public void testExpandToIncludeBothPositiveValueBelow() {
		int UpperBound=10;
		int LowerBound=3;
		double value =1.0;
		int newUpper=10;
		int newLower=1;
		rangeObjectUnderTest = new Range(LowerBound,UpperBound);
		Range NewRangeObject=Range.expandToInclude(rangeObjectUnderTest, value);
		assertEquals("ExpandToIncludeTC3.1: Did not return the expected Lower",newLower,NewRangeObject.getLowerBound(),0.000000000001d);
		assertEquals("ExpandToIncludeTC3.2: Did not return the expected Upper",newUpper,NewRangeObject.getUpperBound(),0.000000000001d);
		
	}
	@Test
	public void testExpandToIncludeOnePositiveOneNegativeValueInside() {
		int UpperBound=10;
		int LowerBound=-10;
		double value =0;
		int newUpper=10;
		int newLower=-10;
		rangeObjectUnderTest = new Range(LowerBound,UpperBound);
		Range NewRangeObject=Range.expandToInclude(rangeObjectUnderTest, value);
		assertEquals("ExpandToIncludeTC4.1: Did not return the expected Lower",newLower,NewRangeObject.getLowerBound(),0.000000000001d);
		assertEquals("ExpandToIncludeTC4.2: Did not return the expected Upper",newUpper,NewRangeObject.getUpperBound(),0.000000000001d);
		
	}
	@Test
	public void testExpandToIncludeOnePositiveOneNegativeValueAbove() {
		int UpperBound=10;
		int LowerBound=-10;
		double value =20;
		int newUpper=20;
		int newLower=-10;
		rangeObjectUnderTest = new Range(LowerBound,UpperBound);
		Range NewRangeObject=Range.expandToInclude(rangeObjectUnderTest, value);
		assertEquals("ExpandToIncludeTC5.1: Did not return the expected Lower",newLower,NewRangeObject.getLowerBound(),0.000000000001d);
		assertEquals("ExpandToIncludeTC5.2: Did not return the expected Upper",newUpper,NewRangeObject.getUpperBound(),0.000000000001d);
		
	}
	@Test
	public void testExpandToIncludeOnePositiveOneNegativeValueBelow() {
		int UpperBound=10;
		int LowerBound=-10;
		double value =-20;
		int newUpper=10;
		int newLower=-20;
		rangeObjectUnderTest = new Range(LowerBound,UpperBound);
		Range NewRangeObject=Range.expandToInclude(rangeObjectUnderTest, value);
		assertEquals("ExpandToIncludeTC6.1: Did not return the expected Lower",newLower,NewRangeObject.getLowerBound(),0.000000000001d);
		assertEquals("ExpandToIncludeTC6.2: Did not return the expected Upper",newUpper,NewRangeObject.getUpperBound(),0.000000000001d);	
	}
	@Test
	public void testExpandToIncludeBothNegativeValueInside() {
		int UpperBound=-10;
		int LowerBound=-20;
		double value =-15;
		int newUpper=-10;
		int newLower=-20;
		rangeObjectUnderTest = new Range(LowerBound,UpperBound);
		Range NewRangeObject=Range.expandToInclude(rangeObjectUnderTest, value);
		assertEquals("ExpandToIncludeTC7.1: Did not return the expected Lower",newLower,NewRangeObject.getLowerBound(),0.000000000001d);
		assertEquals("ExpandToIncludeTC7.2: Did not return the expected Upper",newUpper,NewRangeObject.getUpperBound(),0.000000000001d);
		
	}
	@Test
	public void testExpandToIncludeBothNegativeValueAbove() {
		int UpperBound=-10;
		int LowerBound=-20;
		double value =10;
		int newUpper=10;
		int newLower=-20;
		rangeObjectUnderTest = new Range(LowerBound,UpperBound);
		Range NewRangeObject=Range.expandToInclude(rangeObjectUnderTest, value);
		assertEquals("ExpandToIncludeTC8.1: Did not return the expected Lower",newLower,NewRangeObject.getLowerBound(),0.000000000001d);
		assertEquals("ExpandToIncludeTC8.2: Did not return the expected Upper",newUpper,NewRangeObject.getUpperBound(),0.000000000001d);
		
	}
	@Test
	public void testExpandToIncludeBothNegativeValueBelow() {
		int UpperBound=-10;
		int LowerBound=-20;
		double value =-30;
		int newUpper=-10;
		int newLower=-30;
		rangeObjectUnderTest = new Range(LowerBound,UpperBound);
		Range NewRangeObject=Range.expandToInclude(rangeObjectUnderTest, value);
		assertEquals("ExpandToIncludeTC9.1: Did not return the expected Lower",newLower,NewRangeObject.getLowerBound(),0.000000000001d);
		assertEquals("ExpandToIncludeTC9.2: Did not return the expected Upper",newUpper,NewRangeObject.getUpperBound(),0.000000000001d);
		
	}
	
	
	
}
