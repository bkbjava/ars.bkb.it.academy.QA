package part1;

import java.util.ArrayList;
public class Employee extends Company{
    private String name;
    private double salary;
    private String position;
    private static int amountEmployee;

    private static ArrayList<Employee> listEmployee = new ArrayList<>();


    public Employee() {}
    public Employee(String name, double salary, String position) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        listEmployee.add(this);
        amountEmployee++;
    }

    // Вывод информации о сотруднике
    public void employeeInfo(String nameEmployee) {
        int count = 0;
        for(Employee emp : listEmployee) {
            if (emp.name.equals(nameEmployee)) {
                System.out.println(emp.name + " | " + emp.salary + " | " + emp.position);
                count++;
            }
        }
        if(count == 0)
            System.out.println("Нет такого сотрудника!");
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public static int getAmountEmployee() {
        return amountEmployee;
    }

    public static void setAmountEmployee(int amountEmployee) {
        Employee.amountEmployee = amountEmployee;
    }

    public static ArrayList<Employee> getListEmployee() {
        return listEmployee;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                '}';
    }

}
