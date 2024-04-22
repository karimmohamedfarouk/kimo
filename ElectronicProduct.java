
package javaapplication28;

public class ElectronicProduct extends Product {
     private String brand;
     private int warryperiod;

    public ElectronicProduct(int productid, String productname, double price) {
        super(productid, productname, price);
    }

    
    public ElectronicProduct(String brand, int warryperiod, int productid, String productname, double price) {
        super(productid, productname, price);
        this.brand = brand;
        this.warryperiod = warryperiod;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWarryperiod() {
        return warryperiod;
    }

    public void setWarryperiod(int warryperiod) {
        this.warryperiod = warryperiod;
    }
    
}
