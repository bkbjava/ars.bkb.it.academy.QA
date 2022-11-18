package part2;

import java.util.Scanner;

public class EmployeeMenu {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Employee employee;
            System.out.println("\nМеню для работы с сотрудниками: " +
                    "\n1) Вывод информации о сотруднике" +
                               "\n0) Вернуться в меню для работы с компанией");

            System.out.print("\nВведите номер меню: ");

            int command = scanner.nextInt();

            if (command == 1) {
                Employee.employeeInfo();
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
