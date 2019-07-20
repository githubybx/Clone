package deep_clone.Clonable;

public class Address implements Cloneable{
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
