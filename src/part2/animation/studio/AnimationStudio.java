package part2.animation.studio;

import part2.Company;
import part2.CompanyType;

public class AnimationStudio extends Company {
    public AnimationStudio(String name, double budget, String supervisor, int numberOfWorkplaces, CompanyType companyType) {
        super(name, budget, supervisor, numberOfWorkplaces, companyType);
    }

    private double incomeYouTubeAd; // Доходы с рекламы на YouTube

//    private double techniqueExpenses; // Расходы на технику
//    private double officeExpenses; // Расходы на офис
//    private double salariesExpenses; // Расходы на зарплаты
    private double youTubeAdExpenses; // Расходы на рекламу своего ютуб канала

}
