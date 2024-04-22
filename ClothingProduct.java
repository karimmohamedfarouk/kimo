
package javaapplication28;

public class ClothingProduct extends Product {
    private String size;
    private String fabric;

    public ClothingProduct(int productid, String productname, double price) {
        super(productid, productname, price);
    }

    public ClothingProduct(String size, String fabric, int productid, String productname, double price) {
        super(productid, productname, price);
        this.size = size;
        this.fabric = fabric;
    }

   

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }
    
}
