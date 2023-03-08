class User { // объявление класса User
    private String firstName; // приватное поле класса User, тип - String, для хранения имени пользователя
    private String lastName; // приватное поле класса User, тип - String, для хранения фамилии пользователя
    private String email; // приватное поле класса User, тип - String, для хранения адреса электронной почты пользователя
    private String phoneNumber; // приватное поле класса User, тип - String, для хранения номера телефона пользователя

    // конструктор класса User с параметрами, типы параметров - String
    public User(String firstName, String lastName, String email, String phoneNumber) {
        this.firstName = firstName; // присваивание значению поля firstName текущего объекта значение параметра firstName из конструктора
        this.lastName = lastName; // присваивание значению поля lastName текущего объекта значение параметра lastName из конструктора
        this.email = email; // присваивание значению поля email текущего объекта значение параметра email из конструктора
        this.phoneNumber = phoneNumber; // присваивание значению поля phoneNumber текущего объекта значение параметра phoneNumber из конструктора
    }

    // метод для получения значения поля firstName текущего объекта
    public String getFirstName() {
        return firstName; // возвращение значения поля firstName текущего объекта
    }

    // метод для установки нового значения поля firstName текущего объекта
    public void setFirstName(String firstName) {
        this.firstName = firstName; // присваивание значению поля firstName текущего объекта новое значение firstName, переданное в качестве параметра метода
    }

    // метод для получения значения поля lastName текущего объекта
    public String getLastName() {
        return lastName; // возвращение значения поля lastName текущего объекта
    }

    // метод для установки нового значения поля lastName текущего объекта
    public void setLastName(String lastName) {
        this.lastName = lastName; // присваивание значению поля lastName текущего объекта новое значение lastName, переданное в качестве параметра метода
    }

    // метод для получения значения поля email текущего объекта
    public String getEmail() {
        return email; // возвращение значения поля email текущего объекта
    }

    // метод для установки нового значения поля email текущего объекта
    public void setEmail(String email) {
        this.email = email; // присваивание значению поля email текущего объекта новое значение email, переданное в качестве параметра метода
    }

    // метод для получения значения поля phoneNumber текущего объекта
    public String getPhoneNumber() {
        return phoneNumber; // возвращение значения поля phoneNumber текущего объекта
    }

    // метод для установки нового значения поля phoneNumber текущего объекта
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber; // присваивание значению поля phoneNumber текущего объекта новое значение phoneNumber, переданное в качестве параметра метода
    }

    // конструктор класса User с одним параметром, тип параметра - String
    public User(String name) {
        this.firstName = name; // присваивание значению поля firstName текущего объекта значение параметра name из конструктора
    }
}

