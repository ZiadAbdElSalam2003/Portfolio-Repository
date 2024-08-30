package com.mycompany.oopproject;
public class OfflineBook extends Book {

    public OfflineBook(String existance, String title, String author, String publisher, long publishingyear, long nopages, String type, long price) {
        super(existance, title, author, publisher, publishingyear, nopages, type, price);
    }
        
        //Reading cost by book
    public int getReadingcost(int nobooks) {
        return Readingcost+(2*nobooks); //two dollar fees
    }
            //Reading cost by hour
    public double getReadingcost(double hours) {
        return Readingcost+(2*hours); //two dollar for hour
    }

    
    
}
