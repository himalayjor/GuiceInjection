package Service;

/**
 * Created by himalayj on 7/4/17.
 */
public class Bar {

    private String message;

    @Override
    public String toString() {
        return "Bar{" +
                "message='" + message + '\'' +
                '}';
    }

    public String getMessage() {
        return message;
    }

    public Bar(String message) {
        this.message = message;
    }
}