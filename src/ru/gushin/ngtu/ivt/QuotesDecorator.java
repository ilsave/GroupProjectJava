package ru.gushin.ngtu.ivt;

// Декоратор, создающий кавычки
public class QuotesDecorator extends Decorator {

    public QuotesDecorator(PrinterInterface component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("\"");
        super.component.print();
        System.out.print("\"");
    }
}
