package homework8;

public class DepartmantTest extends Departmant {
    public static void main(String[] args) {
        Male maleTeamLead = new Male("Ali","Tas","07.05.1992");
        Female femaleStaff = new Female("ayse","fatma","07.05.1940");
        Department department = new Department(maleTeamLead);
        department.addStaff(femaleStaff);
        department.removeStaff(maleTeamLead);
        department.addTask("Task 1");
        System.out.println("Task1 added");
        department.addTask("Task 2");
        System.out.println("Task2 added");
    }
}
