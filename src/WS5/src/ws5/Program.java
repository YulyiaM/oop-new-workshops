package ws5;

import ws5.models.TableModel;
import ws5.presenters.BookingPresenter;
import ws5.presenters.Model;
import ws5.presenters.View;
import ws5.views.BookingView;

import java.util.Date;

public class Program {

    /**
     * TODO: ДОМАШНЯЯ РАБОТА
     *  метод changeReservationTable должен заработать!
     * @param args
     */
    public static void main(String[] args) {

        Model tableModel = new TableModel();
        View bookingView = new BookingView();
        BookingPresenter presenter = new BookingPresenter(tableModel, bookingView);
        presenter.updateUIShowTables();
        bookingView.reservationTable(new Date(), 2, "Станислав");

        //bookingView.changeReservationTable(1001, new Date(), 3, "Станислав");

        Box<Apple> box1 = new Box<>();
        Box<Orange> box2 = new Box<>();
        //box1.move(box2);


    }

}

abstract class Fruit{

}

class Apple extends Fruit{

}

class Orange extends Fruit{

}

class Box<T extends Fruit>{

    public void move(Box<T> otherBox){
        //...
    }

}
