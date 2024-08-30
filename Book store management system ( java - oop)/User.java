package com.mycompany.oopproject;
public class User extends Person {
    private long libraryid;
    public User(String name, String address, String phoneno, long password,long libraryid) {
        super(name, address, phoneno, password);
        this.libraryid = libraryid;}
    
    public long getLibraryid() {
        return libraryid;}

    @Override
    public long getpassword (){
        return password;}}




