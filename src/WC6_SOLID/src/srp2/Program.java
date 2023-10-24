package srp2;

public class Program {

    public static void main(String[] args) {

        OrderV3 orderV3 = new OrderV3();
        OrderPlaceholder orderPlaceholder3 = new OrderPlaceholder(orderV3);
        orderPlaceholder3.inputFromConsole();
        SaverToJson saverToJson3 = new SaverToJson(orderV3);
        saverToJson3.saveToJson();
    }
}
