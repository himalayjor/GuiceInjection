package Modules;

import Service.Bar;
import com.google.inject.AbstractModule;

/**
 * Created by himalayj on 7/4/17.
 */
public class ChildModule extends AbstractModule {
    protected void configure() {
        //add configuration logic here

        bind(Bar.class).toInstance(new Bar("Hello World from Bar"));
    }
}
