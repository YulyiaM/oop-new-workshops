package WS4.ws4.bank;

public abstract class Account<T extends PersonalData>{ // ограничение - можно передать только тип, который имплементирует этот интерфейс

    private final T data; //ссылка на держателя

    private double amount;

    public Account(T data, double amount) {
        this.data = data;
        this.amount = amount;
    }

    public T getData() {
        return data;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "data=" + data +
                ", amount=" + amount +
                '}';
    }
}
