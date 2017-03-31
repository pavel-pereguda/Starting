package sample.Shildt.IN_OUT;

import java.io.RandomAccessFile;

/**
 * Created by pavel on 31.03.2017.
 */
public class RandomAccessDemo {
    public static void main(String[] args) {
        double data []={19.4, 10.1, 123.54, 33.0, 87.9, 74.25};
        double d;
        try (RandomAccessFile raf = new RandomAccessFile("random.dat", "rw"))
        {
            for (int i=0;i<data.length)
    }
}
