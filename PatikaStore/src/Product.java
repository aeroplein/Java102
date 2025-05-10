public abstract class Product {
    private int id;
    private String productName;
    private Brand brand;
    private double price;
    private double unitPrice;
    private double discountRate;
    private int stockAmount;
    private double screenSize;
    private int RAM;
    private String color;
    private int storage;
    public Product(){

    }



    public Product(int id, String productName, Brand brand, double price, double unitPrice,
                   double discountRate, int stockAmount, double screenSize,int storage, int RAM) {
        this.id = id;
        this.productName = productName;
        this.brand = brand;
        this.price = price;
        this.unitPrice = unitPrice;
        this.discountRate = discountRate;
        this.stockAmount = stockAmount;
        this.screenSize = screenSize;
        this.storage = storage;
        this.RAM = RAM;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }


    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", brand=" + brand +
                ", price=" + price +
                ", unitPrice=" + unitPrice +
                ", discountRate=" + discountRate +
                ", stockAmount=" + stockAmount +
                ", screenSize=" + screenSize +
                ", RAM=" + RAM +
                ", color='" + color + '\'' +
                '}';
    }


    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }
}
