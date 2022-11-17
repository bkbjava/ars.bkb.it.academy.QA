package part1;

public class Main {
    public static void main(String[] args) {
        Holding holding = new Holding();
        Company company1 = new Company("Apple", 1000000, "Тим Кук", 50);
        Company company2 = new Company("Tesla", 5000000, "Илон Маск", 70);
        Company company3 = new Company("Microsoft", 2800000, "Сатья Наделла", 45);

        Employee employee = new Employee();
        Employee employee1 = new Employee("James", 800, "Junior");
        Employee employee2 = new Employee("Max", 1700, "Middle");
        Employee employee3 = new Employee("David", 3100, "Senior");

        MainMenu.start(holding);
    }
}
