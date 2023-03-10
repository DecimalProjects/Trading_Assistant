import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Как вас зовут? ");
        String name = scanner.nextLine();

        User user = new User(name);
        TraderAssistant assistant = new TraderAssistant(name);
        assistant.greetUser();

        System.out.print("Введите текущий фиатный депозит в рублях: ");
        double rubBalance = scanner.nextDouble();
        System.out.print("Введите количество монет DEL, которые у вас уже закуплены: ");
        double delBalance = scanner.nextDouble();
        System.out.print("Введите количество денег, которые были потрачены на закупку монет: ");
        double spentMoney = scanner.nextDouble();

        Balance balance = new Balance(delBalance, rubBalance);
        balance.setSpentMoney(spentMoney);

        Statistics statistics = new Statistics(balance);
        PortfolioManagement portfolioManagement = new PortfolioManagement(balance, null);
        ProfitCalculation profitCalculation = new ProfitCalculation(balance, null);

        int choice = 0;
        System.out.println();

        statistics.showStatistics();

        while (choice != 5) {
            printMenu();
            System.out.print("Выберите действие: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Ваш баланс:");
                    System.out.println("DEL: " + balance.getDelBalance());
                    System.out.println("RUB: " + balance.getRubBalance());
                    break;
                case 2:
                    portfolioManagement.managePortfolio();
                    break;
                case 3:
                    statistics.showStatistics();
                    break;
                case 4:
                    profitCalculation.calculateProfit();
                    break;
                case 5:
                    System.out.println("До свидания!");
                    break;
                default:
                    System.out.println("Некорректный выбор.");
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("=================");
        System.out.println("Меню:");
        System.out.println("1. Посмотреть баланс");
        System.out.println("2. Записать сделку");
        System.out.println("3. Статистика");
        System.out.println("4. Расчет прибыли");
        System.out.println("5. Выход");
        System.out.println("=================");
    }
}
