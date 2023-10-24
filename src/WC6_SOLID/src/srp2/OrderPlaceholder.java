package srp2;

import java.util.Scanner;

public class OrderPlaceholder {

    private final OrderV3 order;
    private final Scanner scanner = new Scanner(System.in);

    public OrderPlaceholder(OrderV3 order) {
        this.order = order;
    }

    public void inputFromConsole() {
        order.setClientName(prompt("Имя клиента: "));
        order.setProduct(prompt("Продукт: "));
        order.setQnt(Integer.parseInt(prompt("Кол-во: ")));
        order.setPrice(Double.parseDouble(prompt("Цена: ")));
    }

    private String prompt(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }
}
