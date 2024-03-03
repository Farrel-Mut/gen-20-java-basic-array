package Text;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class FileOp {
    public static void FileWritter(String FileName, String IsiFile){
        try {
            FileWriter fileWriter = new FileWriter(FileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(IsiFile);

            bufferedWriter.close();

            System.out.println("File"+FileName+"berhasil dibuat");
        } catch (IOException e){
            System.out.println("Terajdi kesalahan!!");
        }
    }

    public static void FileReader(String FileName){
        try {
            FileReader reader = new FileReader(FileName);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;

            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (IOException e){
            System.out.println("Error!! tidak dapat membaca file "+FileName);
        }
    }
}