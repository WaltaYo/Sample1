public class InventoryModel {
    private String Name;
    private double price;
    public InventoryModel(String name, double price) {
        Name = name;
        this.price = price;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    
}
