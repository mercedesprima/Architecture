package lesson4.onlineTicket;
/* Класс BusTicket наследует Абстрактный класс Ticket, имплементирующий интерфейс TicketActions.*/
class BusTicket extends Ticket {
    int number;
/* @pre: Количество билетов в продаже должно быть больше или равно запрошенным пользователем.
@post: Количество билетов должно уменьшиться во время резервирования билета, чтобы никто не смог
это же время забронировать/купить.
@return: Возвращает true, если кол-во билетов >= запрошенному, иначе false.*/
    @Override
    public boolean reserveTicket() {
        // Реализация метода
        return false;
    }

    @Override
    public boolean deductFunds() {
        // Реализация метода
        return false;
    }

    @Override
    public boolean confirmPurchase() {
        // Реализация метода
        return false;
    }

    @Override
    public void updateTicketAvailability() {
        // Реализация метода
    }

    @Override
    public boolean cancelReservation() {
        // Реализация метода
        return false;
    }
}
