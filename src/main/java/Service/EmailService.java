package Service;

import com.google.inject.Singleton;

/**
 * Created by himalayj on 7/4/17.
 */
@Singleton
public class EmailService implements MessageService {
    public void sendMessage(String message) {
        System.out.println(message + " in Service.EmailService");
    }
}
