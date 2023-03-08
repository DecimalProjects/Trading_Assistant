public class Balance {
    private double delBalance; // криптовалютный баланс с монетой Del
    private double rubBalance; // фиатный баланс в рублях
    private double spentMoney; // количество денег, которые были потрачены на закупку Del

    public Balance(double delBalance, double rubBalance) {
        this.delBalance = delBalance;
        this.rubBalance = rubBalance;
        this.spentMoney = 0;
    }

    public double getDelBalance() {
        return delBalance;
    }

    public void setRubBalance(double rubBalance) {
        this.rubBalance = rubBalance;
    }

    public void setDelBalance(double delBalance) {
        this.delBalance = delBalance;
    }

    public void setSpentMoney(double spentMoney) {
        this.spentMoney = spentMoney;
    }

    public double getRubBalance() {
        return rubBalance;
    }

    public double getSpentMoney() {
        return spentMoney;
    }
}
