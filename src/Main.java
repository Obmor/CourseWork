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
        int result = 0;
        for (int i = 0; i < sum.length; i++) {
            Employee sumNew = sum[i];
            if (sumNew != null) {
                result = result + sumNew.getSalary();
            }
        }
        System.out.println("Сумма затрат за месяц равна " + result);
    }


    public static void findMinSalary(Employee[] minSalary) {
        int minSalaryEmployee = minSalary[0].getSalary();
        for (int i = 0; i < minSalary.length; i++) {
            if (minSalaryEmployee >= minSalary[i].getSalary()) {
                minSalaryEmployee = minSalary[i].getSalary();
                System.out.println("Сотрудник с минимальной ЗП является - " + minSalary[i].getFullName() +
                        ", ЗП составляет - " + minSalary[i].getSalary() + " рублей.");
            }
        }
    }

    public static void main(String[] args) {

        Employee zero = new Employee("AAA",
                111, 5_000);
        Employee one = new Employee("BBB",
                222, 10_000);
        Employee two = new Employee("CCC",
                333, 15_000);
        Employee three = new Employee("DDD",
                444, 20_000);
        Employee four = new Employee("EEE",
                555, 25_000);
        Employee five = new Employee("FFF",
                111, 30_000);
        Employee six = new Employee("GGG",
                222, 35_000);
        Employee seven = new Employee("HHH",
                333, 4_000);
        Employee eight = new Employee("III",
                444, 45_000);
        Employee nine = new Employee("JJJ",
                555, 50_000);

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

    }
}