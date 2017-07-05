package Service;

import Modules.ParentModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Created by himalayj on 7/4/17.
 */
public class ClientAppFooBar {

    public static void main(String args[]) {
        Injector injector = Guice.createInjector(new ParentModule());

        final Foo foo = injector.getInstance(Foo.class);

        System.out.println(foo.getBar());
    }
}
