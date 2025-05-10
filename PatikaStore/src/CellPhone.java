public class CellPhone extends Product {
    private int batteryPower;
    private String color;
    public CellPhone(){
        super();
    }

    public CellPhone(int id,
                     double price,
                     double unitPrice,
                     double discountRate,
                     int stockAmount,
                     String productName,
                     Brand brand,
                     int storage,
                     double screenSize,
                     int batteryPower,
                     int RAM,
                     String color
                     ){
        super(id,productName, brand,price,unitPrice,discountRate,stockAmount,screenSize,storage,RAM);
        this.batteryPower = batteryPower;
        this.color = color;

    }




    public int getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }


    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "CellPhone{" +
                "batteryPower=" + batteryPower +
                ", color='" + color + '\'' +
                '}';
    }
}
