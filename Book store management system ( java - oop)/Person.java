package com.mycompany.oopproject;
public abstract class Person {
    private String name ;
    private String address ;
    private String phoneno ;
    protected long password;
 public Person(String name, String address, String phoneno, long password) {
        this.name = name;
        this.address = address;
        this.phoneno = phoneno;
        this.password=password;}

    public String getName() {
        return name;}

    public String getAddress() {
        return address;}

    public String getPhoneno() {
        return phoneno;}
    
    public abstract long getpassword();{}
    
}
