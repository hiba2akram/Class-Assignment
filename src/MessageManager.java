import java.util.ArrayList;
import java.util.List;

public class MessageManager {
   private List<Messages> messages;

   // Constructor to initialize the message list
   public MessageManager() {
      this.messages = new ArrayList<>();
   }

   // Method to send a message
   public void sendMessage(Messages messages) {
      messages.add(messages);
      System.out.println("Message sent to " + messages.getReceiverId());
   }

   // Method to receive a message
   public void receiveMessage(Messages messages) {
      messages.add(messages);
      System.out.println("Message received from " + messages.getSenderId());
   }

   // Method to mark a message as read
   public void markAsRead(String senderId, String receiverId) {
      for (Messages message : messages) {
         if (message.getSenderId().equals(senderId) && message.getReceiverId().equals(receiverId)) {
            message.updateStatus(message.getStatus());
            System.out.println("Message from " + senderId + " marked as read.");
            break;
         }
      }
   }

   // Method to delete messages by contact ID
   public void deleteMessagesByContact(String contactId) {
      messages.removeIf(message -> message.getReceiverId().equals(contactId));
      System.out.println("Messages from " + contactId + " deleted.");
   }

   // Method to search messages by text
   public void searchMessages(String text) {
      boolean found = false;
      for (Messages message : messages) {
         if (message.getText().contains(text)) {
            message.displayMessage();
            found = true;
         }
      }
      if (!found) {
         System.out.println("No messages found containing: " + text);
      }
   }
   // Method to display messages by contact ID
   public void displayMessages(String contactId) {
      boolean found = false;
      for (Messages message : messages) {
         if (message.getReceiverId().equals(contactId)) {
            message.displayMessage();
            found = true;
         }
      }
      if (!found) {
         System.out.println("No messages from " + contactId);
      }
   }

   // Method to add a new message (alternative to direct send)
   public void addMessage(Messages newMessage) {
      messages.add(newMessage);
      System.out.println("New message added to system.");
   }

   // Get all messages
   public List<Messages> getAllMessages() {
      return messages;
}
}