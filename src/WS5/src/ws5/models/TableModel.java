package ws5.models;

import ws5.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model { // реализация бизнес-логики

    private Collection<Table> tables;


    /**
     * Получение списка всех столиков
     */
    @Override
    public Collection<Table> loadTables() {

        if (tables == null){
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }

        return tables;
    }

    /**
     * Бронирование столика
     * @param reservationDate Дата бронирования
     * @param name Имя
     */
    @Override
    public int reservationTable(Date reservationDate, int tableNo, String name) {
        for (Table table: loadTables()) {
            if (table.getNo() == tableNo){
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        throw  new RuntimeException("Некорректный номер столика."); // если не смогли выйти через return
    }

    /**
     * TODO: Доработать в рамках домашней работы
     * Отменить бронирование по номеру
     * @param oldReservation
     * @param reservationDate
     * @param tableNo
     * @param name
     * @return
     */
    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        return -1;
    }

}
