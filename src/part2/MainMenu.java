package part2;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {

        Holding holding = new Holding();
        Company company1 = new Company("Apple", 1000000, "Тим Кук", 50);
        Company company2 = new Company("Tesla", 5000000, "Илон Маск", 70);
        Company company3 = new Company("Microsoft", 2800000, "Сатья Наделла", 45);

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nГлавное меню для работы с холдингом: " +
                    "\n1) Вывод списка компаний в холдинге" +
                    "\n2) Вывод общего бюджета холдинга" +
                    "\n3) Вывод списка компаний в холдинге с количеством рабочих мест и уже работающих сотрудников" +
                    "\n4) Добавление компании в холдинг" +
                    "\n5) Удаление компании из холдинга" +
                    "\n6) Меню для работы с компанией" +
                    "\n0) Выход из главного меню");

        System.out.print("\nВведите номер меню: ");
        int command = scanner.nextInt();

        switch (command) {
            case 1:
                holding.showCompanies();
                break;
            case 2:
                holding.allBudget();
                break;
            case 3:
                holding.fullShowCompanies();
                break;
            case 4:
                System.out.print("Введите название компании: ");
                String nameCompany = scanner.next();
                int count = 0;
                for (Company company : Company.getListCompany()) {
                    if (company.getName().equals(nameCompany)) {
                        System.out.println(holding.addCompany(company));
                        count++;
                        break;
                    }
                }
                if (count == 0)
                    System.out.println(false);
                break;
            case 5:
                System.out.print("Введите название компании: ");
                String nameCompany2 = scanner.next();
                int count2 = 0;
                for (Company company : holding.getCompanies()) {
                    if (company != null && company.getName().equals(nameCompany2)) {
                        System.out.println(holding.deleteCompany(company));
                        count2++;
                        break;
                    }
                }
                if (count2 == 0)
                    System.out.println(false);
                break;
            case 6:
                System.out.print("Введите название компании: ");
                String nameCompany3 = scanner.next();
                System.out.println(holding.getCompanyByName(nameCompany3));
                break;
            case 0:
                System.out.println("Вы вышли с главного меню!");
                return;
            default:
                System.out.println("Ошибка! Введите пункт из меню");
                break;
        }

    }


        }

    }

