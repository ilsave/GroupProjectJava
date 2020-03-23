package ru.gushin.ngtu.ivt;

public class LeftBraketDecorator extends Decorator {

    public LeftBraketDecorator(PrinterInterface component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("[");
        super.component.print();
    }
}
