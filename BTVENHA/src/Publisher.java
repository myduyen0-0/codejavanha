public class Publisher {
    private String name;
    private String address;

    public Publisher(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void displayInfo() {
        System.out.println("Publisher: " + name + ", Address: " + address);
    }
}
