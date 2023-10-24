package WS4.ws4.bank;

/**
 * Организация
 */
public class Entity implements PersonalData {

    private final String name; //final не позволяет нигде менять эти поля, кроме конструктора
    private final String inn;

    public String getName() {
        return name;
    }

    @Override
    public String getInn() {
        return inn;
    }

    public Entity(String name, String inn) {
        this.name = name;
        this.inn = inn;
    }

    @Override
    public String toString() {
        return String.format("ИНН: %s; Наименование: %s", inn, name);
    }
}
