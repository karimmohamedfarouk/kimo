/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication28;

/**
 *
 * @author dell
 */
public class BookProduct extends Product{
    private String author,publisher;

    public BookProduct(int productid, String productname, double price) {
        super(productid, productname, price);
    }

    

    public BookProduct(String author, String publisher, int productid, String productname, double price) {
        super(productid, productname, price);
        this.author = author;
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
}
