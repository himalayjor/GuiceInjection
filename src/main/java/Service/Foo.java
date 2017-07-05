package Service;

import com.google.inject.Inject;

/**
 * Created by himalayj on 7/4/17.
 */
public class Foo {

    private Bar bar;

    @Override
    public String toString() {
        return "Foo{" +
                "bar=" + bar +
                '}';
    }

    public Bar getBar() {
        return bar;
    }

    @Inject

    public Foo(Bar bar) {
        this.bar = bar;
    }
}
