package part2;

import part2.animation.studio.AnimationStudio;
import part2.it.company.ItCompany;

import java.util.Arrays;
import java.util.Scanner;

public class Holding {
    private Company[] companies;
    Company company;
    ItCompany itCompany;
    AnimationStudio animationStudio;

    Scanner scanner = new Scanner(System.in);

    public Holding() {
        companies = new Company[10];
    }

    // Добавление компании в холдинг
    public boolean addCompany(Company company) {
        for (int i = 0; i < companies.length; i++) {
            if (companies[i] == null) {
                companies[i] = company;
                return true;
            }
        }
        return false;
    }

    // Вывод списка компаний в холдинге
    public void showCompanies() {
        System.out.println("\nМеню для выбора типа компании:" +
                "\n1) Вывод Айти Компаний" +
                "\n2) Вывод Анимационных студий");
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
        for (Company company : companies) {
            if (companyType == null) {
                break;
            }
            if (company != null && company.getCompanyType().equals(companyType)) {
                System.out.println("\nНазвание компании: " + company.getName() +
                        "\nРуководитель: " + company.getSupervisor() +
                        "\nБюджет: " + company.getBudget() +
                        "\nКол-во рабочих мест: " + company.getNumberOfWorkplaces());
                res = true;
            }
        }
        System.out.println("Список сотрудников: ");
        for(Employee employee : Employee.getListEmployee()) {
            if(!res) {
                System.out.println("В холдинге еще нет компаний, пожалуйства добавьте их!");
                break;
            }
            else if(employee.getCompanyType().equals(companyType)) {
                System.out.println(employee.getClass().getSimpleName() + ':' + employee.toString());
            }
        }
    }


    // Вывод общего бюджета холдинга
    public void allBudget() {
        System.out.println("Общий бюджет холдинга: " + Company.getAllBudget());
    }

    // Вывод списка компаний в холдинге с количеством рабочих мест и уже работающих сотрудников
    public void fullShowCompanies() {
        int amountAllEmployee = 0;
        for (Company company : companies) {
            if (company != null) {
                System.out.print(company.getName() + " | ");
                amountAllEmployee += company.getNumberOfWorkplaces();
            }
        }
        System.out.println("Кол-во рабочих мест: " + amountAllEmployee + " | Кол-во работающих сотрудников: " + Employee.getAmountEmployee());
    }

//    public void fullShowCompanies() {
//        for(Company com : companies) {
//            if(com != null) {
//                System.out.println(company.getName() + " | ");
//
//            }
//
//        }
//    }

    // Удаление компании из холдинга
    public boolean deleteCompany(Company company) {
        for (int i = 0; i < companies.length; i++) {
            if (companies[i] != null && this.companies[i].equals(company)) {
                companies[i] = null;
                return true;
            }
        }
        return false;
    }

    // Поиск компании по наименованию
    public Company getCompanyByName(String name) {
        for (Company company : companies) {
            if (company != null && company.getName().equals(name))
                return company;
        }
        return null;
    }

    public  Company[] getCompanies() {
        return companies;
    }


    @Override
    public String toString() {
        return "Holding{" +
                "companies=" + Arrays.toString(companies) +
                '}';
    }

}


