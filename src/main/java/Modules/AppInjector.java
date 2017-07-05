package Modules;

import Service.EmailService;
import Service.MessageService;
import com.google.inject.AbstractModule;

/**
 * Created by himalayj on 7/4/17.
 */
public class AppInjector extends AbstractModule {
    protected void configure() {

        bind(MessageService.class).to(EmailService.class);
    }
}
