import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.InputStreamReader;



public class Server {
    public static void main(String[] args) {
        try {
          ServerSocket serverSocket = new ServerSocket(1280);
            System.out.println("Server is connected on port 1280");

            Socket socket = serverSocket.accept();
            System.out.println("Client is connected.");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);


            Scanner sc = new Scanner(System.in);

            for (int i = 0; i < 10; i++) {
                String clientMessage = bufferedReader.readLine();
                System.out.println("Client says: " + clientMessage);


                System.out.print("Enter your reply: ");
                String reply = sc.nextLine();
                printWriter.println(reply);
            }
            sc.close();
            socket.close();
            serverSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


