package lesson8.mvcExample;


import lesson8.mvcExample.controller.PrinterController;
import lesson8.mvcExample.model.PrinterUpperCase;
import lesson8.mvcExample.view.ConsoleView;

public class Main {
    public static void main(String[] args) {
        PrinterUpperCase printerUpperCaseMODEL = new PrinterUpperCase();
        PrinterController printerControllerCONTROLLER = new PrinterController(printerUpperCaseMODEL);
        ConsoleView view = new ConsoleView(printerControllerCONTROLLER);
        view.run();
    }
}