package smartphone;

public class Friend extends Contact {
    private String phoneNumber;

    public Friend() {
    }

    public Friend(String name, String phoneNumber) {
        setName(name);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + getName() + "'" +
                "phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
