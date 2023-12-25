package homework5;

public class EmployeesTest {
    public static void main(String[] args){
        Employees employee1= new Employees();
        Employees employee2= new Employees();

        employee1.name = "Ali isa";
        employee1.surname = "Tas";
        employee1.age = 31;
        employee1.gender = "Man";
        employee1.department = "QA Engineer";

        employee2.name= "Elon";
        employee2.surname = "Musk";
        employee2.age = 52;
        employee2.gender = "Man";
        employee2.department = "Co Founder of SpaceX";

        System.out.println("====================================");
        employee1.employeeName();
        employee1.employeeSurname();
        employee1.employeeAge();
        employee1.employeeGender();
        employee1.employeeDepartment();
        System.out.println("====================================");
        employee2.employeeName();
        employee2.employeeSurname();
        employee2.employeeAge();
        employee2.employeeGender();
        employee2.employeeDepartment();
        System.out.println("====================================");


    }
}
