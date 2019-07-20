package deep_clone.Serializable;

import java.io.Serializable;

public class Address implements Serializable {
    private String id;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

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
