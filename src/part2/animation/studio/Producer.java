package part2.animation.studio;

import part2.CompanyType;
import part2.Employee;

public class Producer extends Employee {

    public Producer(String name, double salary, String position, CompanyType companyType) {
        super(name, salary, position, companyType);
    }

    String type = "Список анимационных продуктов";
    private String[] list = {"Adobe Animate", "Toon Boom Harmony", "Pixel Studio", "FlipaClip", "RoughAnimator"};

    public String getType() {
        return type;
    }

    public String[] getList() {
        return list;
    }
}
