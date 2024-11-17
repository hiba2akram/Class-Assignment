
import java.time.LocalDateTime;
import java.util.Scanner;

    public class Main {
        private static MessageManager messageManager = new MessageManager();
        private static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            boolean exit = false;

            while (!exit) {
                System.out.println("\n---- Message Management System ----");
                System.out.println("1. Send Message");
                System.out.println("2. View Messages");
                System.out.println("3. Search Messages");
                System.out.println("4. Mark Message as Read");
                System.out.println("5. Delete Messages by Contact");
                System.out.println("6. Exit");

                System.out.print("Select an option: ");
                int option = scanner.nextInt();
                scanner.nextLine(); // Consume newline character

                switch (option) {
                    case 1:
                        sendMessage();
                        break;
                    case 2:
                        viewMessages();
                        break;
                    case 3:
                        searchMessages();
                        break;
                    case 4:
                        markMessageAsRead();
                        break;

                    case 5:
                        deleteMessages();
                        break;
                    case 6:
                        exit = true;
                        System.out.println("Exiting program...");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        }


        // Method to send a message
        private static void sendMessage() {
            System.out.print("Enter sender ID: ");
            String senderId = scanner.nextLine();
            System.out.print("Enter receiver ID: ");
            String receiverId = scanner.nextLine();
            System.out.print("Enter message text: ");
            String text = scanner.nextLine();
            LocalDateTime timestamp = LocalDateTime.now();

            Messages newMessage = new Messages(senderId, receiverId, text, timestamp, Status.DELIVERED);
            messageManager.sendMessage(newMessage);
        }

        // Method to view messages
        private static void viewMessages() {
            System.out.print("Enter contact ID to view messages: ");
            String contactId = scanner.nextLine();
            messageManager.displayMessages(contactId);
        }

        // Method to search for messages by text
        private static void searchMessages() {
            System.out.print("Enter text to search in messages: ");
            String searchText = scanner.nextLine();
            messageManager.searchMessages(searchText);
        }


        // Method to mark a message as read
        private static void markMessageAsRead() {
            System.out.print("Enter sender ID: ");
            String senderId = scanner.nextLine();
            System.out.print("Enter receiver ID: ");
            String receiverId = scanner.nextLine();
            messageManager.markAsRead(senderId, receiverId);
        }

        // Method to delete messages by contact
        private static void deleteMessages() {
            System.out.print("Enter contact ID to delete messages: ");
            String contactId = scanner.nextLine();
            messageManager.deleteMessagesByContact(contactId);
        }
    }

