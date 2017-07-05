package Service;

/**
 * Created by himalayj on 7/4/17.
 */
public class ProvidesTesting {

    String value;

    public ProvidesTesting(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ProvidesTesting{" +
                "value='" + value + '\'' +
                '}';
    }
}
