package Service;

/**
 * Created by himalayj on 7/4/17.
 */
public class FacebookService implements MessageService {

    public void sendMessage(String message) {
        System.out.println("In Service.FacebookService " + message);
    }
}
