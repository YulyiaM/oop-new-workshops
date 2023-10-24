package srp2;

import java.io.FileWriter;
import java.io.IOException;

public class SaverToJson {

    private final OrderV3 order;

    public SaverToJson(OrderV3 order) {
        this.order = order;
    }


    public void saveToJson() {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\"" + order.getClientName() + "\",\n");
            writer.write("\"product\":\"" + order.getProduct() + "\",\n");
            writer.write("\"qnt\":" + order.getQnt() + ",\n");
            writer.write("\"price\":" + order.getPrice() + "\n");
            writer.write("}\n");
            writer.flush();
            System.out.println("Информация по заказу успешно сохранена в файл.");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
