package part2.it.company;

import part2.CompanyType;
import part2.Employee;


public class Developer extends Employee {

    public Developer(String name, double salary, String position, CompanyType companyType) {
        super(name, salary, position, companyType);
    }

    private String type = "Cтек технологий";
    private String[] list = {"front end", "java backend", "c# backend", "python backend", "kotlin mobile"};


    public String[] getList() {
        return list;
    }

    public String getType() {
        return type;
    }
}
