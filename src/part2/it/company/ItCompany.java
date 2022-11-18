package part2.it.company;

import part2.Company;
import part2.CompanyType;

public class ItCompany extends Company {
    private double outsourcing; // Разработка ПО под заказ
    private double outstaffing; // Предоставление своих специалистов в другие компании

    public ItCompany(String name, double budget, String supervisor, int numberOfWorkplaces, CompanyType companyType) {
        super(name, budget, supervisor, numberOfWorkplaces, companyType);
    }

    public double getOutsourcing() {
        return outsourcing;
    }

    public double getOutstaffing() {
        return outstaffing;
    }
}
