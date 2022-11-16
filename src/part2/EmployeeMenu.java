package part2;

import java.util.Scanner;

public class EmployeeMenu {
    public static void main(String[] args) {
        Employee employee = new Employee();

        Employee employee1 = new Employee("James", 800, "Junior");
        Employee employee2 = new Employee("Max", 1700, "Middle");
        Employee employee3 = new Employee("David", 3100, "Senior");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1) Вывод информации о сотруднике" +
                               "\n0) Выход из главного меню");

            System.out.print("\nВведите номер меню: ");

            int command = scanner.nextInt();

            if (command == 1) {
                System.out.print("Введите имя сотрудника: ");
                String nameEmployee = scanner.next();
                employee.employeeInfo(nameEmployee);
            } else if (command == 0) {
                System.out.println("Вы вышли с главного меню!");
                break;
            }
            else {
                System.out.println("Ошибка! Введите пункт из меню");
            }

        }
    }
}
