
public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		String s = log;
        s = String.join(" ", s.split(""));
        System.out.println(s);
		
	}

	@Override
	public void error(String error) {
		String e = error;
        e = String.join(" ", e.split(""));
        System.out.println("ERROR: " + e);
		
	}

}
