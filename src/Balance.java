public class Balance {
    private double delBalance;
    private double rubBalance;
    private double spentMoney;

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

    public double getRemainingRubles() {
        return rubBalance - spentMoney;
    }

    public void buyDEL(double rubles, double del) {
        this.spentMoney += rubles;
        this.delBalance += del;
    }
}
