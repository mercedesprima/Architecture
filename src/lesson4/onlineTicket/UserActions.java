package lesson4.onlineTicket;

import java.util.Date;

/**
 * Компонент: UserActions
 * Версия: 1.0.0
 *
 * Описание: Этот компонент определяет контракты для действий пользователя.
 *
 * Изменения:
 * - 1.0.0: Первая версия.
 * - 1.1.0: Добавлена поддержка новой функциональности.
 */
interface UserActions {

/* @pre: Пользователь должен быть авторизован с указанными именем пользователя и паролем.
@return: Возвращает true, если авторизация успешна, иначе false.*/
    boolean authorize(String username, String password);

/* @pre: Пользователь должен быть авторизован.
@return: Возвращает true, если выбор маршрута успешен, иначе false. */
    boolean selectRoute(String routeId, Date time);

/* @return: Возвращает true, если билеты доступны, иначе false.*/
    boolean checkTicketAvailability();

    /* @return: Возвращает true, если средств достаточно, иначе false.*/
    boolean checkFunds();
}
