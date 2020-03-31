package ru.gushin.ngtu.ivt;

import java.io.*;
import java.nio.file.Files;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        // Пробуем запустить все декораторы. Фраза помещается в кавычки и квадратные скобки
        PrinterInterface printer = new QuotesDecorator(new LeftBracketDecorator( new RightBraсketDecorator( new Printer("Hey there !"))));
        // Фраза выводится на экран
        printer.print();
        System.out.println('\n');

        List<String> line3 = new LinkedList<>();
        for( i < array.lenght()){
            line3.add(arrray[i])
        }


        BufferedReader br = null;  // Далее идет работа с файлом
        try {

            // Чтение из одного файла
            List<String> list = new LinkedList<>(); // Список, в который читаются все строки файла
            br = new BufferedReader(new FileReader("src/ru/gushin/ngtu/ivt/StudentPojo.java"));
            String line;
            while((line = br.readLine()) != null){
                list.add(line);
            }
            System.out.println(list); // Все строки выводятся на экран

            // Запись в другой файл с добавлением разметки в функции
            File file = new File("C:/Users/ACER/Desktop/try.txt"); // Обозначаем файл для записи
            if (!file.exists())
                file.createNewFile(); // Если файла нет, то он создается
            PrintWriter pw = new PrintWriter(file);
            printINFILE(list, file); // Сначала текст записывается в формате .txt
            CopyToHTML(file); // Затем создается копия этого файла, но в формате .html
            pw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Записывает весь список строк в файл, добавляя HTML разметку
    static void printINFILE(List<String> list, File file){
        String line2 =
                " <head>\n" +
                "  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n" +
                "  <title>Hey there</title>\n" +
                " </head>\n" +
                " <body>\n" +
                "  <h1>whats upper-alpha</h1>\n" +
                "  <!-- ʮ쬥�\uD862\uDE60-->\n" +
                "\t<p>package com.template.unitest.pojo;\n" +
                "\t\t<i>";
        String line3 =
                "\t\t</i>\n" +
                "\t</p>\n" +
                "  \n" +
                " </body>\n" +
                "</html>";
        try {
            if (!file.exists())
                file.createNewFile();
            PrintWriter pw = new PrintWriter(file);
            pw.print(line2); // Первая часть разметки пишется в файл
            for (String line1 : list){
                pw.print("<br>");
                pw.print(line1); // Каждая строка из списка пишется в файл
                pw.println("</br>");
            }
            pw.print(line3); // Вторая часть разметки пишется в файл
            pw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }


    // Функция создает копию .txt файла и меняет расширение на .html
    static void CopyToHTML(File source) throws IOException{
        InputStream is = null;
        OutputStream os = null;
        File dest = new File("C:/Users/ACER/Desktop/try.html"); // Файл, куда будет записан html код
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }
}
