package homework8;
import java.util.ArrayList;
import java.util.List;
public class Departmant {
    public static abstract class Person {
        String name;
        String surname;
        String dateOfBirth;

        Person(String name, String surname, String dateOfBirth) {
            this.name = name;
            this.surname = surname;
            this.dateOfBirth = dateOfBirth;
        }

        abstract int calculateRetirementAge();
    }

    static class Male extends Person {
        Male(String name, String surname, String dateOfBirth) {
            super(name, surname, dateOfBirth);
        }

        @Override
        int calculateRetirementAge() {
            return 65;
        }
    }

        static class Female extends Person {
            Female(String name, String surname, String dateOfBirth) {
                super(name, surname, dateOfBirth);
            }

        @Override
        int calculateRetirementAge() {
            return 60;
        }
    }

    static class Department {
        Male teamLead;
        List<Person> personnelList;
        List<String> assignments;

        Department(Male teamLead) {
            this.teamLead = teamLead;
            this.personnelList = new ArrayList<>();
            this.assignments = new ArrayList<>();
            personnelList.add(teamLead);
        }

        void addStaff(Person staff) {
            personnelList.add(staff);
        }

        void removeStaff(Person staff) {
            personnelList.remove(staff);
        }

        void addTask(String task) {
            assignments.add(task);
        }

    }

}
