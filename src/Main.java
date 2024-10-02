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

// Find Min Salary
    public static void findMinSalary(Employee[] minSalary) {
        int minSalaryEmployee = minSalary[0].getSalary();
        for (int i = 0; i < minSalary.length; i++) {
            if (minSalary[i].getSalary() < minSalaryEmployee) {
                minSalaryEmployee = minSalary[i].getSalary();
                System.out.println("Сотрудник с минимальной ЗП является - " + minSalary[i].getFullName() +
                        ", ЗП составляет - " + minSalary[i].getSalary() + " рублей.");
            }
        }
    }





    //    Find Max Salary
//    public static void findMaxSalary(Employee[] maxSalary) {
//        int maxSalaryEmployee = maxSalary[0].getSalary();
//        for (int i = 0; i < maxSalary.length; i++) {
//            if (maxSalaryEmployee < maxSalary[i].getSalary()) {
//                maxSalaryEmployee = maxSalary[i].getSalary();
//            }
//            System.out.println(maxSalary[i].getSalary());
//        }
//    }


    public static void main(String[] args) {

        Employee zero = new Employee("Айзек Азимов",
                1, 5_000);
        Employee one = new Employee("Ледовских Ирина Владимировна",
                2, 10_000);
        Employee two = new Employee("Стивен Кинг",
                3, 15_000);
        Employee three = new Employee("Филип К. Дик",
                4, 20_000);
        Employee four = new Employee("Иешуа Га-Ноцри",
                5, 25_000);
        Employee five = new Employee("Мария Кюри",
                1, 30_000);
        Employee six = new Employee("Артемий Татьянович Лебедев",
                2, 35_000);
        Employee seven = new Employee("Сигурни Иувер",
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

//        findMaxSalary(book);

    }
}