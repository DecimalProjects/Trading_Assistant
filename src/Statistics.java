class Statistics {
    private Balance balance;

    public Statistics(Balance balance) {
        this.balance = balance;
    }

    public void showStatistics() {
        System.out.println("Статистика:");
        System.out.println("Ваш фиатный депозит: " + balance.getRubBalance() + " RUB");
        System.out.println("Количество монет DEL, которые у вас уже закуплены: " + balance.getDelBalance());
        System.out.println("Количество денег, которые были потрачены на закупку монет: " + balance.getSpentMoney() + " RUB");
        System.out.println("Общая стоимость портфеля: " + calculatePortfolioValue() + " RUB");
    }

    public double calculatePortfolioValue() {
        // Здесь должен быть код для расчета стоимости портфеля
        // Мы просто вернем сумму крипто- и фиатного балансов для примера
        return balance.getDelBalance() + balance.getRubBalance();
    }
}
