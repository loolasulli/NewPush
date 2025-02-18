package mentor30;

import java.util.UUID;

public class User {
    private String uniqueID;
    private String name;
    private String email;

    public User(String uniqueID, String name, String email) {
        this.uniqueID = UUID.randomUUID().toString();
        this.name = name;
        this.email = email;
    }

    public User() {
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "uniqueID='" + uniqueID + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
