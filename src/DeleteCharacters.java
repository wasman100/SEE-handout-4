import acm.program.*;

public class DeleteCharacters extends ConsoleProgram {

	public void run() {
		println(removeAllOccurrences("wesley", 'e'));
		println(removeAllOccurrences("kiara", 'a'));
		println(removeAllOccurrences("wensday", 'e'));
		println(removeAllOccurrences("friday", 'e'));
	}

	public String removeAllOccurrences(String str, char ch) {
		String done = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ch) {
				done += str.charAt(i);
			}

		}

		return done;

	}
}
