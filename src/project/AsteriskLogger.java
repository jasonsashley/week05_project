package project;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String s) {
		System.out.println("***" + s + "***");
	}

	@Override
	public void error(String s) {
		int lineLength = s.length() + 13;
		StringBuilder line = new StringBuilder();
		for (int i = 0; i < lineLength; i++) {
			line.append("*");
		}
		System.out.println(line);
		log("Error: " + s);
		System.out.println(line);
	}

}
