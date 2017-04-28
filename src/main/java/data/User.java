package data;

/**
 * Created by Andriy on 03.04.2017.
 */
public class User {

    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String internationalphone;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String comments;

    public User(String firstName, String lastName, String phone, String email, String internationalphone, String street, String city, String state, String zip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.internationalphone = internationalphone;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    // TODO: Create a user constructor with comments
    public User(String firstName, String lastName, String phone, String email, String internationalphone, String street, String city, String state, String zip, String comments) {
        this(firstName, lastName, phone, email, internationalphone, street, city, state, zip);
        this.comments = comments;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInternationalphone() {
        return internationalphone;
    }

    public void setInternationalphone(String internationalphone) {
        this.internationalphone = internationalphone;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String zip) {
        this.comments = comments;
    }
}
