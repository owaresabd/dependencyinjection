public class Main {


    public static void main(String[] args) {
        MessageService emailService = new EmailService();
        DIApplication app = new DIApplication(emailService);
        app.sendNotification("Dependency Injection");
    }
}