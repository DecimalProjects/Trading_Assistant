class TraderAssistant {
    private String username;

    public TraderAssistant(String username) {
        this.username = username;
    }


    public void greetUser() {
        System.out.println("Здравствуйте, " + username + "! Добро пожаловать в Торгового помощника трейдера на криптовалютном обменнике!");
        System.out.println("Я могу помочь вам управлять портфелем, следить за статистикой и рассчитывать прибыль.");
    }
}
