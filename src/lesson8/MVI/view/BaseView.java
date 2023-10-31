package lesson8.MVI.view;

import lesson8.MVI.model.ViewState;

/**
 * BaseView - базовый интерфейс для всех видов.
 */
public interface BaseView {
    void render(ViewState state);
}
