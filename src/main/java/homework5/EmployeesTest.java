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
        employee1.employeesName();
        employee1.employeesSurname();
        employee1.employeesAge();
        employee1.employeesGender();
        employee1.employeesDepartment();
        System.out.println("====================================");
        employee2.employeesName();
        employee2.employeesSurname();
        employee2.employeesAge();
        employee2.employeesGender();
        employee2.employeesDepartment();
        System.out.println("====================================");


    }
}
