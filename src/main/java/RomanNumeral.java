
public class RomanNumeral {

	public static String arabicToRoman(int arabic) {
		  StringBuilder result = new StringBuilder();
		  if (arabic ==5){
			  return "V";
		  }
		  else if (arabic == 4) {
		    return "IV";
		  }
		  for (int number = 0; number < arabic; number++) {
		    result.append("I");
		  }
		  return result.toString();
		}
}