package sample.Shildt.IN_OUT.UseMain;

/**
 * Created by pavel on 18.04.2017.
 */
public class UseMain {
    public static void main(String[] args) {
        Thread thrd;
        thrd=Thread.currentThread();
        System.out.println("Main thread name: "+thrd.getName());
        System.out.println("Priority: "+thrd.getPriority());
        System.out.println();
        System.out.println("Name and priority setting\n ");
        thrd.setName("Thread #1");
        thrd.setPriority(Thread.NORM_PRIORITY+3);
        System.out.println("Thread new name: "+thrd.getName());
        System.out.println("New priority nubmer: "+thrd.getPriority());
    }
}
