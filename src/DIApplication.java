public class DIApplication {

    private final MessageService messageService;

    // Constructor-based injection

    public DIApplication(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendNotification(String message) {
        messageService.sendMessage(message);
    }
}
