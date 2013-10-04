
/** 
/* This class takes in a string of commands and parses them
**/

public class Parser {

	private String data;
	
	public Parser(String data) {
		this.data = data;
	}
	
	public String[][] parse() {
		commands = data.split("||");
		String[][] output = new String[commands.size][];
		for (int i = 0; i < commands.length; i++) {
			output[i] = commands[i].split(" ");
		}
		return output;
	}
}