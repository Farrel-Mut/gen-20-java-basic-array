package Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan jumlah baris : ");
        int baris = scanner.nextInt();
        System.out.print("Masukan jumlah colom : ");
        int kolom = scanner.nextInt();

        int [][] Array = ArrayOp.buatArray(baris, kolom, scanner);

        int [][] ArrayJmlh = ArrayOp.penjumlahanArray(Array, Array.length, Array[0].length);

        int [][] ArrayRev = ArrayOp.ReverseArray(Array, Array.length, Array[0].length);
    }

}
