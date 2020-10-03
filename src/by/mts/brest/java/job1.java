package by.mts.brest.java;

class home {
    public static void main(String[] args) {
        int jk;
        jk = 0;
        while(jk<10) {
            System.out.print(" while:" + jk);
            jk++;
        }

        System.out.println("  ");
        System.out.println("massivy:");


        int[] nums = new int[4];
// устанавливаем значения элементов массива
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 4;
        nums[3] = 100;

        for (int i=0; i<=nums.length-1; i++)
            System.out.print(" " +nums[i]);
        System.out.println(" ");
        System.out.println("Трёхмерный массив");

        int[][][] nums3;
        nums3 = new int[4][4][4];
        for (int i = 0; i < nums3.length; i++){
            System.out.println("");
            for(int j=0; j < nums3[i].length; j++){
                System.out.println("");
                for (int k=0; k < nums3[j].length; k++) {
                    nums3[i][j][k]=k+j+i;
                    System.out.print(nums3[i][j][k]);}
            }
        }
    }
}
















/*
package by.mts.brest.java;

import java.util.Arrays;

public class job1 {
    public static void main(String[] args) {
        int i = 0;
        int nash_massive4 [] = new int [i+6];
        for (i=0;i<6;i++){
            nash_massive4[i]=i+20;
            System.out.println("nash_massive4: "+ Arrays.toString(nash_massive4));}

        String string_array1[] = new String[5];
        for (i=0;i<5;i++){
            string_array1[i]="i+20";
            System.out.println("string_array1: "+ Arrays.toString(string_array1));}

        System.out.println("dlina1: "+ string_array1.length);
        for (int z=0; z < string_array1.length;z++)
        {string_array1[z]="Stroka" + Integer.toString(z);
            System.out.println(string_array1[z]);}

    }
}
*/
