package by.mts.brest.java;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

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
        String name1 = "C:\\my\\my_"+ LocalDate.now().toString()+"\\file2.txt";
        new File(name1).getParentFile().mkdirs();
        FileWriter writer = new FileWriter(name1);
        writer.write("aaaaaa8888"+System.getProperty("line.separator"));   // Записываем в файл строки
        writer.write("333333"+System.getProperty("line.separator"));
        writer.close();     // Закрываем файл
    }
}
