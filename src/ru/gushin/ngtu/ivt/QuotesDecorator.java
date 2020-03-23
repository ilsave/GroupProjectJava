package ru.gushin.ngtu.ivt;

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
