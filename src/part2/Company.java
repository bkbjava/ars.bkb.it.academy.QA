package part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public abstract class Company extends Holding {
    private String name;
    private static Employee[] employees = new Employee[25];
    private double budget;
    private String supervisor;
    private int numberOfWorkplaces;
    private static double allBudget = 0;
    private CompanyType companyType;
    private static ArrayList<Company> listCompany = new ArrayList<>();

    private Holding holding;
    private Employee employee;

    static Scanner scanner = new Scanner(System.in);

    public Company() {}


    public Company(String name, double budget, String supervisor, int numberOfWorkplaces,CompanyType companyType) {
        this.name = name;
        this.budget = budget;
        allBudget += budget;
        this.supervisor = supervisor;
        this.numberOfWorkplaces = numberOfWorkplaces;
        this.companyType = companyType;
        listCompany.add(this);
    }

    private double techniqueExpenses; // Расходы на технику

    private double officeExpenses; // Расходы на офис

    private double salariesExpenses; // Расходы на зарплаты


    // Вывод информации об этой компании (кроме списка сотрудников)
    public static void companyInfo(String name) {
        CompanyType companyType = null;
        int count = 0;
        for(Company comp : listCompany) {
            if(comp.getName().equals(name)) {
                System.out.println("\nИмя компании: " + comp.getName() +
                        "\nБюджет компании: " + comp.getBudget() +
                        "\nРуководитель компании: " + comp.getSupervisor() +
                        "\nКоличество рабочих мест в компании: " + comp.getNumberOfWorkplaces());
                count++;
                companyType = comp.companyType;
            }
        }
        System.out.print("Работники: ");
        for(Employee employee : Employee.getListEmployee()) {
            if(employee.getCompanyType().equals(companyType))
                System.out.print(employee.getName() + " | ");
        }
        if(count == 0)
            System.out.println("Ошибка, нет такой компании!");
    }

    // Вывод списка сотрудников этой компании
    public static void employeeList() {
        System.out.println("\nМеню для выбора типа компании для вывода сотрудников:" +
                "\n1) Вывод сотрудников Айти Компании" +
                "\n2) Вывод сотрудников Анимационной студии");
        System.out.print("\nНомер меню: ");
        int numberMenu = scanner.nextInt();

        CompanyType companyType = null;

        if(numberMenu == 1) {
            companyType = CompanyType.IT_COMPANY;
        }
        else if(numberMenu == 2) {
            companyType = CompanyType.ANIMATION_STUDIO;
        }
        else {
            System.out.println("Введите пункт с меню!");
        }

        boolean res = false;
        int count = 0;
        for(Employee employee : employees) {
            if (companyType == null) {
                count++;
                break;
            }
            if(employee != null && employee.getCompanyType().equals(companyType)) {
                System.out.println("\nИмя сотрудника: " + employee.getName() +
                        "\nЗарплата сотрудника: " + employee.getSalary() +
                        "\nПозиция сотрудника: " + employee.getPosition() +
                        "\nРаботает в: " + employee.getCompanyType());
                res = true;
            }
        }
        if(count != 0)
            return;
        else if(!res)
            System.out.println("В компании еще нет сотрудников, пожалуйства добавьте их!");
    }

    // Подсчет всех заработных плат сотрудников
    public static void allSalary() {
        double salary = 0;
        for(Employee emp : Employee.getListEmployee()) {
            salary += emp.getSalary();
        }
        System.out.println("Общие расходы на зарплаты сотрудников: " + salary);
    }

    // Добавление сотрудника в компанию
    public static boolean addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }

    // Удаление сотрудника из компании
    public static boolean deleteEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].equals(employee)) {
                employees[i] = null;
                return true;
            }
        }
        return false;
    }

    //  Поменять руководителя компании
    public static boolean changeSupervisor(String nameCompany, String nameEmployee) {
        for(Company comp : listCompany) {
            if(comp.getName().equals(nameCompany)) {
                comp.setSupervisor(nameEmployee);
                return true;
            }
        }
        return false;
    }

    // Поиск сотрудника по имени
    public Employee getEmployeeByName(String name) {
        for (Employee emp : employee.getListEmployee()) {
            if (emp.getName().equals(name))
                return emp;
        }
        return null;
    }

    // Доходы компании
    public static void incomeCompany() {
        System.out.print("Введите название компании: ");
        String nameCompany = scanner.nextLine();
        Company companyChange = null;
        boolean res = false;
        for(Company company : listCompany) {
            if(company.name.equals(nameCompany)) {
                System.out.println("Текущий бюджет: " + company.getBudget());
                companyChange = company;
                res = true;
                break;
            }
        }
        if(!res) {
            System.out.println("Нет такой компании!");
            return;
        }
        if(companyChange.getCompanyType().equals(CompanyType.IT_COMPANY)) {
            System.out.print("Введите доход с аутсорсинга: ");
            double income1 = scanner.nextDouble();
            companyChange.budget += income1;
            System.out.println("+ " + income1 + '$' + " в бюджет!");
            System.out.print("Введите доход с аутстаффинга: ");
            double income2 = scanner.nextDouble();
            companyChange.budget += income2;
            System.out.println("+ " + income2 + '$' + " в бюджет!");
            System.out.println("Обновленный бюджет: " + companyChange.budget);
        }
        else if(companyChange.getCompanyType().equals(CompanyType.ANIMATION_STUDIO)) {
            System.out.print("Введите доход с рекламы на YouTube: ");
            double income = scanner.nextDouble();
            companyChange.budget += income;
            System.out.println("+ " + income + '$' + " в бюджет!");
            System.out.println("Обновленный бюджет: " + companyChange.budget);
        }
    }


    // Расходы компании
    public static void consumptionCompany() {
        System.out.print("Введите название компании: ");
        String nameCompany = scanner.nextLine();
        Company companyChange = null;
        boolean res = false;
        for(Company company : listCompany) {
            if(company.name.equals(nameCompany)) {
                System.out.println("Текущий бюджет: " + company.getBudget());
                companyChange = company;
                res = true;
                break;
            }
        }
        if(!res) {
            System.out.println("Нет такой компании!");
            return;
        }
        if(companyChange.getCompanyType().equals(CompanyType.IT_COMPANY)) {
            System.out.print("Введите расходы на технику: ");
            double consumption1 = scanner.nextDouble();
            companyChange.budget -= consumption1;
            System.out.println("- " + consumption1 + '$' + " из бюджета!");
            System.out.print("Введите расходы на офис: ");
            double consumption2 = scanner.nextDouble();
            companyChange.budget -= consumption2;
            System.out.println("- " + consumption2 + '$' + " из бюджета!");
            System.out.print("Введите расходы на зарплаты: ");
            double consumption3 = scanner.nextDouble();
            companyChange.budget -= consumption3;
            System.out.println("- " + consumption3 + '$' + " из бюджета!");
            System.out.println("Обновленный бюджет: " + companyChange.budget);
        }
        else if(companyChange.getCompanyType().equals(CompanyType.ANIMATION_STUDIO)) {
            System.out.print("Введите расходы на технику: ");
            double consumption1 = scanner.nextDouble();
            companyChange.budget -= consumption1;
            System.out.println("- " + consumption1 + '$' + " из бюджета!");
            System.out.print("Введите расходы на офис: ");
            double consumption2 = scanner.nextDouble();
            companyChange.budget -= consumption2;
            System.out.println("- " + consumption2 + '$' + " из бюджета!");
            System.out.print("Введите расходы на зарплаты: ");
            double consumption3 = scanner.nextDouble();
            companyChange.budget -= consumption3;
            System.out.println("- " + consumption3 + '$' + " из бюджета!");
            System.out.print("Введите разсходы на рекламу в YouTube: ");
            double consumption4 = scanner.nextDouble();
            companyChange.budget -= consumption4;
            System.out.println("- " + consumption1 + '$' + " из бюджета!");
            System.out.println("Обновленный бюджет: " + companyChange.budget);
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static Employee[] getEmployees() {
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

    public CompanyType getCompanyType() {
        return companyType;
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

