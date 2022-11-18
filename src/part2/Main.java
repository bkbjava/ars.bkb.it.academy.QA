package part2;

import part2.animation.studio.*;
import part2.it.company.*;

public class Main {
    public static void main(String[] args) {
        Holding holding = new Holding();

        ItCompany itCompany1 = new ItCompany("Oracle", 4500000, "Кумар Сушил", 25, CompanyType.IT_COMPANY);
        ItCompany itCompany2 = new ItCompany("NEC", 4800000, "Такаюки Морита", 20, CompanyType.IT_COMPANY);
        ItCompany itCompany3 = new ItCompany("Atos", 3600000, "Родольф Бельмер", 32, CompanyType.IT_COMPANY);
        ItCompany itCompany4 = new ItCompany("Infosys", 3200000, "Салил Парех", 27, CompanyType.IT_COMPANY);

        Developer developer = new Developer("David", 4500, "Senior", CompanyType.IT_COMPANY);
        ProjectManager projectManager = new ProjectManager("Lina", 2600,"Middle", CompanyType.IT_COMPANY);
        ManualTester manualTester = new ManualTester("James", 1200, "Junior", CompanyType.IT_COMPANY);
        AutoTester autoTester = new AutoTester("Alex", 7600, "Senior", CompanyType.IT_COMPANY, "Java");

        AnimationStudio animationStudio1 = new AnimationStudio("Disney", 3200000, "Роберт Чапек", 15, CompanyType.ANIMATION_STUDIO);
        AnimationStudio animationStudio2 = new AnimationStudio("Pixar", 1600000, "Джим Моррис", 18, CompanyType.ANIMATION_STUDIO);
        AnimationStudio animationStudio3 = new AnimationStudio("DreamWorks", 4300000, "Джеффри Катценберг", 32, CompanyType.ANIMATION_STUDIO);
        AnimationStudio animationStudio4 = new AnimationStudio("Rainbow", 3900000, "Саймон Ларойч", 26, CompanyType.ANIMATION_STUDIO);

        Producer producer = new Producer("Max", 2800, "Middle", CompanyType.ANIMATION_STUDIO);
        Screenwriter screenwriter = new Screenwriter("Saymon", 6700, "Senior", CompanyType.ANIMATION_STUDIO);
        Animator animator = new Animator("Lara", 3900, "Middle", CompanyType.ANIMATION_STUDIO);

        MainMenu.start();
    }
}
