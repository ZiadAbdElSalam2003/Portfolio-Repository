package com.mycompany.oopproject;
public class  Book {
    private static long x=1001;
    private long Isbn;
    Information i;
    int Readingcost=2;

    public Book(String existance,String title, String author, String publisher, long publishingyear, long nopages, String type,long price) {
        this.Isbn = x;
        this.i = new Information(existance,title, author, publisher, publishingyear, nopages, type , price);
        x++;}
    public long getIsbn() {
        return Isbn;}

    public int getReadingcost() {
        return this.Readingcost;}

    @Override
    public String toString() {
        return "Book{" + "Isbn=" + Isbn + ", i=" + i + ", Readingcost=" + Readingcost + '}';
    }


    
    
    


   
    
    
    
    
    
}
