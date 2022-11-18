package part2;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Employee extends Company {
    private String name;
    private double salary;
    private String position;

    private String type;
    private String[] list;
    private static int amountEmployee;
    private CompanyType companyType;

    private static ArrayList<Employee> listEmployee = new ArrayList<>();


    public Employee() {}
    public Employee(String name, double salary, String position, CompanyType companyType) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        amountEmployee++;
        this.companyType = companyType;
        listEmployee.add(this);
    }

    // Вывод информации о сотруднике
    public static void employeeInfo() {
        int count = 0;

        System.out.println("Имена всех сотрудников:");
        for (Employee employee : Employee.getListEmployee()) {
            System.out.println(employee.getName());
        }
        System.out.print("\nВведите имя сотрудника для получения подробной информации!" +
                "\nИмя: ");
        String name = scanner.nextLine();
        for (Employee employee : listEmployee) {
            if(employee.getName().equals(name)){
                System.out.println("\nИмя сотрудника: " + employee.getName() +
                        "\nЗарплата сотрудника: " + employee.getSalary() +
                        "\nПозиция сотрудника: " + employee.getPosition() +
                        "\nРаботает в: " + employee.getCompanyType() + "\n" +
                         employee.getType() + " " + Arrays.toString(employee.getList()));
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
    public CompanyType getCompanyType() {
        return companyType;
    }

    public String getType() {
        return type;
    }

    public String[] getList() {
        return list;
    }

    @Override
    public String toString() {
        return " name = '" + name + '\'' +
                ", salary = " + salary +
                ", position = '" + position + '\'';
    }

}
