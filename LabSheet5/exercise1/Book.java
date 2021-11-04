package LabSheet5.exercise1;


public class Book {

    private String title;
    private  double price;
    private String ISBN;
    private int pages;

    public Book(){
        this("Not available",0.00,"Not Available",0);
    }

    public Book(String title, double price, String ISBN, int pages){

        this.setTitle(title);
        this.setPrice(price);
        this.setISBN(ISBN);
        this.setPages(pages);

    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getPages() {
        return pages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String toString(){
        return getTitle() +   getPrice()   + getISBN()  + getPages();
    }
}
