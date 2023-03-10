import java.util.Scanner;

public class PortfolioManagement {

    private Balance balance;
    private Object portfolio;

    public PortfolioManagement(Balance balance, Object portfolio) {
        this.balance = balance;
        this.portfolio = portfolio;
    }

    public void managePortfolio(Scanner scanner) {
        System.out.println("Управление портфелем:");
        System.out.println("1. Купить монету DEL");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                buyDEL(scanner);
                break;
            default:
                System.out.println("Некорректный выбор");
                break;
        }
    }

    public void buyDEL(Scanner scanner) {
        System.out.println("Введите сумму покупки монеты DEL в рублях: ");
        double rubles = scanner.nextDouble();
        System.out.println("Введите количество покупаемых монет DEL: ");
        double del = scanner.nextDouble();
        balance.buyDEL(rubles, del);
        System.out.println("Монеты DEL успешно куплены.");
    }
}
