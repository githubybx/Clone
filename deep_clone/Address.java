package deep_clone;

import java.io.Serializable;

public class Address implements Serializable {
    public static final long serialVersionUID = 1221l;
    private String id;

    public Address() {
    }

    public Address(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
