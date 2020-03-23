package ru.gushin.ngtu.ivt;

import java.util.List;

public class Printer implements PrinterInterface {

    String value;

 //   private List<String> list;

    public Printer(String value) {
        this.value = value;
    }

//    public Printer(List<String> list){
//        this.list = list;
//    }

    @Override
    public void print() {
        System.out.print(value);
    }
}
