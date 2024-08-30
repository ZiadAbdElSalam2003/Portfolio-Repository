package dradelassignedited;

import java.util.Scanner;

public class Linkedlist {

    static long Id = 1001;

    class Node {

        long id, st_id, course_id;
        String name;
        Node down, next;

        Node(long id, String n) {
            this.id = id;
            course_id = st_id = 0;
            down = next = null;
            name = n;
        }

        Node(long id, long course, String n, Node down, Node next) {
            st_id = id;
            course_id = course;
            name = n;
            this.down = down;
            this.next = next;
        }

        Node(long id, Node next, String n) {
            this.id = id;
            course_id = st_id = 0;
            name = n;
            down = null;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;

    Linkedlist() {
        head = tail = null;
    }

    public void print() {
        for (Node temp = head; temp != null; temp = temp.next) {
            System.out.println(temp.id + "__" + temp.name);
        }
    }

    public boolean isempty() {
        if (head == tail && head == null) {
            return true;
        } else {
            return false;
        }
    }

    public void addtohead(String n) {
        if (isempty()) {
            head = tail = new Node(Id, n);
        } else {
            head = new Node(Id, head, n);
        }
        Id++;
    }

    static Linkedlist stu = new Linkedlist();
    static Linkedlist c = new Linkedlist();

    public void add_st_to_course(long stid, long cid) {
        Node tmp1, tmp2;
        //if(!(stid>1000&&stid<1011&&cid<1016&&cid>1010)){System.out.println("ERROR"); return;}
        for (tmp1 = stu.head; tmp1 != null && (tmp1.id != stid); tmp1 = tmp1.next);
        for (tmp2 = c.head; tmp2 != null && tmp2.id != cid; tmp2 = tmp2.next);
        if (tmp1 == null || tmp2 == null) {
            System.out.println("Not found");
            return;
        }
        if (tmp1.down == tmp2.down && tmp1.down == null) {
            tmp1.down = tmp2.down = new Node(stid, cid, tmp2.name, null, null);
            System.out.println("added successfully");
            return;
        }
        if (tmp1.down == null) {
            tmp2.down = new Node(stid, cid, tmp2.name, null, tmp2.down);
            tmp1.down = tmp2.down;
            System.out.println("added successfully");
            return;
        }
        if (tmp2.down == null) {
            tmp1.down = new Node(stid, cid, tmp2.name, tmp1.down, null);
            tmp2.down = tmp1.down;
            System.out.println("added successfully");
            return;
        } else {
            tmp1.down = tmp2.down = new Node(stid, cid, tmp2.name, tmp1.down, tmp2.down);
            System.out.println("added successfully");
        }
    }

    public void print_st_courses(long stid) {
        Node tmp;
        //if(!(stid>1000&&stid<1011)){System.out.println("Not found"); return;}
        for (tmp = stu.head; tmp != null && tmp.id != stid; tmp = tmp.next);
        if (tmp == null) {
            System.out.println("Not found");
            return;
        }
        if (tmp.down == null) {
            System.out.println("Empty");
        }
        while (tmp.down != null) {
            System.out.println(tmp.down.course_id + "__" + tmp.down.name);
            tmp = tmp.down;
        }
    }

    public void print_sts_incourse(long cid) {
        Node tmp;
        int count = 0;
        //if(!(cid<1016&&cid>1010)){System.out.println("Not found"); return;}
        for (tmp = c.head; tmp != null && tmp.id != cid; tmp = tmp.next);
        if (tmp == null) {
            System.out.println("Not found");
            return;
        }
        System.out.println("Students in " + tmp.name);
        if (tmp.down != null) {
            System.out.println(tmp.down.st_id);
            if (tmp.down.next == null) {
                return;
            }
            if (tmp.down.next != null) {
                System.out.println(tmp.down.next.st_id);
            }
            tmp = tmp.down.next.next;
            while (tmp != null) {
                System.out.println(tmp.st_id);
                tmp = tmp.next;
            }
        } else {
            System.out.println("Empty");
        }

    }

    public void delete(long stid, long cid) {
        Node tmp1, tmp2, tmp11, tmp22;

        for (tmp1 = stu.head; tmp1 != null && !(tmp1.id == stid); tmp1 = tmp1.next);
        for (tmp2 = c.head; tmp2 != null && tmp2.id != cid; tmp2 = tmp2.next);
        if (tmp1 == null || tmp2 == null) {
            System.out.println("Not found ");
            return;
        }
        if (tmp1.down == tmp2.down && tmp1.down == null) {
            System.out.println("Not found ");
            return;
        }
        if (tmp1.down.down == null && tmp2.down.next == null) {
            tmp1.down = tmp2.down = null;
            return;
        }
        for (tmp11 = tmp1; tmp11.down != null && !(tmp11.down.course_id == cid); tmp11 = tmp11.down);
        tmp11.down = tmp11.down.down;
        if (tmp2.down != null && tmp2.down.st_id == stid) {
            tmp2.down = tmp2.down.next;
            return;
        }
        for (tmp22 = tmp2.down; tmp22 != null && !(tmp22.next.st_id == stid); tmp22 = tmp22.next);
        tmp22.next = tmp22.next.next;
        System.out.println("Deleted successfully");
    }

    public static void instances() {
        stu.addtohead("ziad");
        stu.addtohead("mohamed");
        stu.addtohead("abd");
        stu.addtohead("salam");
        stu.addtohead("hamed");
        stu.addtohead("eslam");
        stu.addtohead("nour");
        stu.addtohead("hamed");
        stu.addtohead("adel");
        stu.addtohead("fares");
        c.addtohead("data");
        c.addtohead("math");
        c.addtohead("art");
        c.addtohead("social");
        c.addtohead("calc");
    }

    public static void display() {
        Scanner sc = new Scanner(System.in);
        int out = 0;
        while (out != 1) {
            System.out.println("Choose from menu:"
                    + "1-add student to course  "
                    + "2-students in course   "
                    + "3-courses student enroll  "
                    + "4-Students of college  "
                    + "5-The courses  "
                    + "6-delet course  "
                    + "7-Exit");
            int x = sc.nextInt();
            if (x == 1) {
                System.out.println("Enter student id and course id");
                int y = sc.nextInt();
                int z = sc.nextInt();
                stu.add_st_to_course(y, z);
            }
            if (x == 2) {
                System.out.println("Enter course id");
                int y = sc.nextInt();
                stu.print_sts_incourse(y);
            }
            if (x == 3) {
                System.out.println("Enter student id ");
                int y = sc.nextInt();
                stu.print_st_courses(y);
            }
            if (x == 4) {
                stu.print();
            }
            if (x == 5) {
                c.print();
            }
            if (x == 6) {
                System.out.println("Enter student id and course id");
                int y = sc.nextInt();
                int z = sc.nextInt();
                stu.delete(y, z);
            }
            if (x == 7) {
                out++;
            }
            if (x < 1 || x > 7) {
                System.out.println("Try again");
            }
        }
    }

}
