package WS4.ws4.bank;

public class CreditAccount<T extends PersonalData> extends Account<T>{ // <T> - пробрасываем обобщенный параметр
                                                                       // в первые скобки добавляется ограничение из базового типа
    public CreditAccount(T data, double amount) {
        super(data, amount);
    }
}
