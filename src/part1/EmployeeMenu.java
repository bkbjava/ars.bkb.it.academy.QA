package part1;

import java.util.Scanner;

public class EmployeeMenu {
    public static void start(Employee employeeStart) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Employee employee = new Employee();
            System.out.println("\nМеню для работы с сотрудниками: " +
                    "\n1) Вывод информации о сотруднике" +
                               "\n0) Вернуться в меню для работы с компанией");

            System.out.print("\nВведите номер меню: ");

            int command = scanner.nextInt();

            if (command == 1) {
                System.out.print("Введите имя сотрудника: ");
                String nameEmployee = scanner.next();
                employee.employeeInfo(nameEmployee);
            } else if (command == 0) {
                System.out.println("Вы вернулись в меню для работы с компанией!");
                return;
            }
            else {
                System.out.println("Ошибка! Введите пункт из меню");
            }

        }
    }
}
