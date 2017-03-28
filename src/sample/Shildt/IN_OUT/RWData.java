package sample.Shildt.IN_OUT;

import java.io.*;

/**
 * Created by pavel on 28.03.2017.
 */
public class RWData {
    public static void main(String[] args) {
        int i = 10;
        double d = 1023.56;
        boolean b = true;

        try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("testdata"))) {
            System.out.println("Writed: " + i);
            dataOut.writeInt(i);
            System.out.println("Writed: " + d);
            dataOut.writeDouble(d);
            System.out.println("Writed: " + b);
            dataOut.writeBoolean(b);
            System.out.println("Writed: " + 12.2 * 7.4);
            dataOut.writeDouble(12.2 * 7.4);
        } catch (IOException e) {
            System.out.println("Write err");
            return;
        }
        System.out.println();
        try (DataInputStream dataIn = new DataInputStream(new FileInputStream("testdata")))
        {
            i = dataIn.readInt();
            System.out.println("Readed:" + i);
            d = dataIn.readDouble();
            System.out.println("Readed:" + d);
            b = dataIn.readBoolean();
            System.out.println("Readed:" + b);
            d = dataIn.readDouble();
            System.out.println("Readed:" + d);
        } catch (IOException e){ ;
            System.out.println("Reading err");
        }
    }
}
//hello to all humans