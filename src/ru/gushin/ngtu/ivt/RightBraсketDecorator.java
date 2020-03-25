package ru.gushin.ngtu.ivt;

// Декоратор, создающий правую скобку
public class RightBraсketDecorator extends Decorator {

    public RightBraсketDecorator(PrinterInterface component) {
        super(component);
    }

    @Override
    public void print() {
        super.component.print();
        System.out.print("]");
    }
}
