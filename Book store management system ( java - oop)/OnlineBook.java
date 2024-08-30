package com.mycompany.oopproject;
public class OnlineBook extends Book{
    public OnlineBook(String existance,String title, String author, String publisher, long publishingyear, long nopages, String type,long price) {
        super(existance ,title, author, publisher, publishingyear, nopages, type,price);
    }

@Override
    public int getReadingcost() {
        return Readingcost+1; //one dollar fees
    }  

    @Override
    public String toString() {
        return "Book{" + "Isbn=" + super.getIsbn() + ", i=" + i + ", Readingcost=" + this.getReadingcost() + '}';
    }
    
    
    
}
