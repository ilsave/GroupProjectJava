package ru.gushin.ngtu.ivt;


abstract class Decorator implements PrinterInterface {
    // некий компонент заданного типа
    public PrinterInterface component;

    // конструктор с аргументами
    public Decorator(PrinterInterface component) {
        this.component = component;
    }
}
