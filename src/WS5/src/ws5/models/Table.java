package ws5.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

public class Table {


    private static int counter; //импровизация для создания номеров (и ниже)

    {
        no = ++counter; // инициализатор
    }

    private final int no;

    private final Collection<Reservation> reservations = new ArrayList<>();

    public int getNo() {
        return no;
    }

    public Collection<Reservation> getReservations() {
        return reservations;
    }



    @Override
    public String toString() {
        return String.format(Locale.getDefault(), "Столик #%d", no);
    }

}
