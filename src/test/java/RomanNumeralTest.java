import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RomanNumeralTest {
	
	RomanNumeral romanNumeral;

	@Before
	public void setUp() {
		romanNumeral = new RomanNumeral();
	}
	
	
	@Test
	public void shouldReturnRomanNumbersOneTwoThreeWhenArabicNumbersArePassed(){
		assertEquals("1","I", RomanNumeral.arabicToRoman(1));
		assertEquals("2","II", RomanNumeral.arabicToRoman(2));
		assertEquals("3","III", RomanNumeral.arabicToRoman(3));
	}
	
	@Test
	public void shouldReturnRomanFourWhenArabicFourIsPassed(){
		assertEquals("4", "IV", RomanNumeral.arabicToRoman(4));
	}
	
	@Test
	public void shouldReturnRomanNumberFiveWhenArabicFiveIsPassed(){
		assertEquals("5", "V", RomanNumeral.arabicToRoman(5));
	}
	
	@Test
	public void shouldReturnRomanNumberSixWhenArabicSixIsPassed(){
		assertEquals("6", "VI", RomanNumeral.arabicToRoman(6));
	}
	
	@Test
	public void shouldReturnRomanNineWhenArabicNineIsPassed(){
		assertEquals("9", "IX", RomanNumeral.arabicToRoman(9));
	}
}
