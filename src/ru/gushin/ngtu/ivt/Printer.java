package ru.gushin.ngtu.ivt;

import java.util.List;

public class Printer implements PrinterInterface {

    // значение, которое будет выводиться на экран
    String value;

    // конструктор с аргументом
    public Printer(String value) {
        this.value = value;
    }

    // переназначение функции
    @Override
    public void print() {
        System.out.print(value);
    }
}
