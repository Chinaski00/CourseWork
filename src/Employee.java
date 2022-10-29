
import java.util.Arrays;

public class Employee {
    private String fullName;
    private int department;
    private Double wages;

    private int id;
    private static int nextId;


    public Employee(String fullName, int department, Double wages) {
        this.fullName = fullName;
        this.department = department;
        this.wages = wages;
        this.id = nextId++;
    }


    public String getFullName(){
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public Double getWages() {
        return wages;
    }

    public void setDepartment(int department){
        this.department = department;
    }

    public void setWages(Double wages){
        this.wages = wages;
    }

    public Employee() {
        id = nextId;
        nextId++;
    }

    public int getId(){
        return id;
    }


    public String toString(){
        return "Сотрудник: " + fullName + " |Отдел: " + department + "| Зарплата: " + wages + "| Id: " +  id;
    }
}
