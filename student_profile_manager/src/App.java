public class App {
    public static void main(String[] args) throws Exception {
       Student std= new Student("Anna",98);
       std.marks=97; //changed the alue of marks
       Student std2= new Student(std); //obj for copy constructor orr oj initialied by copy constructor
       System.out.println("Student "+std.stdName+" got "+std.marks+" marks.");
       System.out.println("Student "+std2.stdName+" got "+std2.marks+" marks.");
    }
}

class Student{
    String stdName;
    int marks;

    Student(String sName,int marks){
        stdName=sName;
        this.marks=marks;
    }
    // copy constructor
    Student(Student stdObj){
        stdName=stdObj.stdName;
        marks=stdObj.marks;
    }
}