package ru.gushin.ngtu.ivt;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ///здесь я пытаюсь запустить декоратор
        System.out.println("Trying quotars ");
        PrinterInterface printer = new QuotesDecorator(new LeftBraketDecorator( new RightBraketDecorator( new Printer("Hey there !"))));
        printer.print();
        System.out.println();
        ///
        //переменная для чтения из файла
        BufferedReader br = null;
        try {

            File file = new File("try.txt");

            if (!file.exists())
                file.createNewFile();


            //чтение из файла всех строк в лист
            List<String> list = new LinkedList<>();
            br = new BufferedReader(new FileReader("src\\ru\\gushin\\ngtu\\ivt\\StudentPojo.java"));
            String line;
            while((line = br.readLine()) != null){
                //System.out.println(line);
                list.add(line);
            }
            System.out.println(list);



            PrintWriter pw = new PrintWriter(file);
            for (String line1 : list){
                pw.println(line1);
            }
            printINFILE(list);
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static void printINFILE(List<String> list){
        String line2 = "html>\n" +
                " <head>\n" +
                "  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n" +
                "  <title>Hey there</title>\n" +
                " </head>\n" +
                " <body>\n" +
                "  <h1>whats upper-alpha</h1>\n" +
                "  <!-- ʮ쬥�\uD862\uDE60-->\n" +
                "\t<p>package com.template.unitest.pojo;\n" +
                "\t\t<i>";
        String line3 = "\t\t</i>\n" +
                "\t</p>\n" +
                "  \n" +
                " </body>\n" +
                "</html>";
        try {
            File file = new File("Try5.txt");
            if (!file.exists())
                file.createNewFile();
            PrintWriter pw = new PrintWriter(file);
            pw.print(line2);
            for (String line1 : list){
                pw.print("<br>");
                pw.print(line1);
                pw.println("</br>");
            }
            pw.print(line3);
            pw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
