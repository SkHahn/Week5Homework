
public class App {

	public static void main(String[] args) {
		
	SpacedLogger logger = new SpacedLogger();
	logger.log("Instance of Spaced Logger");

	SpacedLogger logger2 = new SpacedLogger();
	logger2.error("An incident has taken place");
	
	AsteriskLogger logger3 = new AsteriskLogger();
	logger3.log("Instance of Asterisk Logger");
	
	AsteriskLogger logger4 = new AsteriskLogger();
	logger4.error("Something Happened!");
	
	System.out.println("goodbye");
	
	
	}

}
