package sample.Shildt.IN_OUT;
import java.util.*;

/**
 * Created by pavel on 10.04.2017.
 */
public class MyThread extends Thread{

    public Thread thrd;
    MyThread(String name){
        thrd = new Thread(this, name);
        thrd.start();
    }
    public void run(){
        System.out.println(thrd.getName()+"-opening");
        try {
            for (int count=0; count<10;count++){
                Thread.sleep(400);
                System.out.println("B "+thrd.getName()+", counter: "+ count);
            }
        }catch (InterruptedException e){
            System.out.println(thrd.getName()+" breaked");
        }
        System.out.println(thrd.getName()+" ended");
    }
}
class ExtendThread{
    public static void main(String[] args) {
        System.out.println("Main thread start");
        MyThread mt1 = new MyThread("Child#1");
        MyThread mt2 = new MyThread("Child#2");
        MyThread mt3 = new MyThread("Child#3");



            try{
                mt1.thrd.join();
                System.out.println("1 - included");
                mt2.thrd.join();
                System.out.println("2 - included");
                mt3.thrd.join();
                System.out.println("3 - included");

            }
            catch (InterruptedException e){
                System.out.println("Main thread break");
            }

        System.out.println("Main thread ending");
    }
}
