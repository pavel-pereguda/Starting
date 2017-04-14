package sample.Shildt.IN_OUT;

import sun.security.provider.certpath.PKIXTimestampParameters;

/**
 * Created by pavel on 10.04.2017.
 */
public class Priority implements Runnable {
    int count;
    Thread thrd;
    int x = 0;

    static boolean stop = false;
    static String currentName;

    Priority(String name){
        thrd=new Thread(this, name);
        count=0;
        currentName = name;
        int x=0;
    }
    public void run(){
        System.out.println(thrd.getName()+" - starting");
        do{
            x++;
            count++;
            if(currentName.compareTo(thrd.getName())!=0){
                currentName=thrd.getName();

                System.out.println("B "+x+ currentName);
            }
        }while (stop==false && count<10000000);
        stop=true;
        System.out.println("\n "+ thrd.getName()+ " - ending");
    }
}
class PriorityDemo {
    public static void main(String[] args) {
        Priority mt1 = new Priority("High priority");
        Priority mt2 = new Priority("Low priority");

        mt1.thrd.setPriority(Thread.NORM_PRIORITY+2);
        mt2.thrd.setPriority(Thread.NORM_PRIORITY-2);

        mt1.thrd.start();
        mt2.thrd.start();

        try
        {
            mt1.thrd.join();
            mt2.thrd.join();
        }
        catch (InterruptedException e){
            System.out.println("Main thread break");
        }
        System.out.println("\nThread counter HIGH "+mt1.count);
        System.out.println("\nThread counter LOW " + mt2.count);
    }
}