import java.util.*;

public class SCRS{
    public static int code, capacity, slot;
    public static String title, description, schedule;
    
    public static void course(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Course Details: ");
        System.out.println("Enter the Course Code: ");
        code = sc.nextInt();
        System.out.println("Enter the Course Capacity: ");
        capacity = sc.nextInt();
        System.out.println("Enter the Course Title: ");
        title = sc.next();
        System.out.println("Enter the Course Description: ");
        description = sc.next();
        System.out.println("Enter the Course Schedule: ");
        schedule = sc.next();
    }

    public static void student(){
        int student_id;
        String name, reg_course;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student Details: ");
        System.out.println("Enter the Student Id: ");
        student_id = sc.nextInt();
        System.out.println("Enter the Student Name: ");
        name = sc.next();
        System.out.println("Enter the Student Reg_Course: ");
        reg_course = sc.next();
    }

    public static void listing(){
        int i=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Available courses: " + code + " " + capacity + " " + title + " " + description + " " + schedule);
        System.out.println("Available Slots: " + slot);
        System.out.println("Enter 1. if you want to register for course: ");
        i = sc.nextInt();
        if(i == 1){
            System.out.println("Enter the details for course registration");
            student();
            course();
        }
    }

    public static void removal(){
        int k=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Course Code want to remove: ");
        k = sc.nextInt();
        if(k == code);
        System.out.println("Course removed.");
    }

    public static void main(String args[]){
        int j=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose any option: 1. To enter student details \n2. To enter course details \n3. To see Course Listing and to register course\n4. To remove any registered course");
        j = sc.nextInt();
        if(j == 1)
        student();
        else if(j == 2)
        course();
        else if(j == 3)
        listing();
        else if(j == 4)
        removal();
        else
        System.out.println("You entered a wrong key");
    }
}