package sample.Shildt.IN_OUT.TickTock;

/**
 * Created by pavel on 14.04.2017.
 */
public class SomeThread implements Runnable {
Thread thrd;
TickTock ttob;

SomeThread (String name, TickTock tt){
    thrd = new Thread (this,name);
    ttob = tt;
    thrd.start();
}
    @Override
    public void run() {
if(thrd.getName().compareTo("Tick")==0){
    for (int i=0;i<5;i++)
        ttob.tick(true);
    ttob.tick(false);
}else {
    for (int i = 0; i < 5; i++)
        ttob.tock(true);
    ttob.tock(false);
}
}
}
