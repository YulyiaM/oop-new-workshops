package WS4.ws4;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(); // подчеркивается желтым, тк не указан конкретный тип - авт-ки object
        arrayList.add(new Employee("DDDDDD", 32));
        arrayList.add(86);
        arrayList.add(("Hello!"));

        for (Object o : arrayList) {
            if (o instanceof Employee) {
                Employee e = (Employee) o;
                System.out.printf("%s - %d\n", e.getName(), e.getAge());
            }
        }

        MyArrayList<Employee> arrayList1 = new MyArrayList(new Object[10]);
        arrayList1.add(new Employee("DDDDDD", 32));
        arrayList1.add(new Employee("DsdgsDD", 25));
        arrayList1.add(new Employee("DDFHGD", 2));
        arrayList1.add(new Employee("SDFAGH", 42));

        System.out.println("Кол-во элементов: " + arrayList1.size());

        for (Employee o : arrayList1)
            if (o != null) {
                System.out.printf("%s - %d\n", o.getName(), o.getAge());
            }
    }
}
