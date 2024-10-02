import java.util.Objects;

public class Employee {
    private int iD;
    private String fullName;
    private int department;
    private double salary;
    private static int count;


    // Constructor
    public Employee(String fullName, int department, double salary) {
        this.iD = ++count;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }


    // Get && Set
    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    // toString
    @Override
    public String toString() {
        return "Сотрудник {" +
                "iD = " + iD +
                ", Ф.И.О. = " + fullName +
                ", Департамент = " + department +
                ", ЗП = " + salary +
                '}';
    }

    // Equal & Hash
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return iD == employee.iD && department == employee.department && salary ==
                employee.salary && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iD, fullName, department, salary);
    }
}

