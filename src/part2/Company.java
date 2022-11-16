package part2;

import java.util.ArrayList;
import java.util.Arrays;

public class Company extends Holding {
    private String name;
    private Employee[] employees = new Employee[25];
    //Нужно добавить:
    //Бюджет холдинга
    private double budget;
    //Руководителя компании
    private String supervisor;
    private int numberOfWorkplaces;
    private static double allBudget = 0;
    private static ArrayList<Company> listCompany = new ArrayList<>();

    private Holding holding;
    private Employee employee;

    public Company() {}

    public Company(String name, double budget, String supervisor, int numberOfWorkplaces) {
        this.name = name;
        this.budget = budget;
        allBudget += budget;
        this.supervisor = supervisor;
        this.numberOfWorkplaces = numberOfWorkplaces;
        listCompany.add(this);
    }

    public Company(String name, Employee[] employees, double budget, String supervisor, int numberOfWorkplaces) {
        this.name = name;
        this.employees = employees;
        this.budget = budget;
        allBudget += budget;
        this.supervisor = supervisor;
        this.numberOfWorkplaces = numberOfWorkplaces;
        listCompany.add(this);
    }

    //Реализуйте вывод информации об этой компании (кроме списка сотрудников)
    public void companyInfo(String name) {
        int count = 0;
        for(Company comp : listCompany) {
            if(comp.getName().equals(name)) {
                System.out.println("Имя компании: " + comp.getName() +
                        "\nБюджет компании: " + comp.getBudget() +
                        "\nРуководитель компании: " + comp.getSupervisor() +
                        "\nКоличество рабочих мест в компании: " + comp.getNumberOfWorkplaces());
                count++;
            }
        }
        if(count == 0)
            System.out.println("Ошибка, нет такой компании!");
    }

    //Реализуйте вывод списка сотрудников этой компании
    public void employeeList() {
        for(Employee employee : employees) {
            if(employee != null)
                System.out.println(employee.getName() + " | " + employee.getSalary() + " | " + employee.getPosition());
        }
    }

    // Реализуйте подсчет всех заработных плат сотрудников
    public void allSalary() {
        double salary = 0;
        for(Employee emp : employee.getListEmployee()) {
            salary += emp.getSalary();
        }
        System.out.println("Общая заработная плата сотрудников: " + salary);
    }

    // Добавление сотрудника в компанию
    public boolean addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }

    // Удаление сотрудника из компании
    public boolean deleteEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].equals(employee)) {
                employees[i] = null;
                return true;
            }
        }
        return false;
    }

    //  Поменять руководителя компании
    public boolean changeSupervisor(String nameCompany, String nameEmployee) {
        for(Company comp : listCompany) {
            if(comp.getName().equals(nameCompany)) {
                comp.setSupervisor(nameEmployee);
                return true;
            }
        }
        return false;
    }

    //Реализуйте поиск сотрудника по имени
    public Employee getEmployeeByName(String name) {
        for (Employee emp : employee.getListEmployee()) {
            if (emp.getName().equals(name))
                return emp;
        }
        return null;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Employee[] getEmployees() {
        return employees;
    }
    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public double getBudget() {
        return budget;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public static double getAllBudget() {
        return allBudget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public int getNumberOfWorkplaces() {
        return numberOfWorkplaces;
    }

    public void setNumberOfWorkplaces(int numberOfWorkplaces) {
        this.numberOfWorkplaces = numberOfWorkplaces;
    }

    public static ArrayList<Company> getListCompany() {
        return listCompany;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", employees=" + Arrays.toString(employees) +
                ", budget=" + budget +
                ", supervisor='" + supervisor + '\'' +
                '}';
    }

}

