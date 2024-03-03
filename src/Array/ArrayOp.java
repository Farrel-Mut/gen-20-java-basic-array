package Array;

import java.util.Scanner;

public class ArrayOp {
    public static int[][] buatArray(int baris, int kolom, Scanner scanner){
        int [][] Array = new int[baris][kolom];

        for(int y=0; y<baris; y++){
            for(int x=0; x<kolom; x++){
                System.out.print("Masukan value array baris "+(y+1)+" kolom "+(x+1)+" : ");
                Array[y][x] = scanner.nextInt();
            }
        }

        System.out.println(" ");
        System.out.println("Array yang dibuat:");

        for(int i=0; i<baris; i++){
            System.out.print("Line "+(i+1)+" : [ ");
            for(int j=0; j<kolom; j++){
                System.out.print(Array[i][j]);

                if((j+1)<kolom){
                    System.out.print(", ");
                } else {
                    System.out.print(" ]");
                }
            }
            System.out.println();
        }

        return Array;
    }

    public static int[][] penjumlahanArray(int[][] array, int baris, int kolom){

        int [][] ArrayHasil = new int[1][kolom]; // Menginisialisasi array hasil penjumlahan
        int sum = 0;

        System.out.println();
        System.out.println("Hasil penjumlahan setiap kolom:");
        System.out.print("[ ");

        for(int i = 0; i < baris; i++){
            sum = 0;
            for(int j = 0; j < kolom; j++){
                sum += array[i][j];
            }

            ArrayHasil[0][i] = sum;
            System.out.print(ArrayHasil[0][i]+" ");

            if((i+1)<baris){
                System.out.print(", ");
            } else {
                System.out.print(" ]");
            }
        }

        return ArrayHasil;
    }

    public static int[][] ReverseArray(int[][] array, int baris, int kolom){
        for(int i=0; i<baris; i++){
            int awal = 0;
            int ujung = kolom-1;

            while(awal<ujung){
                int temp = array[i][awal];
                array[i][awal] = array[i][ujung];
                array[i][ujung] = temp;
                awal++;
                ujung--;
            }
        }

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Array yang sudah di reverse : ");

        for(int i=0; i<baris; i++){
            System.out.print("Line "+(i+1)+" : [ ");
            for(int j=0; j<kolom; j++){
                System.out.print(array[i][j]);

                if((j+1)<kolom){
                    System.out.print(", ");
                } else {
                    System.out.print(" ]");
                }
            }
            System.out.println("");
        }

        return array;
    }
}
