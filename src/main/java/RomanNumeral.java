
public class RomanNumeral {

	public static String arabicToRoman(int arabic) {
		  StringBuilder result = new StringBuilder();
		  int numeral = arabic;
		  
		  if (numeral >= 9) {
			  result.append ("IX");
			  numeral -= 9;
		  }
		  
		  if (numeral >= 5){
			  result.append ("V");
			  numeral -= 5;
		  }
		  if (numeral >= 4) {
			  result.append ("IV");
			  numeral -= 4;
		  }
		  for (int count = 0; count < numeral; count++) {
		    result.append("I");
		  }
		  return result.toString();
		}
}