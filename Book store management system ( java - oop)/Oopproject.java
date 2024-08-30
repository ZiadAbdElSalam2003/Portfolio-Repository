package com.mycompany.oopproject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class Oopproject {
    public static void main(String[] args) {
        Developer d1=new Developer("Ziad","Alexandria","01255378310",1444,"developer","12/12/2030",5000);
        User u1=new User("mohamed","Alexandria","01054377320",1555,777);
        OnlineBook on1=new OnlineBook("online","Book Lovers","Emily Henry","Berkley",2022,377,"romance",10);
        OnlineBook on2=new OnlineBook("online","Big Tree","Brian Selznick","Scholastic Press",2023,528,"fantasy",22);
        OnlineBook on3=new OnlineBook("online","Wonderstruck","Brian Selznick","Scholastic Press",2011,640,"Historical Fiction",0);
        OfflineBook off1=new OfflineBook("offline","Lunch Money","Brian Selznick","Aladdin Paperbacks",2005,224,"Realistic Fiction",8);
        OfflineBook off2=new OfflineBook("offline","Lunch Money","Bonner Litchfield","Book Dawg Publishing",2019,248,"crime",5);
        OfflineBook off3=new OfflineBook("offline","Book Lovers","Emily Henry","Berkley",2022,377,"romance",10);
        ArrayList<OnlineBook> online=new ArrayList();   online.addAll(Arrays.asList(on1,on2,on3));
        ArrayList<OfflineBook> offline=new ArrayList();  offline.addAll(Arrays.asList(off1,off2,off3));
    
        Scanner sc=new Scanner(System.in);
        int start=0;
        while(start!=1){
        System.out.println("          ***WELCOME TO OUR LIBRARY***");
        System.out.println("PLEASE CHOOSE FROM MENU");
        System.out.println("1: SYSTEM USER");
        System.out.println("2: USER");
        System.out.println("3: EXIT");
        int login=sc.nextInt();
        switch(login){
            case 1:
                   while(true){
                       System.out.println("Enter your username: "); String username=sc.next();
                       System.out.println("Enter your password: "); long password1=sc.nextLong();
                       if(username.equalsIgnoreCase(d1.getUsername()) && password1==d1.password)break;
                       else System.out.println("wrong Data try again");
                       int count=0; count++;
                       if (count==3)return;}
                   int i0=0;
                   while(i0!=1){displaydevemenu();int choose=sc.nextInt(); 
                                switch(choose){
                                     case 1:System.out.print("online/offline/Both?: ");       String existance;
                                            while(true){
                                                existance=sc.next();
                                                if(existance.equalsIgnoreCase("online")||existance.equalsIgnoreCase("offline")||existance.equalsIgnoreCase("BOTH"))break;
                                                else System.out.println("Error try again");}
                                            System.out.print("Enter title: "); String title=sc.next();
                                            System.out.print("Enter author: "); String author=sc.next();
                                            System.out.print("Enter publisher: "); String publisher=sc.next();
                                            System.out.print("Enter publishing year: "); long year=sc.nextLong();
                                            System.out.print("Enter Number of pages: "); long pages=sc.nextLong();
                                            System.out.print("Enter type: "); String type=sc.next();
                                            System.out.print("Enter price: "); long price=sc.nextLong();
                                            addbook(online,offline,existance,title,author,publisher,year,pages,type,price);
                                          break;
                                    case 2: System.out.print("Enter ISBN: "); long isbn1=sc.nextLong();
                                            remove(isbn1,online,offline);
                                          break;  
                                    case 3: int case3=0;
                                            while(case3!=1){
                                                System.out.println("PLEASE CHOOSE FROM MENU");
                                                System.out.println("1:BY ISBN");
                                                System.out.println("2:BY TITLE");
                                                System.out.println("3:EXIT");
                                                int s=sc.nextInt();
                                                switch(s){
                                                    case 1: System.out.println("Enter ISBN:"); long isbn2=sc.nextLong();
                                                            search(isbn2,online,offline);
                                                   break;
                                                    case 2: System.out.println("Enter title:");
                                                            String title1=sc.nextLine();
                                                            title1=sc.nextLine();
                                                            search(title1,online,offline); 
                                                   break;         
                                                    case 3:case3++;
                                                   break;
                                                    default:System.out.println("PLEASE CHOOSE FROM MENU");
                                                   break; 
                                                }
                                             
                                            }
                                          break;
                                    case 4: books(online,offline);
                                          break;
                                    case 5: System.out.println("***KFAYA KDA B2AAAAA***");
                                            i0++;
                                          break;
                                    default: System.out.println("PLEASE CHOOSE FROM MENU");
                                          break;}}
          break;
            case 2:while(true){
                    System.out.println("Enter your Library ID: "); long id=sc.nextLong();
                    System.out.println("Enter your password: ");    long password2=sc.nextLong();
                    if(id==u1.getLibraryid() && password2==u1.password)break;
                    else System.out.println("wrong Data try again");
                    int count=0; count++;
                    if (count==3)return;}
                    int i1=0;
                   while(i1!=1){displayusermenu();int choose=sc.nextInt(); 
                                switch(choose){
                                    case 1: int case3=0;
                                            while(case3!=1){
                                                System.out.println("PLEASE CHOOSE FROM MENU");
                                                System.out.println("1:BY ISBN");
                                                System.out.println("2:BY TITLE");
                                                System.out.println("3:EXIT");
                                                int s=sc.nextInt();
                                                switch(s){
                                                    case 1: System.out.println("Enter ISBN:"); long isbn2=sc.nextLong();
                                                            search(isbn2,online,offline);
                                                   break;
                                                    case 2: System.out.println("Enter title:");
                                                            String title1=sc.nextLine();
                                                            title1=sc.nextLine();
                                                            search(title1,online,offline); 
                                                   break;         
                                                    case 3:case3++;
                                                   break;
                                                    default:System.out.println("PLEASE CHOOSE FROM MENU");
                                                   break; 
                                                }}
                                       break;                                      
                                    case 2:books(online,offline);
                                       break;
                                    case 3:System.out.println("***KFAYA KDA B2AAAA***");
                                            i1++;
                                       break;
                                    default:System.out.println("PLEASE CHOOSE FROM MENU");
                                       break;}}
          break;
            case 3:System.out.println("***YA BA5T MN ZAR W 5AFEF***");
                    start++;
          break;         
            default:System.out.println("PLEASE CHOOSE FROM MENU");
          break; }      
                                       
        
        }}
    
    public static void displaydevemenu(){
        System.out.println("PLEASE CHOOSE FROM MENU");
        System.out.println("1: Add Book");
        System.out.println("2: Remove Book");
        System.out.println("3: Search for Book");
        System.out.println("4: Display all Books");
        System.out.println("5: EXIT");}
        
    public static void displayusermenu(){
        System.out.println("PLEASE CHOOSE FROM MENU");
        System.out.println("1: Search for Book");
        System.out.println("2: Display all Books");
        System.out.println("3: EXIT");}
    
    public static void books(ArrayList on,ArrayList off){
        System.out.println("The online books: ");
        for(int i=0;i<on.size();i++)System.out.println(on.get(i).toString());
        System.out.println("The offline books: ");
        for(int i=0;i<off.size();i++)System.out.println(off.get(i).toString());
        System.out.println("The number books: "+(on.size()+off.size()));}
     
    public static void addbook(ArrayList online , ArrayList offline,String existance,String title,String author,String publisher,long year,long pages,String type,long price){
        if(existance.equalsIgnoreCase("online")){OnlineBook on=new OnlineBook(existance, title, author, publisher, year,pages,type,price); online.add(on);
            System.out.println(on.toString());}
        if(existance.equalsIgnoreCase("offline")){OfflineBook off=new OfflineBook(existance, title, author, publisher, year,pages,type,price); offline.add(off);
        System.out.println(off.toString());}
        if(existance.equalsIgnoreCase("both")){
            OnlineBook on=new OnlineBook(existance, title, author, publisher, year,pages,type,price); online.add(on);
            OfflineBook off=new OfflineBook(existance, title, author, publisher, year,pages,type,price); offline.add(off);
            System.out.println(off.toString());}
        System.out.println("The Book added successfully");}
    
    public static void remove(long isbn,ArrayList<OnlineBook> on,ArrayList<OfflineBook> off){
        int remove=0;
    for(int i=0;i<on.size();i++){
        if(isbn==on.get(i).getIsbn()){on.remove(i); remove++; System.out.println("BOOK REMOVED SUCCESSFULLY");}}
    for(int i=0;i<off.size();i++){    
        if(isbn==off.get(i).getIsbn()){off.remove(i); remove++;System.out.println("BOOK REMOVED SUCCESSFULLY");}
        }if(remove==0)System.out.println("NOT FOUND");}
    
    public static void search(long isbn,ArrayList<OnlineBook> on,ArrayList<OfflineBook> off ){
            int search=0;        
    for(int i=0;i<on.size();i++){
        if(isbn==on.get(i).getIsbn()){System.out.println(on.get(i).toString()); search++;}}
    for(int i=0;i<off.size();i++){   
        if(isbn==off.get(i).getIsbn()){System.out.println(off.get(i).toString()); search++;}}
        if(search==0)System.out.println("NOT FOUND");}
    
    public static void search(String title,ArrayList<OnlineBook> on,ArrayList<OfflineBook> off ){
            int search=0;        
    for(int i=0;i<on.size();i++){
        if(title.equalsIgnoreCase(on.get(i).i.getTitle())){System.out.println(on.get(i).toString()); search++;}}
    for(int i=0;i<off.size();i++){   
        if(title.equalsIgnoreCase(off.get(i).i.getTitle())){System.out.println(off.get(i).toString()); search++;}}
        if(search==0)System.out.println("NOT FOUND");}
    
    
    
    }



