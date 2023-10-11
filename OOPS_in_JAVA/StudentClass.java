package OOPS_in_JAVA;

public class StudentClass {
    
    
    
    // public static void change(Student s){
    //     s.name = "sudhanshu";
    //     return;
    // }
    public static void main(String[] args) {
        // s1 is a object 
        // Student s1 = new Student(); //declaration
        // s1.name = "Mohit";//initialization
        // s1.rno = 34; //we can't access using "." operator bcz it is private
        // s1.percentage = 43;

        //============  Accessing rno (which is private) using getter function
        // System.out.println(s1.getRno());

        //============  Setting the value of rno (which is private) using Setter function
        // s1.setRno(4234);
        // System.out.println(s1.getRno());


        // System.out.println(s1.name);
        // +++++++++++++ Objects are passed by refrence in java +++++++++++++++++
        // change(s1);
        // System.out.println(s1.name);


        // ++++++++++++++ Constructor ++++++++++++++++++
        // Student s1 = new Student("raghav",43,23.2);
        // System.out.println(s1.name);

        // +++++++++++++ 'static' keyword ++++++++++++

        // here we can access without object (we can set and change the static property also)
        // System.out.println(Student.numberOfStudent);
        // Student.numberOfStudent = 100; 
        // so if we make this property private then we can not get or set this property like this


        System.out.println(Student.getNumberOfStudent());
        Student s1 = new Student("raghav",43,23.2);
        // System.out.println(s1.getNumberOfStudent());
        System.out.println(Student.getNumberOfStudent());
        Student s2 = new Student("rohan", 34, 91.34);
        System.out.println(s2.getNumberOfStudent());
        Student s3 = new Student("rohan", 34, 91.34);
        System.out.println(s3.getNumberOfStudent());
    }
}
