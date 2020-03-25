package ru.gushin.ngtu.ivt;

// Декоратор, создающий левую скобку
public class LeftBracketDecorator extends Decorator {

    public LeftBracketDecorator(PrinterInterface component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("[");
        super.component.print();
    }
}
