
package javaapplication28;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Cart {
    private int customerid;
    private int nproducts=4;
    Product[] prod;
    

    public Cart(int customerid, int nproducts) {
        this.customerid = customerid;
        this.nproducts = nproducts;
        
    }
 
    
    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public int getNproducts() {
        return nproducts;
    }

    public void setNproducts(int nproducts) {
        this.nproducts = nproducts;
    }

    public Product[] getProd() {
        return prod;
    }

    public void setProd(Product[] prod) {
        this.prod = prod;
    }
    public void addproduct(Product p,Product[] prods){
       for(int i=0;i<prods.length;i++){
            if(prods[i]==null){
            prods[i]=p;
            break;
            }
            
        }
        
    }
    public void removeproduct(Product p,Product[] prods){
        boolean flag=true; 
        for(int i=0;i<prods.length;i++){
            if(prods[i]==p){
               flag=true;
            }
            else{
                System.out.println("this product doesnot exist in the cart");
                flag=false;
                break;
            }
        }
        Product[] newprod=new Product[prods.length-1];
        int m=0;
        if(flag){
        for(int i=0;i<newprod.length;i++){
            if(newprod[m]!=prods[i]){
                newprod[m]=prods[i];
                m++;
            }
            else{
               continue; 
            }
        }
        
    }   
}
    public double calculateprice(Product[] prods){
        double prices=0;
        for(int i=0;i<prods.length;i++){
            prices+=prods[i].getPrice();
        }
        return prices;
        
    }
    public Product[] placeorder(){
        prod=new Product[nproducts];
        ClothingProduct p1=new ClothingProduct("medium","coton",2,"smartphone",19.99);
         ElectronicProduct p2=new ElectronicProduct("samsung",1,1,"smartphone",599.99);
        BookProduct p3=new BookProduct("OReily","XPublication",3,"OOP",39.99);
        Scanner input=new Scanner(System.in);
        int choice2,choice;
        //for(int j=0;j<4;j++){
        for(int j=0;j<prod.length;j++){
            //System.out.println("trial number "+j);
            System.out.println("enter your choice\n1.smartphone\n2.t_shirt\n3.OOP");
         choice=input.nextInt();
                 //Integer.parseInt(JOptionPane.showInputDialog("enter your choice\n1.smartphone\n2.t_shirt\n3.OOP"));
       //JOptionPane.showMessageDialog(null, "you chose product number :"+choice);
            
          switch (choice){
            case 1:
                System.out.println("enter your choice\n1.addproduct\n2.removeproduct");
                choice2=input.nextInt();
                        //Integer.parseInt(JOptionPane.showInputDialog("enter your choice\n1.addproduct\n2.removeproduct"));
      //JOptionPane.showMessageDialog(null, "you added :"+choice);
                switch (choice2){
                    case 1:
                        addproduct(p1,prod);
                        break;
                    case 2:
                        removeproduct(p1,prod);
                   break;
                }
                break;
            case 2:
                System.out.println("enter your choice\n1.addproduct\n2.removeproduct");
                choice2=input.nextInt();
                        //Integer.parseInt(JOptionPane.showInputDialog("enter your choice\n1.addproduct\n2.removeproduct"));
      //JOptionPane.showMessageDialog(null, "you added :"+choice);
                switch (choice2){
                    case 1:
                        addproduct(p2,prod);
                        break;
                    case 2:
                        removeproduct(p2,prod);
                        break;
                }
                break;
                    case 3:
                        System.out.println("enter your choice\n1.addproduct\n2.removeproduct");
                choice2=input.nextInt();
                        //Integer.parseInt(JOptionPane.showInputDialog("enter your choice\n1.addproduct\n2.removeproduct"));
      //JOptionPane.showMessageDialog(null, "you added :"+choice);
                switch (choice2){
                    case 1:
                        addproduct(p3,prod);
                        break;
                    case 2:
                        removeproduct(p3,prod);
                        break;
                }
                break;
        }
    }
        return prod;
          
}}
   /*switch (choice){
            case 1:
                System.out.println("enter your choice\n1.addproduct\n2.removeproduct");
                choice=input.nextInt();
                switch (choice){
                    case 1:
                        addproduct(p1);
                        break;
                    case 2:
                        removeproduct(p1);
                   break;
                }
                break;
            case 2:
                System.out.println("enter your choice\n1.addproduct\n2.removeproduct");
                choice=input.nextInt();
                switch (choice){
                    case 1:
                        addproduct(p2);
                        break;
                    case 2:
                        removeproduct(p2);
                        break;
                }
                break;
                    case 3:
                        System.out.println("enter your choice\n1.addproduct\n2.removeproduct");
                choice=input.nextInt();
                switch (choice){
                    case 1:
                        addproduct(p3);
                        break;
                    case 2:
                        removeproduct(p3);
                        break;
                }
                break;
        }
        } */ 


    //adds products by entering the product name then putting it in the array
    /*int[] addproduct(int productid){
        for(int i=0;i<products.length;i++){
            products[i]=productid;
        }
        return products;
    }
    //removes a product from the cart of purchases by removing it from the array
    int[] removeproduct(int productid,int []product){
        int m=0;
        int []newproducts=new int[products.length-1];
        for(int i=0;i<product.length;i++){
            if(product[i]!=productid){
               newproducts[m]=product[i]; 
            }
            else
                continue;
        }
        return newproducts;
    }*/