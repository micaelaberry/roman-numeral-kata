
public class RomanNumeral {

	int arabicNumber;

	public static String arabicToRoman(int arabicNumber) {
		if (arabicNumber == 1) {
			return "I";
		} else if (arabicNumber == 2) {
			return "II";
		}
		return "III";
	}
}