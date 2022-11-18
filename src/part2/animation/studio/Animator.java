package part2.animation.studio;

import part2.CompanyType;
import part2.Employee;

public class Animator extends Employee {
    public Animator(String name, double salary, String position, CompanyType companyType) {
        super(name, salary, position, companyType);
    }

    private String type = "Cписок умений";
    private String[] list = {"Умение правильно подбирать образ", "Аккуратность", "Умение быстро ориентироваться"};

    public String getType() {
        return type;
    }

    public String[] getList() {
        return list;
    }
}
