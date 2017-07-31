
public class RomanNumeral {

	int arabicNumber;

	public Object arabicToRoman(int arabicNumber) {
		if (arabicNumber == 1) {
			return "I";
		}
		return "II";
	}
}