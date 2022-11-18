package part2.it.company;

import part2.CompanyType;
import part2.Employee;

public abstract class Tester extends Employee {
    String[] list;
    String type;

    public Tester(String name, double salary, String position, CompanyType companyType) {
        super(name, salary, position, companyType);
    }

    public String[] getList() {
        return list;
    }

    @Override
    public String getType() {
        return type;
    }
}
