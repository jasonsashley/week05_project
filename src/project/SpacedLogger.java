package project;

public class SpacedLogger implements Logger {

	@Override
	public void log(String s) {
		char[] array = s.toCharArray();
		for (char letter : array) {
			System.out.print(letter + " ");
		}
		System.out.println();

	}

	@Override
	public void error(String s) {
		System.out.print("Error: ");
		log(s);
	}

}
