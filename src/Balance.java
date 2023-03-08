// Объявляем класс Balance, который хранит данные о балансах пользователей и содержит методы работы с ними
public class Balance {
    private double delBalance; // Создаем приватную переменную delBalance типа double, которая будет хранить криптовалютный баланс с монетой Del
    private double rubBalance; // Создаем приватную переменную rubBalance типа double, которая будет хранить фиатный баланс в рублях
    private double spentMoney; // Создаем приватную переменную spentMoney типа double, которая будет хранить количество денег, которые были потрачены на закупку Del

    // Создаем конструктор с двумя параметрами, которые являются начальными балансами пользователя
    public Balance(double delBalance, double rubBalance) {
        this.delBalance = delBalance;
        this.rubBalance = rubBalance;
        this.spentMoney = 0; // Начальное значение spentMoney равно 0
    }

    // Создаем метод, который возвращает значение delBalance
    public double getDelBalance() {
        return delBalance;
    }

    // Создаем метод, который устанавливает значение rubBalance
    public void setRubBalance(double rubBalance) {
        this.rubBalance = rubBalance;
    }

    // Создаем метод, который устанавливает значение delBalance
    public void setDelBalance(double delBalance) {
        this.delBalance = delBalance;
    }

    // Создаем метод, который устанавливает значение spentMoney
    public void setSpentMoney(double spentMoney) {
        this.spentMoney = spentMoney;
    }

    // Создаем метод, который возвращает значение rubBalance
    public double getRubBalance() {
        return rubBalance;
    }

    // Создаем метод, который возвращает значение spentMoney
    public double getSpentMoney() {
        return spentMoney;
    }
}
