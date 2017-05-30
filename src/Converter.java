import javax.swing.JOptionPane;

public class Converter {

	public String changeToHex(int intBase10) {
		String answer = "";
		// code for you to complete
		if (intBase10 < 0 || intBase10 > 255) {
			JOptionPane.showMessageDialog(null, "Error, Integer range is out of bounds, please pick a number from 0 to 255");
			
			return null;
		}
		// basic test
		if (intBase10 == 0)
			answer = "00";
		if (intBase10 == 255)
			answer = "FF";
		return Integer.toHexString(intBase10);
	}

}