package sample.In_OUT;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by pavel on 28.03.2017.
 */
public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        if (args.length != 1) {
            System.out.println("Using Show file TEXT");
        }
        try {
            fin = new FileInputStream("C://Read.txt");
do{
    i=fin.read();
    if(i!=-1)
        System.out.print((char)i);
}while (i!=-1);
        } catch (FileNotFoundException exc) {
            System.out.println("File not found");
            return;

        }catch (IOException exc){
            System.out.println("Input-Output err");

        }finally {
            try
            {
                if(fin!=null)
                    fin.close();
            }catch (IOException exc){
                System.out.println("Error while closing file");
            }
        }
    }
}
