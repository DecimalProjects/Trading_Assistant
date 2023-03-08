import java.time.LocalDateTime;

public class Price {
    private double delRubPrice; // Текущая цена DEL в рублях
    private double exchangeFee; // Комиссия биржи за сделку
    private LocalDateTime lastUpdated; // Время последнего обновления цен

    // Геттеры и сеттеры для полей класса Price
    public double getDelRubPrice() {
        return delRubPrice;
    }

    public void setDelRubPrice(double delRubPrice) {
        this.delRubPrice = delRubPrice;
    }

    public double getExchangeFee() {
        return exchangeFee;
    }

    public void setExchangeFee(double exchangeFee) {
        this.exchangeFee = exchangeFee;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    // Метод для получения актуальных цен на бирже
    public void updatePrices() {
        // Здесь может быть код для обращения к API биржи и получения актуальных цен и комиссии за сделку
        // В нашем случае мы просто установим фиктивные значения для примера
        delRubPrice = 2;
        exchangeFee = 0.04;
        lastUpdated = LocalDateTime.now();
    }
}


