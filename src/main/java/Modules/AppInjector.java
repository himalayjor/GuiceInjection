package Modules;

import Service.EmailService;
import Service.MessageService;
import Service.ProvidesTesting;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;

/**
 * Created by himalayj on 7/4/17.
 */
public class AppInjector extends AbstractModule {
    protected void configure() {

        bind(MessageService.class).to(EmailService.class);
    }

    @Provides
    public ProvidesTesting getProvidesTesting() {
        return new ProvidesTesting("testValue");
    }
}
