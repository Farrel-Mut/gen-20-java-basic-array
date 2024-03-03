package Text;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Nama text file yang di inginkan : ");
        String FileName = scan.nextLine();

        System.out.println("Tulis isi dari file text : ");
        String IsiFile = scan.nextLine();

        FileOp.FileWritter(FileName,IsiFile);
        FileOp.FileReader(FileName);
    }
}