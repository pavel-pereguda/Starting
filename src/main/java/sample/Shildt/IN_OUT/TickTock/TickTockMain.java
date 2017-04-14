package sample.Shildt.IN_OUT.TickTock;

import sample.Shildt.IN_OUT.MyThread;

/**
 * Created by pavel on 14.04.2017.
 */
public class TickTockMain {
    public static void main(String[] args) {
        TickTock tt = new TickTock();
        SomeThread mt1 = new SomeThread("Tick", tt);
        SomeThread mt2 = new SomeThread("Tock", tt);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        }catch (InterruptedException e){
            System.out.println("Main thread break");
        }
    }
}
