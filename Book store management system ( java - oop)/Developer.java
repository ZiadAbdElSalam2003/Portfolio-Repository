package com.mycompany.oopproject;
public class Developer extends Person {
    private String username;
    private String datehired;
    private long salary ;

    public Developer(String name, String address, String phoneno, long password,String username,String datehired, long salary) {
        super(name, address, phoneno,password);
        this.username=username;
        this.datehired = datehired;
        this.salary = salary;}

    public String getUsername() {
        return username;}

    public String getDatehired() {
        return datehired;}

    public long getSalary() {
        return salary;}
    
    @Override
    public long getpassword (){
        return password;}
}
