package homework5;

public class Employees {
    String name;
    String surname;
    int age;
    String gender;
    String department;

    public void employeeName(){
        System.out.println("Employee's name: " + name);
    }

    public void employeeSurname(){
        System.out.println("Employee's surname: " + surname);
    }

    public void employeeAge(){
        System.out.println("Employee's age: " + age);
    }

    public void employeeGender(){
        System.out.println( "Employee's gender: " + gender);
    }

    public void employeeDepartment(){
        System.out.println("Employee's department: " + department);
    }
}
