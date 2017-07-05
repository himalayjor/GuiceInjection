import Modules.AppInjector;
import Service.ProvidesTesting;
import Service.ProvidesTestingContainer;
import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Created by himalayj on 7/4/17.
 */
public class ClientApplication {

    public static void main(String args[]) {
        Injector injector = Guice.createInjector(new AppInjector());

        MyApplication app = injector.getInstance(MyApplication.class);

        ProvidesTesting providesTesting = injector.getInstance(ProvidesTesting.class);

        System.out.println(providesTesting);

        ProvidesTestingContainer providesTestingContainer = injector.getInstance(ProvidesTestingContainer.class);
        System.out.println(providesTestingContainer);

        app.sendMessage("Hi Pankaj");
    }
}
