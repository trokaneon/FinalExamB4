import javax.swing.JOptionPane;

/* INSTRUCTIONS
 * 1. Create FinalExam_lastName Java Project
 * 2. Create class "Runner," and class "Converter"
 * 3. Instantiate both classes in main
 * 4. Use JOP's for all I/O -- do not leave any syso you might have
 *    used for debugging
 * 5. In myRunner.enterInteger(); tell allowable range is 0 - 255,
 *    and test for that range; if outside of that range tell them
 *    and ask for another try at entering a base-10 number 0-255
 * 6. Complete all necessary code, below
 * 7. Create and use a Git repository
 * 8. Create and use a GitHub repository
 * 9. Show Mr. M for a grade!
 */

public class Runner {

	public static void main(String[] args) {

		int intBase10 = 0;
		String hexAnswer = "";

		Runner myRunner = new Runner();
		Converter myConverter = new Converter();

		myRunner.welcome();

		intBase10 = myRunner.enterInteger();
		
		if(intBase10 == 266){ intBase10 = myRunner.enterInteger();
		
		}
		if(intBase10 == 266){ intBase10 = myRunner.enterInteger();
		
		}
		if(intBase10 == 266){ intBase10 = myRunner.enterInteger();
		
		}

		hexAnswer = myConverter.changeToHex(intBase10);

		// for testing, remove all syso when done
		JOptionPane.showMessageDialog(null, "0-255 entry: " + intBase10 + ", hex conversion: " + hexAnswer);

		// now JOP the answer
		// then JOP "Do you want to enter another 0-255 Yes or No"
		// place this in a loop, keep looping as long as they answer Yes
		String choice = JOptionPane.showInputDialog("Would you like to convert another number? y or n ");
		while(true){
		
		if(choice.equals("y") == true){ 
			intBase10 = myRunner.enterInteger();
			
			if(intBase10 == 266){ intBase10 = myRunner.enterInteger();
			
			}
			if(intBase10 == 266){ intBase10 = myRunner.enterInteger();
			
			}
			if(intBase10 == 266){ intBase10 = myRunner.enterInteger();
	
			}
			hexAnswer = myConverter.changeToHex(intBase10);
			JOptionPane.showMessageDialog(null, "0-255 entry: " + intBase10 + ", hex conversion: " + hexAnswer);
			choice = JOptionPane.showInputDialog("Would you like to convert another number? y or n ");
		}
		else{
			JOptionPane.showMessageDialog(null, "thank you, come again.");
			break;
		}
		}
	}

	private int enterInteger() {
		int DEC = 0;
		String DECString = JOptionPane.showInputDialog("Please enter an integer to convert to hexidecimal.");
		
		for(int x = 0; x < DECString.length(); x++){
		if(DECString.charAt(x) != '0' && DECString.charAt(x) != '1' && DECString.charAt(x) != '2' && DECString.charAt(x) != '3'
				&& DECString.charAt(x) != '4' && DECString.charAt(x) != '5' && DECString.charAt(x) != '6' && DECString.charAt(x) != '7'
				&& DECString.charAt(x) != '8' && DECString.charAt(x) != '9')
	    {
		JOptionPane.showMessageDialog(null, "I am sorry, but you didn't enter a correct base-10 number. Please try again.");
		return 266;
		
		}
		
		//System.out.println(DECString.charAt(x));
		//System.out.println(DECString);
		}
		
	//	System.out.println(DECString);
		DEC = Integer.parseInt(DECString);
		return DEC;
	}

	private void welcome() {
		JOptionPane.showMessageDialog(null,
				"Welcome, this program converts base-10 integers " + "between 0-255 to hexadecimal");
	}

}