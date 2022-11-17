package part1;

import java.util.Arrays;

public class Holding {
    private Company[] companies;
    Company company;

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
        for (Company company : companies) {
            if (company != null) {
                System.out.println(company.getName() + " | " + company.getSupervisor() + " | " + company.getBudget());
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


