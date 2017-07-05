import Service.MessageService;
import com.google.inject.Inject;

/**
 * Created by himalayj on 7/4/17.
 */
public class MyApplication {
    MessageService messageService;

    @Inject
    public MyApplication(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendMessage(String message) {
        messageService.sendMessage(message);
    }
}
