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
        for (Employee a:employee) {
            if (a != null){
                System.out.println(a.toString());
            } else {
                break;
            }
        }
    }
    public static void cashWages(Employee[] employs){
        int sum = 0;
        for (Employee b:employs) {
            sum += b.getWages();
        }
        System.out.println("\n C���� ������ �� �������� � ����� = " + sum + " ������.");
    }

    public static void minMaxCashWages(Employee[] employs){
        Employee min = employs[0];
        Employee max = employs[0];
        for (Employee c:employs) {
            if (c.getWages() < min.getWages()){
                min = c;
            } else if (c.getWages() > min.getWages()) {
                max = c;
            }
        }
        System.out.println("\n ����������� �������� " + min.getWages() + ", � ������������ " + max.getWages());
    }
    public static void averageValueWages(Employee[] employees){
        int sum = 0;
        for (Employee d: employees) {
            sum += d.getWages();
        }
        System.out.printf("\n ������� �������� = %.2f", sum / (float) employees.length);
    }
    public static void nameAllEmployee(Employee[] employees){
        for (Employee e:employees) {
            if (e != null){
                System.out.println("");
                System.out.println("======================");
                System.out.println(e.getFullName());
            }
        }
    }
    public static void wagesIndexation(Employee[] employees){
        double prozent = 0.2;
        for (Employee a: employees) {
            double v;
            v = a.getWages() * (1 + prozent);
            a.setWages(v);
            System.out.printf("\n �������� ����� ������������ - " + a.getFullName() + " - %.2f ", a.getWages());
        }
    }

    public static void minMaxSumDepartament(Employee[] employees, int a){
        Employee min = employees[0];
        Employee max = employees[0];
        int sum = 0;
        for (Employee c: employees) {
            if (c.getWages() < min.getWages() && c.getDepartment() == a){
                min = c;
            } else if (c.getWages() > min.getWages() && c.getDepartment() == a) {
                max = c;
            }
            if (c.getDepartment() == a){
                sum += c.getWages();
            }
        }
        System.out.println("\n ����������� �������� ���������� � ������ " + a + " ����� " + min.getWages() + ", ������������ " + max.getWages() + ". � ����� ������ �� ������ " + sum + ". (� ������ ������������)");
    }
    public static void averageSalaryByDepartment(Employee[] employees, int a){
        int sum = 0;
        int employsDep = 0;
        for (Employee c: employees) {
            if (c.getDepartment() == a){
                employsDep++;
                sum += c.getWages();
            }
        }
        sum = sum / employsDep;
        System.out.println("������� �������� �� ������ " + a + " = " + sum);
    }

    public static void indexingSalariesAllEmployeesDepartment(Employee[] employees, int a, double prozent){
        for (Employee c: employees) {
            double v;
            if (c.getDepartment() == a){
                v = c.getWages() * (1 + prozent);
                c.setWages(v);
                System.out.printf("\n �������� ����� ������������ � ������ "+ a + " " + c.getFullName() + " - %.2f ", c.getWages());
            }
        }
    }

    public static void printEmployeesNotId(Employee[]employees){
        for (Employee a:employees) {
            if (a != null){
                System.out.println("���������: " + a.getFullName() + " |�����: " + a.getDepartment() + "| ��������: " + a.getWages());
            } else {
                break;
            }
        }
        System.out.println("");
    }

    public static void allEmployeesSalaryLessNumber(Employee[]employees, double a){
        System.out.println("��� ���������� � ��������� ������ �����:");
        for (Employee c:employees) {
            double v;
            if (a > c.getWages()){
                System.out.println("���������: " + c.getFullName() + "| ��������: " + c.getWages() + "| Id: " + c.getId());
            }
        }
    }
    public static void allEmployeesSalaryMoreNumber(Employee[]employees, double a){
        System.out.println("");
        System.out.println("��� ���������� � ��������� ������ �����:");
        for (Employee c:employees) {
            double v;
            if (a < c.getWages()){
                System.out.println("���������: " + c.getFullName() + "| ��������: " + c.getWages() + "| Id: " + c.getId());
            }
        }
    }
    public static void main (String[]args){
        Employee[] allEmployees = new Employee[10];
        Employee employee1 = new Employee("������ ������ ���������", 1,50000.00);
        Employee employee2 = new Employee("������� ���������� ����������", 2,20000.00);
        Employee employee3 = new Employee("�������� ���� ����������", 3,70000.00);
        Employee employee4 = new Employee("������ ������ ���������", 5,20000.00);
        Employee employee5 = new Employee("������ �������� ��������������", 4,15000.00);
        Employee employee6 = new Employee("��������� ������ �������", 1,32000.00);
        Employee employee7 = new Employee("������ ������ ������������", 5,83000.00);
        Employee employee8 = new Employee("������ �������� ������������", 2,34000.00);
        Employee employee9 = new Employee("������ ���� ���������", 1,44000.00);
        Employee employee10 = new Employee("������� ��������� ��������", 3,90000.00);
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

