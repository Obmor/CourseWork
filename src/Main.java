public class Main {

    // Printing
    public static void printAllData(Employee[] data) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                System.out.println(data[i]);
            }
        }
    }

    // Calculating of salary
    public static void calculateSalaryPerMonth(Employee[] sum) {
        double result = 0;
        for (int i = 0; i < sum.length; i++) {
            Employee sumNew = sum[i];
            if (sumNew != null) {
                result = result + sumNew.getSalary();
            }
        }
        System.out.println("Сумма затрат за месяц равна " + result);
    }

    // Find Min Salary
    public static void findMinSalary(Employee[] minSalary) {
        double minSalaryEmployee = minSalary[0].getSalary();
        String employee = null;
        for (int i = 0; i < minSalary.length; i++) {
            Employee minSalaryNew = minSalary[i];
            if (minSalaryNew != null) {
                if (minSalary[i].getSalary() <= minSalaryEmployee) {
                    minSalaryEmployee = minSalary[i].getSalary();
                    employee = minSalary[i].getFullName();
                }
            }
        }
        System.out.println("Сотрудник с минимальной ЗП является - " + employee +
                ", ЗП составляет - " + minSalaryEmployee + " рублей.");
    }

    // Find Max Salary
    public static void findMaxSalary(Employee[] maxSalary) {
        double maxSalaryEmployee = maxSalary[0].getSalary();
        String employee = null;
        for (int i = 0; i < maxSalary.length; i++) {
            Employee maxSalaryNew = maxSalary[i];
            if (maxSalaryNew != null) {
                if (maxSalary[i].getSalary() >= maxSalaryEmployee) {
                    maxSalaryEmployee = maxSalary[i].getSalary();
                    employee = maxSalary[i].getFullName();
                }
            }
        }
        System.out.println("Сотрудник с максимальной ЗП является - " + employee +
                ", ЗП составляет - " + maxSalaryEmployee + " рублей.");
    }

    // Average Salary
    public static void calculateAverage(Employee[] average) {
        double result = 0;
        int averageLenght = 0;
        for (int i = 0; i < average.length; i++) {
            Employee sumNew = average[i];
            if (sumNew != null) {
                result = result + sumNew.getSalary();
                averageLenght = average.length;
            }
        }
        result = result / averageLenght;
        System.out.println("Средняя зарплата за месяц = " + result + " рублей.");
    }

    // Print Full Name
    public static void printFullName(Employee[] name) {
        String fullName;
        for (int i = 0; i < name.length; i++) {
            Employee nameNew = name[i];
            if (nameNew != null) {
                fullName = name[i].getFullName();
                System.out.println(fullName);
            }
        }
    }

    // Main
    public static void main(String[] args) {

        Employee zero = new Employee("Айзек Азимов",
                1, 5_000);
        Employee one = new Employee("Ледовских Ирина Владимировна",
                2, 10_000);
        Employee two = new Employee("Стивен Кинг",
                3, 15_000);
        Employee three = new Employee("Артур Пирожков",
                4, 20_000);
        Employee four = new Employee("Иешуа Га-Ноцри",
                5, 25_000);
        Employee five = new Employee("Мария Кюри",
                1, 30_000);
        Employee six = new Employee("Артемий Татьянович Лебедев",
                2, 35_000);
        Employee seven = new Employee("Сигурни Уивер",
                3, 40_000);
        Employee eight = new Employee("Маршалл Брюс Мэтерс",
                4, 45_000);
        Employee nine = new Employee("Махатма Ганди",
                5, 50_000);

        Employee[] book = new Employee[10];
        book[0] = zero;
        book[1] = one;
        book[2] = two;
        book[3] = three;
        book[4] = four;
        book[5] = five;
        book[6] = six;
        book[7] = seven;
        book[8] = eight;
        book[9] = nine;

        printAllData(book);
        System.out.println();

        calculateSalaryPerMonth(book);
        System.out.println();

        findMinSalary(book);
        System.out.println();

        findMaxSalary(book);
        System.out.println();

        calculateAverage(book);
        System.out.println();

        printFullName(book);
        System.out.println();
    }
}