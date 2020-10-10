package by.mts.brest.java;

import java.io.*;

public class Lesson7_readFile {
    public static void main(String[] args) throws IOException {

        // Читаем файл (можно простым FileReader, но тогда файл посимвольно читается)
        BufferedReader reader =
                new BufferedReader(new FileReader("C:\\my\\file1.txt"));

            System.out.println("stroka1 = " + reader.readLine());   // Выводим первую строчку с файла в консоль
            System.out.println("stroka2 = " + reader.readLine());   // ... вторую
            // ... for()? while()?
        reader.close();     // Закрываем файл

        // Создаем файл
        FileWriter writer = new FileWriter("C:\\my\\file2.txt");
        writer.write("aaaaaa\n");   // Записываем в файл строки
        writer.write("333333");
        writer.close();     // Закрываем файл
    }
}
