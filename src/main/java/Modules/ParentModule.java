package Modules;

import Service.Foo;
import com.google.inject.AbstractModule;

/**
 * Created by himalayj on 7/4/17.
 */
public class ParentModule extends AbstractModule {
    protected void configure() {
        //add configuration logic here
        install(new ChildModule());

        // Bind Foo
        bind(Foo.class);
    }
}
