package sample.Shildt.IN_OUT;
import java.util.*;

/**
 * Created by pavel on 10.04.2017.
 */
public class MyThread extends Thread{
    MyThread(String name){
        super(name);
        start();
    }
    public void run(){
        System.out.println(getName()+"-opening");
        try {
            for (int count=0; count<10;count++){
                Thread.sleep(400);
                System.out.println("B "+getName()+", counter: "+ count);
            }
        }catch (InterruptedException e){
            System.out.println(getName()+" breaked");
        }
        System.out.println(getName()+" ended");
    }
}
class ExtendThread{
    public static void main(String[] args) {
        System.out.println("Main thread start");
        MyThread mt = new MyThread("Child#1");
        for (int i=0;i<50;i++){
            System.out.print(".");
            try{
                Thread.sleep(100);
            }
            catch (InterruptedException e){
                System.out.println("Main thread break");
            }
        }
        System.out.println("Main thread ending");
    }
}