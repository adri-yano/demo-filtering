package homebsr1;

public class House {
    private String location;
    private double price;
    private String type; // buy, sell, rent

    // Constructor, Getters, and Setters
    public House(String location, double price, String type) {
        this.location = location;
        this.price = price;
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
}