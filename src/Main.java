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
        scanner.nextLine();
        System.out.print("Введите количество монет DEL, которые у вас уже закуплены: ");
        double delBalance = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Введите количество денег, которые были потрачены на закупку монет: ");
        double spentMoney = scanner.nextDouble();
        scanner.nextLine();

        Balance balance = new Balance(delBalance, rubBalance);
        Statistics statistics = new Statistics(balance);
        PortfolioManagement portfolioManagement = new PortfolioManagement(balance, null);
        ProfitCalculation profitCalculation = new ProfitCalculation(balance, null);

        int choice = 0;
        while (choice != 5) {
            printMenu(); // Печатаем меню
            System.out.print("Выберите действие: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Считываем лишний перевод строки из буфера
            switch (choice) {
                case 1:
                    // Посмотреть баланс
                    System.out.println("Ваш баланс:");
                    System.out.println("DEL: " + balance.getDelBalance());
                    System.out.println("RUB: " + balance.getRubBalance());
                    break;
                case 2:
                    // Управление портфелем
                    portfolioManagement.managePortfolio();
                    break;
                case 3:
                    // Статистика
                    statistics.showStatistics();
                    break;
                case 4:
                    // Расчет прибыли
                    profitCalculation.calculateProfit();
                    break;
                case 5:
                    // Выход
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
        System.out.println("2. Управление портфелем");
        System.out.println("3. Статистика");
        System.out.println("4. Расчет прибыли");
        System.out.println("5. Выход");
        System.out.println("=================");
    }
}
