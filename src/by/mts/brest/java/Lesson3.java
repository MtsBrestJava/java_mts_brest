package by.mts.brest.java;

import java.security.Permission;

public class Lesson3 {
    public static void main(String[] args) {

        int i;
        int y = 10;

        // for (V1 ; V2 ; V3) { V4 }
        // V1 -> V2? -> V4 -> V3. -> V2 -> V4 -> V3. -> ...
        // Debug in intelliJ IDEA: слева тыкаем (красный кружок),
        // далее Run -> Debug, F7 - проходим по строчкам выполнение проги
        for(i = 0;
            i < 10;
            i++) {
            System.out.print(" for:"+i);
        }

        System.out.println("");

        i = 0;  // Этот while эквивалентен for'у выше
        while(i < 10) {
            System.out.print(" while:"+i);
            i++;
        }

        i = 0;
        do {
            System.out.print(" do_while:" + i);
            i++;
        } while (i < 10);

        System.out.println(" END");
    }
}
