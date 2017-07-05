package Service;

import com.google.inject.ImplementedBy;

/**
 * Created by himalayj on 7/4/17.
 * Default implemententation of MessageService is Facebook Service.
 * We don't need Modules binding for ImplementedBy.
 * In case of both implementedBy & Modules, modules has precedence.
 */
@ImplementedBy(FacebookService.class)
public interface MessageService {

    public void sendMessage(String message);
}
