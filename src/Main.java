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
                result = result + sumNew.getSalary();
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
                result = result + sumNew.getSalary();
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
    }
}