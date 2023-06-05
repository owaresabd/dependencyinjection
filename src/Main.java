public class Main {
    private final MessageService messageService;

    // Constructor-based injection

public Main(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendNotification(String message) {
        messageService.sendMessage(message);
    }

    public static void main(String[] args) {
        // Create the dependencies manually
        MessageService emailService = new EmailService();
        Main app = new Main(emailService);

        // Use the application
        app.sendNotification("Hello, world!");
    }
}