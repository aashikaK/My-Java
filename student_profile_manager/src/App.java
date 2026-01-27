public class App {
    public static void main(String[] args) throws Exception {
       
    }
}

public class Student{
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