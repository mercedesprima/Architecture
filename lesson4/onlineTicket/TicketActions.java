package lesson4.onlineTicket;

interface TicketActions {
/* @return: Возвращает true, если билет зарезервирован успешно, иначе false.*/
    boolean reserveTicket();

/* @return: Возвращает true, если средства успешно удержаны, иначе false.*/
    boolean deductFunds();

/* @return: Возвращает true, если покупка подтверждена, иначе false.*/
    boolean confirmPurchase();

/* @return: Обновляет доступность билетов.*/
    void updateTicketAvailability();

/* @return: Возвращает true, если резервация отменена успешно, иначе false.*/
    boolean cancelReservation();
}
