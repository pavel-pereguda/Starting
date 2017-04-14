package sample.Shildt.IN_OUT.TickTock;

/**
 * Created by pavel on 13.04.2017.
 */
public class TickTock {
    String state;

    synchronized void tick (boolean running) {
        if (!running) {
            state = "ticked";
            notify();
            return;
        }
        System.out.println("Tick");
        state = "ticked";
        notify();
        try {
            while (!state.equals("tocked"))
                wait();
        }
        catch (InterruptedException e){
            System.out.println("Thread break");
        }
    }


    synchronized void tock(boolean running){
        if(!running){
            state="tocked";
            notify();
            return;
        }
        System.out.println("Tock\n");
        state="tocked";
        notify();
        try {
            while (!state.equals("ticked"))
                wait();
        } catch (InterruptedException e){
            System.out.println("Thread break");
        }
    }
}
