package WS4.ws4.bank;

public class Program {
    public static void main(String[] args) {
        //Account<Person> account1 = new Account<>(new Person("Hello!", "51685"),20000);

        Entity entity1 = new Entity("KUnwudekce", "151856156");
        Person person1 = new Person("Cl1", "4515154");

        DebetAccount<Entity> debetAccount1 = new DebetAccount<>(entity1, 1500000);
        CreditAccount<Person> creditAccount1 = new CreditAccount<>(person1, 300);

        Transaction<Account> transaction = new Transaction<>(debetAccount1, creditAccount1, 35000);
        transaction.execute();

        transaction.execute();
    }
}
