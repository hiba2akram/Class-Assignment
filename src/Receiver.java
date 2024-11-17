
import java.io.BufferedReader;
import java.io.IOException;

public class Receiver implements Runnable {
    private BufferedReader input;

    public Receiver(BufferedReader input) {
        this.input = input;
    }

    @Override
    public void run() {
        try {
            String messageFromClient;
            while ((messageFromClient = input.readLine()) != null) {
                System.out.println("Client: " + messageFromClient);
                if (messageFromClient.equalsIgnoreCase("exit")) {
                    System.out.println("Client has disconnected.");
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Error in receiving message: " + e.getMessage());
        }
    }
}




