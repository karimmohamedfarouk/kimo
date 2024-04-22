
package javaapplication28;
import javax.swing.JOptionPane;
public class Order {
    int customerid;
    int orderid;
    
    double totalprice;

    public Order(int customerid, int orderid, double totalprice) {
        this.customerid = customerid;
        this.orderid = orderid;
        this.totalprice = totalprice;
    }
    
    public void printorderinfo(Product[] prod){
        
        System.out.println("the customer:"+customerid);
        System.out.println("the orderid:"+orderid);
        
        for(int i=0;i<prod.length;i++){
            System.out.println(prod[i].getName()+"-"+prod[i].getPrice());
//JOptionPane.showMessageDialog(null,prod[i].getName()+"-"+prod[i].getPrice() );
        }
        //JOptionPane.showMessageDialog(null, "the total price is"+totalprice);
        System.out.println("the total price is:"+totalprice);
    }
}
