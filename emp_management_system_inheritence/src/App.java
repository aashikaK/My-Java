public class App {
    public static void main(String[] args) throws Exception {
       
    }
}
class Employee{
    String eName;
    int eId;
    double salary;

    Employee(String ename,int eId,double salary){
        eName=ename;
        this.eId=eId;
        this.salary=salary;
    }
    public void displayInfo(){
        System.out.println("The name of employee with emp id: "+eId+" is: "+eName+" and salary is:"+salary);
    }
}
class FullTimeEmp extends Employee{
    double bonus;
    FullTimeEmp(int eId,String eName,double salary,double bonus){
        super(eName, eId, salary);
        this.bonus=bonus;
    }
    public void displayInfo(){
        double totalSalary= salary+bonus;
        System.out.println("The total salary of full time worker is: "+totalSalary);
    }
}
class PartTimeEmp extends Employee{
    int workHours;
    double ratePerHr;
    PartTimeEmp(int eId,String eName,double salary,double ratePerHr,int workHours){
        super(eName, eId, salary);
        this.ratePerHr=ratePerHr;
        this.workHours=workHours;
    }
    public void displayInfo(){
        double totalSalary= workHours*ratePerHr;
        System.out.println("The total salary of part time worker is: "+totalSalary);
    }
}
