package lesson5.calculatorMVC;

import lesson5.calculatorMVC.view.ConsoleView;
import lesson5.calculatorMVC.view.IView;

public class Main {
    public static void main(String[] args) {
        IView view = new ConsoleView();
        view.runCalculator();
    }
}