package ru.gushin.ngtu.ivt;

abstract class Decorator implements PrinterInterface {
    public PrinterInterface component;

    public Decorator(PrinterInterface component) {
        this.component = component;
    }
}
