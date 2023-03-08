
import java.util.Scanner;// Импортируем класс Scanner из пакета java.util для получения пользовательского ввода
public class Main { //Область исполнения кода программы)


    public static void main(String[] args) { //Здесь будут построчно исполняться строки кода
        Scanner scanner = new Scanner(System.in); // Создаем объект Scanner для считывания пользовательского ввода из консоли
        System.out.print("Как вас зовут? "); // Запрашиваем имя пользователя
        String name = scanner.nextLine(); // Считываем имя пользователя
        User user = new User(name); // Создаем объект User с именем пользователя
        TraderAssistant assistant = new TraderAssistant(name); // Создаем объект TraderAssistant с именем пользователя и приветствуем его
        assistant.greetUser();
        System.out.print("Введите текущий фиатный депозит в рублях: ");
        double rubBalance = scanner.nextDouble(); // Запрашиваем фиатный баланс пользователя
        scanner.nextLine();
        System.out.print("Введите количество монет DEL, которые у вас уже закуплены: ");
        double delBalance = scanner.nextDouble(); // Запрашиваем баланс монет DEL пользователя
        scanner.nextLine();

        System.out.print("Введите количество денег, которые были потрачены на закупку монет: ");
        double spentMoney = scanner.nextDouble(); // Запрашиваем количество денег, которые были потрачены на покупку монет DEL
        scanner.nextLine();

        Balance balance = new Balance(delBalance, rubBalance); // Создаем объект Balance с начальными балансами пользователя
        Statistics statistics = new Statistics(balance); // Создаем объект Statistics для отслеживания статистики
        PortfolioManagement portfolioManagement = new PortfolioManagement(balance, null); // Создаем объект PortfolioManagement для управления портфелем
        ProfitCalculation profitCalculation = new ProfitCalculation(balance, null); // Создаем объект ProfitCalculation для расчета прибыли


        int choice = 0; // Инициализируем переменную choice
        while (choice != 5) { // Запускаем бесконечный цикл while, который будет работать, пока пользователь не выберет выход из программы
            printMenu(); // Выводим на экран меню доступных действий
            System.out.print("Выберите действие: ");
            choice = scanner.nextInt(); // Считываем выбор пользователя
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

    // Вспомогательный метод (функция) для печати меню
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
