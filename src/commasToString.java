import acm.program.*;

public class commasToString extends ConsoleProgram {
	public void run() {
		while (true) {
			String digits = readLine("Enter a number: ");
			if (digits.length() == 0)
				break;
			println(addCommasToNumericString(digits));
		}
	}

	private String addCommasToNumericString(String digits) {
		// TODO Auto-generated method stub
		String placeholder = "";
		int letterSelector = digits.length();
		try {
			// making sure it is a real number
			int testing = Integer.parseInt(digits);
			// looping through to make sure at every 3rd char we add a comma
			for (int i = 0; i < digits.length(); i++) {
				letterSelector--;
				if (letterSelector < 0) {
					letterSelector = 0;
				}
				// println(letterSelector);
				if (i % 3 == 0 && i != 0) {
					placeholder += ",";
				}
				placeholder += digits.charAt(letterSelector);
			}
			// reversing the string so we get the right number instead of it backwards
			return (new StringBuilder(placeholder).reverse().toString());

		} catch (NumberFormatException e) {
			return "incorrect format please enter a number";
		}

	}

}
