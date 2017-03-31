package sample.Shildt.IN_OUT;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by pavel on 30.03.2017.
 */
public class CompFiles extends IOException {
    public static void main(String[] args) throws IOException {
        int i = 0, j = 0;
        if(args.length!=2){
            System.out.println("Использование: CompFiles файл1 файл2");
            return;
        }
  //      просят убедится в передаче программе имен файлов, но непонятно как и куда они передаются
        try (FileInputStream f1 = new FileInputStream(args[0]);
             FileInputStream f2 = new FileInputStream(args[1])) {
            do {
                i = f1.read();
                i = f2.read();
                if (i != -1 && j != -1) break;
            } while (i != -1 && j != -1);
            if (i != j)
                System.out.println("Files are equal");
            else
                System.out.println("Files are not equal");
        } catch (IOException e) {
            System.out.println("OUT-INPUT ERROR^ " + e);
        }
    }
}
//
//

