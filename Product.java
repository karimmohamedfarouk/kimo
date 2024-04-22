
package javaapplication28;

public class Product {
    protected int productid;
    protected String productname;
    protected double price;

    public Product(int productid, String productname, double price) {
        this.productid = productid;
        this.productname = productname;
        this.price = price;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getName() {
        return productname;
    }

    public void setName(String name) {
        this.productname = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
