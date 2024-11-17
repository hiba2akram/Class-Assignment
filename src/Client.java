import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
        public static void main(String[] args) {
            try {

                Socket socket = new Socket("localhost", 1280);
                System.out.println("Connected to server.");
                PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                Scanner sc = new Scanner(System.in);
                for (int i = 0; i < 3; i++) {
                    System.out.print("Enter your message: ");
                    String clientMessage = sc.nextLine();
                    writer.println(clientMessage);
                    String serverReply = reader.readLine();
                    System.out.println("Server says: " + serverReply);
                }

                sc.close();
                socket.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


