import java.util.concurrent.*;
import java.util.Scanner;
import java.IO.File;
import Message;


public class Cat implements Runnable {
    private BlockingQueue out;
    private volatile boolean done;
	private String[] fileNames;
	    
    public Cat(BlockingQueue out, String[] fileNames) {
        this.out = out;
        this.fileNames = fileNames;
        this.done = false;
    }
    
    private processFile(Scanner input, boolean flag) {
    	while(input.hasNext()) {
    		boolean done = flag && (! input.hasNext); // If we're on the last file and it's the last line then we're done
    		Message message = new Message(input.nextLine(), done);
    		out.put(message);
    	}
    }
    
    public void run() {
        File file;
        Scanner input
        for(int i = 0; i < fileNames.length; i++) {
			input = new Scanner(file);
			processFile(input, (i == (fileNames.length - 1));	
        }
    }    
}
