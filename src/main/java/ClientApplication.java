import Modules.AppInjector;
import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Created by himalayj on 7/4/17.
 */
public class ClientApplication {

    public static void main(String args[]) {
        Injector injector = Guice.createInjector(new AppInjector());

        MyApplication app = injector.getInstance(MyApplication.class);

        app.sendMessage("Hi Pankaj");
    }
}
