import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuVerifierTest {

//implement tests to test Sudokuverifier with boundary values.  Use templates from Task 1 to derive and document test cases.
	
// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891
String c = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
String i = "123456789912345678891234567789123456678912345567891234456789123345678912234567891";
String i1 = "417369825630158947958724316825437169791586432346912758289643571573291684164875293"; // modified the correct string to include 0
String i3 = "412369825637158947958724316825437169791586432346912758289643571573291684164875293"; // modified the correct string by swapping the places of two numbers vertically
String i4 = "147369825632158947958724316825437169791586432346912758289643571573291684164875293"; // similar as above, but swapped horizontally
String i5 = "417∆69825632158947958724316825437169791586432346912758289643571573291684164875293"; // modified the correct string to include ∆
SudokuVerifier v = new SudokuVerifier();

	@Test
	public void testCorrectString() {
		int a = v.verify(c);
		assertEquals("correct string", a, 0);
	}

	@Test
	public void testIncorrectString() {
		int a = v.verify(i);
		assertEquals("incorrect string", a, -2);
		
	}

	@Test
	public void testIncorrectStringWithZero() {
		int a = v.verify(i1);
		assertEquals("incorrect string", a, -1);
		
	}

	@Test
	public void testIncorrectRow() {
		int a = v.verify(i3);
		assertEquals("incorrect string", a, -3);
		
	}
	
	@Test
	public void testIncorrectColumn() {
		int a = v.verify(i4);
		assertEquals("incorrect string", a, -4);
		
	}

	@Test
	public void testStringWithNotANumber() {
		int a = v.verify(i5);
		assertEquals("incorrect string", a, 1);
		
	}
	
	
}
