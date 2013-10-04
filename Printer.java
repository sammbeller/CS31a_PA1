import java.util.concurrent.*;

public class Printer implements Runnable {
    private BlockingQueue in;
    private volatile boolean done;
    
    public Filter(BlockingQueue in) {
        this.in = in;
        this.done = false;
    }
    
    public void run() {
        Object o;
        while(! this.done) {
            o = in.take();    // read from input queue, may block
            if (o.getFlag) {done = true;} // set the done flag to true if done
            System.out.print(o.getMessage);		// print output
        }
    }
}
