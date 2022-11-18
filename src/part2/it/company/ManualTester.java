package part2.it.company;

import part2.CompanyType;

public class ManualTester extends Tester {
    public ManualTester(String name, double salary, String position, CompanyType companyType) {
        super(name, salary, position, companyType);
    }
    private String type = "Тип";
    private String[] list = {"Ручные тесты продукта"};

    public String getType() {
        return type;
    }

    public String[] getList() {
        return list;
    }
}
