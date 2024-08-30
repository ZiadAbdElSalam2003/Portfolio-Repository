package com.mycompany.oopproject;
public class Information {
    private  String title; 
    private  String author;
    private String publisher;
    private long publishingyear;
    private long nopages;
    private String type;
    private String existance;
    private long price;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public long getPublishingyear() {
        return publishingyear;
    }

    public long getNopages() {
        return nopages;
    }

    public String getType() {
        return type;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPublishingyear(long publishingyear) {
        this.publishingyear = publishingyear;
    }

    public void setNopages(long nopages) {
        this.nopages = nopages;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExistance() {
        return existance;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Information(String existance,String title, String author, String publisher, long publishingyear, long nopages, String type,  long price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publishingyear = publishingyear;
        this.nopages = nopages;
        this.type = type;
        this.existance = existance;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Information{" + "title=" + title + ", author=" + author + ", publisher=" + publisher + ", publishingyear=" + publishingyear + ", nopages=" + nopages + ", type=" + type + ", existance=" + existance + ", price=" + price + '}';
    }
    
    
    
}
