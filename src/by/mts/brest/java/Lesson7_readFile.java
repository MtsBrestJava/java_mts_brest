package by.mts.brest.java;

import java.io.*;

public class Lesson7_readFile {
    public static void main(String[] args) throws IOException {

        // Читаем файл (можно простым FileReader, но тогда файл посимвольно читается)
        BufferedReader reader =
                new BufferedReader(new FileReader("C:\\my\\file1.txt"));
        //FileReader reader = new FileReader("C:\\my\\file1.txt");

            System.out.println("stroka1 = " + reader.readLine());   // Выводим первую строчку с файла в консоль
            System.out.println("stroka2 = " + reader.readLine());   // ... вторую
            System.out.println("stroka3 = " + (char)reader.read());   // ... ТОЛЬКО первый символ из третей строки
            // ... for()? while()?
        reader.close();     // Закрываем файл

        // Создаем файл
        FileWriter writer = new FileWriter("C:\\my\\file2.txt",true);
        writer.write("aaaaaa\n");   // Записываем в файл строки
        writer.write("333333");
        writer.close();     // Закрываем файл
    }
}
