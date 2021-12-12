package Business.Role.Volunteer;

/**
 *
 * @author jaydenwjc
 */
public class Volunteer {

    private String id;
    private String name;
    private String address;
    private String email;
    private String contactNumber;

    public Volunteer(String id, String name, String address, String email, String contactNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.contactNumber = contactNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

}
