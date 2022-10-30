public class Main {
    public static boolean addEmployees(Employee[] allEmploy, Employee employee){
        for (int i = 0; i < allEmploy.length; i++) {
            if (allEmploy[i] == null){
                allEmploy[i] = employee;
                return true;
            }
        }
        return false;
    }
    public static void printEmloyee(Employee[] employee){
        for (Employee employe:employee) {
            if (employe != null){
                System.out.println(employe.toString());
            } else {
                break;
            }
        }
    }
    public static void cashWages(Employee[] employs){
        int sum = 0;
        for (Employee employee:employs) {
            if (employee != null){
                sum += employee.getWages();
            } else {
                break;
            }
        }
        System.out.println("\n Cумма затрат на зарплаты в месяц = " + sum + " рублей.");
    }

    public static void minMaxCashWages(Employee[] employs){
        Employee min = employs[0];
        Employee max = employs[0];
        for (Employee employee:employs) {
            if (employee.getWages() < min.getWages()){
                min = employee;
            } else if (employee.getWages() > max.getWages()) {
                max = employee;
            }
        }
        System.out.println("\n Минимальная зарплата " + min.getWages() + ", а максимальная " + max.getWages());
    }
    public static void averageValueWages(Employee[] employees){
        int sum = 0;
        for (Employee employee: employees) {
            sum += employee.getWages();
        }
        System.out.printf("\n Средняя зарплата = %.2f", sum / (float) employees.length);
    }
    public static void nameAllEmployee(Employee[] employees){
        for (Employee employee:employees) {
            if (employee != null){
                System.out.println("");
                System.out.println("======================");
                System.out.println(employee.getFullName());
            }
        }
    }
    public static void wagesIndexation(Employee[] employees){
        double prozent = 0.2;
        for (Employee employee: employees) {
            double newWages = employee.getWages() * (1 + prozent);
            employee.setWages(newWages);
            System.out.printf("\n Зарплата после индексикации - " + employee.getFullName() + " - %.2f ", employee.getWages());
        }
    }

    public static void minMaxSumDepartament(Employee[] employees, int a){
        Employee min = employees[0];
        Employee max = employees[0];
        int sum = 0;
        for (Employee employee: employees) {
            if (employee.getWages() < min.getWages() && employee.getDepartment() == a){
                min = employee;
            } else if (employee.getWages() > min.getWages() && employee.getDepartment() == a) {
                max = employee;
            }
            if (employee.getDepartment() == a){
                sum += employee.getWages();
            }
        }
        System.out.println("\n Минимальная зарплата сотрудника в отделе " + a + " равна " + min.getWages() + ", максимальная " + max.getWages() + ". А сумма затрат по отделу " + sum + ". (с учётом индексикации)");
    }
    public static void averageSalaryByDepartment(Employee[] employees, int a){
        int sum = 0;
        int employsDep = 0;
        for (Employee employee: employees) {
            if (employee.getDepartment() == a){
                employsDep++;
                sum += employee.getWages();
            }
        }
        sum = sum / employsDep;
        System.out.println("Средняя зарплата по отделу " + a + " = " + sum);
    }

    public static void indexingSalariesAllEmployeesDepartment(Employee[] employees, int a, double prozent){
        for (Employee employee: employees) {
            double v;
            if (employee.getDepartment() == a){
                v = employee.getWages() * (1 + prozent);
                employee.setWages(v);
                System.out.printf("\n Зарплата после индексикации в отделе "+ a + " " + employee.getFullName() + " - %.2f ", employee.getWages());
            }
        }
    }

    public static void printEmployeesNotId(Employee[]employees){
        for (Employee employee:employees) {
            if (employee != null){
                System.out.println("Сотрудник: " + employee.getFullName() + " |Отдел: " + employee.getDepartment() + "| Зарплата: " + employee.getWages());
            } else {
                break;
            }
        }
        System.out.println("");
    }

    public static void allEmployeesSalaryLessNumber(Employee[]employees, double a){
        System.out.println("Все сотрудники с зарплатой меньше числа:");
        for (Employee employee:employees) {
            double v;
            if (a > employee.getWages()){
                System.out.println("Сотрудник: " + employee.getFullName() + "| Зарплата: " + employee.getWages() + "| Id: " + employee.getId());
            }
        }
    }
    public static void allEmployeesSalaryMoreNumber(Employee[]employees, double a){
        System.out.println("");
        System.out.println("Все сотрудники с зарплатой больше числа:");
        for (Employee employee:employees) {
            double v;
            if (a < employee.getWages()){
                System.out.println("Сотрудник: " + employee.getFullName() + "| Зарплата: " + employee.getWages() + "| Id: " + employee.getId());
            }
        }
    }

    public static void main (String[]args){
        Employee[] allEmployees = new Employee[10];
        Employee employee1 = new Employee("Гарбуз Андрей Борисович", 1,50000.00);
        Employee employee2 = new Employee("Чинаски Константин Евгеньевич", 2,20000.00);
        Employee employee3 = new Employee("Воржавин Иван Дмитриевич", 3,70000.00);
        Employee employee4 = new Employee("Отерро Сергей Дмитриевч", 5,20000.00);
        Employee employee5 = new Employee("Иванов Владимир Константинович", 4,15000.00);
        Employee employee6 = new Employee("Демьянова Карина Юрьевна", 1,32000.00);
        Employee employee7 = new Employee("Пушков Никита Владимирович", 5,83000.00);
        Employee employee8 = new Employee("Клевна Анжелика Вячеславовна", 2,34000.00);
        Employee employee9 = new Employee("Иванов Марк Андреевич", 1,44000.00);
        Employee employee10 = new Employee("Волкова Елизавета Игоревна", 3,90000.00);

        addEmployees(allEmployees, employee1);
        addEmployees(allEmployees, employee2);
        addEmployees(allEmployees, employee3);
        addEmployees(allEmployees, employee4);
        addEmployees(allEmployees, employee5);
        addEmployees(allEmployees, employee6);
        addEmployees(allEmployees, employee7);
        addEmployees(allEmployees, employee8);
        addEmployees(allEmployees, employee9);
        addEmployees(allEmployees, employee10);
        printEmloyee(allEmployees);
        cashWages(allEmployees);
        minMaxCashWages(allEmployees);
        averageValueWages(allEmployees);
        nameAllEmployee(allEmployees);
        wagesIndexation(allEmployees);
        minMaxSumDepartament(allEmployees, 1);
        averageSalaryByDepartment(allEmployees, 1);
        indexingSalariesAllEmployeesDepartment(allEmployees, 1, 0.3);
        printEmployeesNotId(allEmployees);
        allEmployeesSalaryLessNumber(allEmployees, 30000.00);
        allEmployeesSalaryMoreNumber(allEmployees, 50000.00);
    }
}

