
package javaapplication28 ;        //javaapplication28
import javax.swing.JOptionPane;
import java.util.Scanner;
public class JavaApplication28 {
        
             
   
    public static void main(String[] args) {
        //new JavaApplication28();
        /*String names=JOptionPane.showInputDialog("enter your name");
        JOptionPane.showMessageDialog(null,"hello" +names);
        int customersid=Integer.parseInt(JOptionPane.showInputDialog("enter your customerid"));
        JOptionPane.showMessageDialog(null, "your"+customersid);
        int sizes=Integer.parseInt(JOptionPane.showInputDialog("enter your size"));
        JOptionPane.showMessageDialog(null, "your"+sizes);
        String address=JOptionPane.showInputDialog("enter your address11");
        JOptionPane.showMessageDialog(null,"hello" +address);*/
        Scanner i=new Scanner(System.in);
        System.out.println("enter the number of products you want to enter");
        int size=i.nextInt();
        System.out.println("enter your customerid");
        int customerid=i.nextInt();
        System.out.println("enter your name");
        String name=i.next();
        System.out.println("enter your address");
        String address=i.next();
        Customer customer=new Customer(customerid,name,address);
        Cart c=new Cart(customerid,size);
        c.setNproducts(size);
        //System.out.println("the length of array"+c.prod.length+"the size is"+c.nproducts);
        ClothingProduct p1=new ClothingProduct("XXL","silk",2,"t_shirt",19.99);
        ElectronicProduct p2=new ElectronicProduct("samsung",1,1,"smartphone",599.99);
        BookProduct p3=new BookProduct("O Reily","XPublications",3,"OOP",39.99);
        Product[] prods=c.placeorder();
        double totalprice=c.calculateprice(prods);
        Order order=new Order(customerid,1,totalprice);
       order.printorderinfo(prods);
    }
    
}
/*import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;*/