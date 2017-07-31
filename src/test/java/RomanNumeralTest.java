import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumeralTest {
	
	@Test
	public void shouldReturnRomanOneWhenArabicOneIsPassed(){
	RomanNumeral romanNumeral = new RomanNumeral();
	assertEquals("I", "1", romanNumeral.arabicToRoman(1));
	
	}

}
