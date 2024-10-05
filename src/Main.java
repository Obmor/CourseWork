public class Main {

    // Create Employee
    public static Employee createEmployee(String name, int department, double salary) {
        return new Employee(name, department, salary);
    }

    // Employee Book
    public static Employee[] employees = new Employee[10];

    // Calculating of salary
    public static double calculateSalaryPerMonth() {
        double result = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee sumNew = employees[i];
            if (sumNew != null) {
                result += sumNew.getSalary();
            }
        }
        return result;
    }

    // Find Min Salary
    public static String findMinSalary() {
        double minSalaryEmployee = employees[0].getSalary();
        String employee = null;
        for (int i = 0; i < employees.length; i++) {
            Employee minSalaryNew = employees[i];
            if (minSalaryNew != null) {
                if (employees[i].getSalary() <= minSalaryEmployee) {
                    employee = "Сотрудник с минимальной ЗП - " +
                            employees[i].getFullName() + ", ЗП составляет - " + employees[i].getSalary();
                }
            }
        }
        return employee;
    }

    // Find Max Salary
    public static String findMaxSalary() {
        double maxSalaryEmployee = employees[0].getSalary();
        String employee = null;
        for (int i = 0; i < employees.length; i++) {
            Employee maxSalaryNew = employees[i];
            if (maxSalaryNew != null) {
                if (employees[i].getSalary() >= maxSalaryEmployee) {
                    maxSalaryEmployee = employees[i].getSalary();
                    employee = "Сотрудник с максимальной ЗП - " +
                            employees[i].getFullName() + ", ЗП составляет - " + employees[i].getSalary();
                }
            }
        }
        return employee;
    }

    // Average Salary
    public static double calculateAverage() {
        double result = 0;
        int averageLenght = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee sumNew = employees[i];
            if (sumNew != null) {
                result += sumNew.getSalary();
                averageLenght = employees.length;
            }
        }
        result = result / averageLenght;

        return result;
    }

    // Print Full Name
    public static void printFullName() {
        String fullName;
        for (int i = 0; i < employees.length; i++) {
            Employee nameNew = employees[i];
            if (nameNew != null) {
                fullName = "Сотрудник - " + employees[i].getFullName();
                System.out.println(fullName);
            }
        }
    }

    // Salary Increasing
    public static void increaseSalary() {
        double newSalary;
        double argument = 1.15;
        String increasedSalary;
        for (int i = 0; i < employees.length; i++) {
            Employee increasedSalaryNew = employees[i];
            if (increasedSalaryNew != null) {
                newSalary = Math.round(employees[i].getSalary() * argument);
                increasedSalary = "Проиндексированная ЗП сотридника "
                        + employees[i].getFullName() + " составляет - " + newSalary;
                System.out.println(increasedSalary);
            }
        }
    }

    // #Dep printing
    public static void printDepartment(int department) {
        System.out.println("Отвел №" + department);
    }

    // Department Min Salary
    public static String calculateMinDepartmentsSalary(int department) {
        double depMinSalaryArgument = employees[department].getSalary();
        String departmentMinSalary = null;
        for (int i = 0; i < employees.length; i++) {
            Employee depMinSalaryNew = employees[i];
            if (depMinSalaryNew != null && employees[i].getDepartment() == department &&
                    depMinSalaryArgument >= employees[i].getSalary()) {
                departmentMinSalary = "Сотрудник отдела №" + employees[i].getDepartment()
                        + " с минимальной ЗП - " + employees[i].getSalary() + " является - "
                        + employees[i].getFullName();
            }
        }
        System.out.println(departmentMinSalary);
        return departmentMinSalary;
    }

    // Department Max Salary
    public static String calculateMaxDepartmentSalary(int department) {
        double depMaxSalaryArgument = employees[department].getSalary();
        String departmentMaxSalary = null;
        for (int i = 0; i < employees.length; i++) {
            Employee depMaxSalaryNew = employees[i];
            if (depMaxSalaryNew != null && employees[i].getDepartment() == department &&
                    depMaxSalaryArgument <= employees[i].getSalary()) {
                departmentMaxSalary = "Сотрудник отдела №" + employees[i].getDepartment()
                        + " с максимальной ЗП - " + employees[i].getSalary() + " является - "
                        + employees[i].getFullName();
            }
        }
        System.out.println(departmentMaxSalary);
        return departmentMaxSalary;
    }

    // Total Salary Per Department
    public static double calculateTotalDepartmentSalary(int department) {
        double totalDepartmentSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee depTotalSalaryNew = employees[i];
            if (depTotalSalaryNew != null && employees[i].getDepartment() == department) {
                totalDepartmentSalary += employees[i].getSalary();
            }
        }
        System.out.println("Сумма затрат на ЗП по отделу №" + department + " равна - " + totalDepartmentSalary);
        return totalDepartmentSalary;
    }

    // Average Salary Per Department
    public static double calculateAverageSalaryPerDepartment(int department) {
        double departmentAverageSalary = 0;
        double finalResult;
        int countOfperson = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee depAverageSalaryNew = employees[i];
            if (depAverageSalaryNew != null && employees[i].getDepartment() == department) {
                departmentAverageSalary += depAverageSalaryNew.getSalary();
                countOfperson++;
            }
        }
        finalResult = departmentAverageSalary / countOfperson;
        System.out.println("Средняя ЗП по отделу №" + department + " равна - " + finalResult);
        return finalResult;
    }

    // Increasing Of Salary
    public static double increaseOfDeartmentSalary(int department) {
        double newSalary;
        double argument = 1.15;
        String increasedDepartmentSalary;
        for (int i = 0; i < employees.length; i++) {
            Employee increasedSalaryNew = employees[i];
            if (increasedSalaryNew != null && employees[i].getDepartment() == department) {
                newSalary = Math.round(employees[i].getSalary() * argument);
                increasedDepartmentSalary = "Проиндексированная ЗП сотридника " + employees[i].getFullName()
                        + ", отдела №" + department
                        + ", составляет - " + newSalary;
                ;
                System.out.println(increasedDepartmentSalary);
            }
        }
        return argument;
    }

    public static void fullNameWithoutDepartment(int department) {
        String fullName;
        for (int i = 0; i < employees.length; i++) {
            Employee nameNew = employees[i];
            if (nameNew != null && employees[i].getDepartment() == department) {
                fullName = "Сотрудник {" +
                        "iD = " + employees[i].getiD() +
                        ", Ф.И.О. = " + employees[i].getFullName() +
                        ", ЗП = " + employees[i].getSalary() +
                        '}';
                System.out.println(fullName);
            }
        }
    }

    public static void comparingSalaryWithMinimalWage(int department, double minimumWage) {
        for (int i = 0; i < employees.length; i++) {
            Employee lowerNew = employees[i];
            Employee upperMew = employees[i];
            if (lowerNew != null && employees[i].getSalary() < minimumWage && employees[i].getDepartment()
                    == department) {
                System.out.println("iD " + employees[i].getiD() + " ЗП сотрудника " + employees[i].getFullName() + " меньше МРОТ - "
                        + minimumWage + " и равна - " + employees[i].getSalary());

            }
            if (upperMew != null && employees[i].getSalary() >= minimumWage && employees[i].getDepartment()
                    == department) {
                System.out.println("iD " + employees[i].getiD() + " ЗП сотрудника " + employees[i].getFullName() + " больше МРОТ - "
                        + minimumWage + " и равна  - " + employees[i].getSalary());
            }
        }
    }

    // Main
    public static void main(String[] args) {

        employees[0] = createEmployee("Айзек Азимов",
                1, 5_000);
        employees[1] = createEmployee("Ледовских Ирина Владимировна",
                2, 10_000);
        employees[2] = createEmployee("Стивен Кинг",
                3, 15_000);
        employees[3] = createEmployee("Артур Пирожков",
                4, 20_000);
        employees[4] = createEmployee("Иешуа Га-Ноцри",
                5, 25_000);
        employees[5] = createEmployee("Мария Кюри",
                1, 30_000);
        employees[6] = createEmployee("Артемий Татьянович Лебедев",
                2, 35_000);
        employees[7] = createEmployee("Сигурни Уивер",
                3, 40_000);
        employees[8] = createEmployee("Маршалл Брюс Мэтерс",
                4, 45_000);
        employees[9] = createEmployee("Махатма Ганди",
                5, 50_000);
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
        System.out.println();

        int department = 1;

        double minimumWage = calculateAverageSalaryPerDepartment(department);

        double total = calculateSalaryPerMonth();
        System.out.println("Сумма затрат на зарплатный фонд - " + total);
        System.out.println();

        System.out.println(findMinSalary());
        System.out.println();

        System.out.println(findMaxSalary());
        System.out.println();

        double average = calculateAverage();
        System.out.println("Средняя За за месяц - " + average);
        System.out.println();

        printFullName();
        System.out.println();

        increaseSalary();
        System.out.println();

        printDepartment(department);
        System.out.println();

        calculateMinDepartmentsSalary(department);
        System.out.println();

        calculateMaxDepartmentSalary(department);
        System.out.println();

        calculateTotalDepartmentSalary(department);
        System.out.println();

        calculateAverageSalaryPerDepartment(department);
        System.out.println();


        increaseOfDeartmentSalary(department);
        System.out.println();

        fullNameWithoutDepartment(department);
        System.out.println();

        comparingSalaryWithMinimalWage(department, minimumWage);
        System.out.println();
    }
}