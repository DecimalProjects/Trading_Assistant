class Statistics {
    private Balance balance; // Создаем приватную переменную balance типа Balance, которая будет хранить информацию о балансе пользователя

    // Создаем конструктор класса Statistics, который принимает параметр balance типа Balance и сохраняет его в переменной balance
    public Statistics(Balance balance) {
        this.balance = balance;
    }

    // Создаем метод showStatistics, который выводит на экран статистику пользователя
    public void showStatistics() {
        System.out.println("Ваша актуальная Статистика:");
        System.out.println("Ваш общий торговый депозит в фиате: " + balance.getRubBalance() + " RUB");
        System.out.println("Количество монет DEL, которые у вас уже закуплены: " + balance.getDelBalance());
        System.out.println("Количество денег, которые были потрачены на закупку монет: " + balance.getSpentMoney() + " RUB");
        System.out.println("Себестоимость активов: " + calculatePortfolioValue() + " RUB");
        System.out.println("Средняя стоимость монет DEL в вашем портфеле: " + calculateAverageDelValue() + " RUB");
        System.out.println("Остаток фиатного депозита: " + balance.getRemainingRubles() + " рублей");
    }

    // Создаем метод calculatePortfolioValue, который возвращает общую стоимость портфеля
    public double calculatePortfolioValue() {
        // Здесь должен быть код для расчета стоимости портфеля
        // Мы просто вернем сумму крипто- и фиатного балансов для примера
        return balance.getDelBalance() + balance.getRubBalance();
    }

    // Создаем метод calculateAverageDelValue, который возвращает среднюю стоимость монет Del
    public double calculateAverageDelValue() {
        double delBalance = balance.getDelBalance();
        if (delBalance == 0) {
            return 0;
        } else {
            double averageDelValue = balance.getSpentMoney() / delBalance; // Изменяем формулу расчета
            return averageDelValue;
        }
    }
}

