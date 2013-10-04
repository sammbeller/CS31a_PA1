/**
* This class represents the messages passed between threads.
* The message field contains the data to be operated on.
* The flag field indicates when the sending thread has finished operation.
**/

public class Message {

	private String message;
	private boolean flag;
	
	public Message(String message, boolean flag) {
		this.message = message;
		this.flag = flag;
	}
	
	//Returns the message
	public String getMessage() {
		return message;
	}
	
	// Returns the flag
	public boolean getFlag() {
		return flag;
	}
} 