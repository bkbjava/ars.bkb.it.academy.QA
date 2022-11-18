package part2.it.company;

import part2.CompanyType;

public class AutoTester extends Tester {
    private String progLanguage;

    public AutoTester(String name, double salary, String position, CompanyType companyType, String progLanguage) {
        super(name, salary, position, companyType);
        this.progLanguage = progLanguage;
    }

    private String type = "Тип";
    private String[] list = {"Автоматические тесты продукта"};

    public String getProgLanguage() {
        return progLanguage;
    }

    public String getType() {
        return type;
    }

    public String[] getList() {
        return list;
    }
}
