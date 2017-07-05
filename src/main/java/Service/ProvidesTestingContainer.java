package Service;

import com.google.inject.Inject;

/**
 * Created by himalayj on 7/4/17.
 */
public class ProvidesTestingContainer {

    private ProvidesTesting providesTesting;

    @Inject
    public ProvidesTestingContainer(ProvidesTesting providesTesting) {
        this.providesTesting = providesTesting;
    }

    @Override
    public String toString() {
        return "ProvidesTestingContainer{" +
                "providesTesting=" + providesTesting +
                '}';
    }
}
