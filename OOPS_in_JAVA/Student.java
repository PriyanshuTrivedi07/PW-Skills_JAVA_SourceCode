package OOPS_in_JAVA;


//creating a new data type 'Student'
public class Student {
    String name ;
    int rno;
    double percentage;
    final String schoolName = "Jnv,Etah";
    private static int numberOfStudent; // shared property (static property)
    // Getter
    public int getRno(){
        return rno; //bcz we can use private attribute inside the class atleast
    }
    public static int getNumberOfStudent(){
        return numberOfStudent;
    }
    // Setter
    public void setRno(int rno){
        this.rno = rno; //this refers to the class Student
        return;
    }
    // Default Constructor (empty) :
    // public Student(){

    // }
    // "Constructor" (without using this keyword)
    // public Student(String naam, int roll, double per){ // we can also give less no. of properties even 0 in constructor as parameter;
    //     name = naam;
    //     rno = roll;
    //     percentage = per;
    // }

    // "Constructor" when the variable name is same -> then we use 'this' keyword
    public Student(String name, int rno, double percentage){
        this.name = name;
        this.rno = rno;
        this.percentage = percentage;
        numberOfStudent++;
    }
}
