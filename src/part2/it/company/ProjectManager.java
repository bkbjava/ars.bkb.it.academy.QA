package part2.it.company;

import part2.CompanyType;
import part2.Employee;

public class ProjectManager extends Employee {

    public ProjectManager(String name, double salary, String position, CompanyType companyType) {
        super(name, salary, position, companyType);
    }

    private String type = "Список проектов";
    private String[] list = {"MOVER", "Perfectoria", "Reklion", "IT Brick", "Beton Brut"};

    public String[] getList() {
        return list;
    }

    public String getType() {
        return type;
    }


}
