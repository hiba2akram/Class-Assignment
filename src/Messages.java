import java.time.LocalDateTime;

public class Messages {

    public static Object Status;
    private String senderId;
    private String receiverId;
    private String text;
    private LocalDateTime timestamp;
    private Status status;


    public Messages(String senderId, String receiverId, String text, LocalDateTime timestamp, Status status) {
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.text = text;
        this.timestamp = timestamp;
        this.status = status;

    }

    public Messages(String senderId, String receiverId, String text) {
    }

    // Getters and Setters
    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }
    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    // Method to update the status of the message
    public void updateStatus(Status newStatus) {
        this.status = newStatus;
    }

    // Display message details
    public void displayMessage() {
        System.out.println("------ Message Details ------");
        System.out.println("From: " + senderId);
        System.out.println("To: " + receiverId);
        System.out.println("Text: " + text);
        System.out.println("Timestamp: " + timestamp);
        System.out.println("Status: " + status);
        System.out.println("----------------------------");
    }


    public void add(Messages messages) {
    }
}


