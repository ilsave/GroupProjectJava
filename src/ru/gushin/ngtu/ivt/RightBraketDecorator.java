package ru.gushin.ngtu.ivt;

public class RightBraketDecorator extends Decorator {

    public RightBraketDecorator(PrinterInterface component) {
        super(component);
    }

    @Override
    public void print() {
        super.component.print();
        System.out.print("]");
    }
}
