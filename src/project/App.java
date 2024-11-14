package project;

public class App {

	public static void main(String[] args) {
		AsteriskLogger loggerA = new AsteriskLogger();
		
		System.out.println("AsteriskLogger log method: ");
		loggerA.log("Hey Hey!");
		
		System.out.println("\nAsteriskLogger error method (various length inputs): ");
		loggerA.error("Hi!");
		loggerA.error("");
		loggerA.error("This is a warning, perhaps an ill omen.");

		SpacedLogger loggerS = new SpacedLogger();
		
		System.out.println("\nSpacedLogger log method: ");
		loggerS.log("Hello World");
		
		System.out.println("\nSpacedLogger error method (various length inputs): ");
		loggerS.error("Hi hi!");
		loggerS.error("No, everything's normal, don't worry about it :)");
	}

}
