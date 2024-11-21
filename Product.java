package lab4;

public class Product {
    private int id;
    private String name;
    private String manufacturer;
    private double price;
    private int expirationDays;  // Термін зберігання в днях
    private int quantity;

    // Конструктор
    public Product(int id, String name, String manufacturer, double price, int expirationDays, int quantity) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.expirationDays = expirationDays;
        this.quantity = quantity;
    }

    // Методи set та get для кожного поля
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setExpirationDays(int expirationDays) {
        this.expirationDays = expirationDays;
    }

    public int getExpirationDays() {
        return expirationDays;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    // Метод для виведення інформації про товар
    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + '\'' + ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price + ", expirationDays=" + expirationDays + ", quantity=" + quantity + '}';
    }
}
