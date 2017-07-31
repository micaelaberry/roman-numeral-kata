import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumeralTest {
	
/*	@Test
	public void shouldReturnRomanOneWhenArabicOneIsPassed(){
	RomanNumeral romanNumeral = new RomanNumeral();
	assertEquals("1","I", romanNumeral.arabicToRoman(1));
	
	}
	
	@Test
	public void shouldReturnRomanTwoWhenArabicTwoIsPassed(){
	RomanNumeral romanNumeral = new RomanNumeral();
	assertEquals("2","II", romanNumeral.arabicToRoman(2));
	
	}*/
	
	@Test
	public void shouldReturnRomanNumbersOneTwoThreeWhenArabicNumbersArePassed(){
		RomanNumeral romanNumeral = new RomanNumeral();
		assertEquals("1","I", romanNumeral.arabicToRoman(1));
		assertEquals("2","II", romanNumeral.arabicToRoman(2));
		assertEquals("3","III", romanNumeral.arabicToRoman(3));

		
	}

}
