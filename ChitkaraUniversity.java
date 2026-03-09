

class Employee{
    int id;
    String name;
    double baseSalary;

    Employee(int id, String name, double baseSalary) {
        this.baseSalary = baseSalary;
        this.name = name;
        this.id = id;
    }

    double calculateSalary(){
        return 0;
    }
}
class FullTimeEmployee extends Employee{
    double bonus;

    FullTimeEmployee(int id, String name, double baseSalary, double bonus) {
        super(id, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    double calculateSalary(){
        return baseSalary + bonus;
    }
}

class PartTimeEmployee extends Employee{
    int numOfWorkingHours;
    int wagesPerHour;

    public PartTimeEmployee(int id, String name, int numOfWorkingHours, int wagesPerHour) {
        super(id, name, 0);
    }

    @Override
    double calculateSalary(){
        return numOfWorkingHours * wagesPerHour;
    }
}
public class ChitkaraUniversity {

    Employee e1 = new FullTimeEmployee(1, "Raman", 80000, 5800);
    Employee e2 = new PartTimeEmployee(2, "Rahul", 4, 3500);
    
}
