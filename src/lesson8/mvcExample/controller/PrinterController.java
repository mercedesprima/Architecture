package lesson8.mvcExample.controller;

import lesson8.mvcExample.model.PrinterUpperCase;

public class PrinterController {
    PrinterUpperCase printerUpperCase;

    public PrinterController(PrinterUpperCase printerUpperCase) {
        this.printerUpperCase = printerUpperCase;
    }

    public void print(String str) {
        printerUpperCase.print(str);
    }

}
