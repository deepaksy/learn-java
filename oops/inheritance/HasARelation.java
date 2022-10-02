package oops.inheritance;
class Address{
    int pincode;
    String street,landmark;
    public Address(int pincode, String street, String landmark) {
        this.pincode = pincode;
        this.street = street;
        this.landmark = landmark;
    }
    public int getPincode() {
        return pincode;
    }
    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getLandmark() {
        return landmark;
    }
    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }
    @Override
    public String toString() {
        return "Address [pincode=" + pincode + ", street=" + street + ", landmark=" + landmark + "]";
    }
}
class Employee{
    private int id;
    private String name;
    private Address address;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", address=" + address.toString() + "]";
    }
}
public class HasARelation {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setAddress(new Address(495452, "Hinjawadi", "Near Royal inn"));
        e.setId(1);
        e.setName("Deepak");
        System.out.println(e.toString());
    }
}
