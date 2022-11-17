package part1;

import java.util.Scanner;

public class CompanyMenu {
    public static void start(Company companyStart) {
        Employee employeeStart = new Employee();
        Company company = new Company();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nМеню для работы с компанией: " +
            "\n1) Вывод информации о компании" +
            "\n2) Вывод списка сотрудников компании" +
            "\n3) Вывод общих расходов на зарплаты сотрудников" +
            "\n4) Добавление сотрудника в компанию" +
            "\n5) Удаление сотрудника из компании" +
            "\n6) Поменять руководителя компании" +
            "\n7) Меню для работы с сотрудниками" +
            "\n0) Вернуться в меню для работы с холдингом");

            System.out.print("\nВведите номер меню: ");
            int command = scanner.nextInt();

            switch (command) {
                case 1:
                    System.out.print("Введите название компании: ");
                    String nameCompany = scanner.next();
                    company.companyInfo(nameCompany);
                    break;
                case 2:
                    company.employeeList();
                    break;
                case 3:
                    company.allSalary();
                    break;
                case 4:
                    System.out.print("Введите имя сотрудника: ");
                    String nameEmployee = scanner.next();
                    boolean res = false;
                    for(Employee emp : Employee.getListEmployee()) {
                        if(emp.getName().equals(nameEmployee))
                            res = company.addEmployee(emp);
                    }
                    System.out.println(res);
                    break;
                case 5:
                    System.out.print("Введите имя сотрудника: ");
                    String nameEmployee2 = scanner.next();
                    for(Employee emp : company.getEmployees()) {
                        if(emp != null && emp.getName().equals(nameEmployee2))
                            System.out.println(company.deleteEmployee(emp));
                    }
                    break;
                case 6:
                    System.out.print("Введите название компании: ");
                    String nameCompany2 = scanner.next();
                    System.out.print("Введите имя нового руководителя: ");
                    String nameEmployee3 = scanner.next();
                    System.out.println(company.changeSupervisor(nameCompany2, nameEmployee3));
                    break;
                case 7:
                    EmployeeMenu.start(employeeStart);
                    break;
                case 0:
                    System.out.println("Вы вернулись в меню для работы с холдингом!");
                    return;
                default:
                    System.out.println("Ошибка! Введите пункт из меню");
                    break;
            }

        }
    }
}
