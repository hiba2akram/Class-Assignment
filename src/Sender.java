import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Sender implements Runnable {
    private PrintWriter output;
    private BufferedReader consoleInput;

    // Constructor to initialize PrintWriter and console input reader
    public Sender(PrintWriter output) {
        this.output = output;
        this.consoleInput = new BufferedReader(new java.io.InputStreamReader(System.in));
    }

    @Override
    public void run() {
        try {
            String messageToSend;
            while ((messageToSend = consoleInput.readLine()) != null) {
                output.println(messageToSend);  // Send message to the other party
                if (messageToSend.equalsIgnoreCase("exit")) {
                    System.out.println("Closing connection...");
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Error in sending message: " + e.getMessage());
        }
    }
}







