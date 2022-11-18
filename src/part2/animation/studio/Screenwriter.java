package part2.animation.studio;

import part2.CompanyType;
import part2.Employee;

public class Screenwriter extends Employee {
    public Screenwriter(String name, double salary, String position, CompanyType companyType) {
        super(name, salary, position, companyType);
    }

    private String type = "Список жанров";
    private String[] list = {"Боевик", "Детектив", "Драма", "Вестерн"};

    public String getType() {
        return type;
    }

    public String[] getList() {
        return list;
    }
}
