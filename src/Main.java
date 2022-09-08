public class Main {

    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        Employee employee0 = new Employee("Ivanov Ivan Ivanovich", 1, 35_000);
        Employee employee1 = new Employee("Petrov Petr Petrovich", 2, 40_000);
        Employee employee2 = new Employee("Shevchenko Aleksandr Aleksandrovich", 3, 50_000);
        Employee employee3 = new Employee("Yevtushenko Maxim Viktorovich", 4, 60_000);
        Employee employee4 = new Employee("Sidorov Igor Viktorovich", 5, 70_000);
        Employee employee5 = null;
        Employee employee6 = new Employee("Petrova Rita Andreevna", 2, 90_000);
        Employee employee7 = new Employee("Shevchenko Eva Denisovna", 3, 100_000);
        Employee employee8 = new Employee("Yevtushenko Kristina Kirillovna", 4, 120_000);
        Employee employee9 = new Employee("Sidorova Anastasiya Alekseevna", 5, 130_000);

        employees[0] = employee0;
        employees[1] = employee1;
        employees[2] = employee2;
        employees[3] = employee3;
        employees[4] = employee4;
        employees[5] = employee5;
        employees[6] = employee6;
        employees[7] = employee7;
        employees[8] = employee8;
        employees[9] = employee9;

        printListEmployee();
        System.out.println(sumCostSalary());
        System.out.println(getEmployeeWithMinSalary());
        System.out.println(getEmployeeWithMaxSalary());
        System.out.println(returnAverageSalary());
        printFullName();
    }

    public static void printListEmployee() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null)
                System.out.println(employees[i]);

        }
    }

    public static int sumCostSalary() {
        int sumSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null)
                sumSalary = sumSalary + employees[i].getSalary();
        }
        return sumSalary;
    }

    public static Employee getEmployeeWithMinSalary() {
        Employee bestCandidate = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i] != null) {
                Employee currentEmployee = employees[i];
                int currentSalary = currentEmployee.getSalary();
                if (currentSalary < bestCandidate.getSalary()) {
                    bestCandidate = currentEmployee;
                }
            }
        }
        return bestCandidate;
    }

    public static Employee getEmployeeWithMaxSalary() {
        Employee bestSalaryCandidate = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i] != null) {
                Employee currentEmployee = employees[i];
                int currentSalary = currentEmployee.getSalary();
                if (currentSalary > bestSalaryCandidate.getSalary()) {
                    bestSalaryCandidate = currentEmployee;
                }
            }
            return bestSalaryCandidate;
        }

        public static int returnAverageSalary () {
            int counter = 0;
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null)
                    counter++;
            }
            return sumCostSalary() / counter;
        }

        public static void printFullName () {
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] != null)
                    System.out.println(employees[i].getName());
            }
        }

    }
}