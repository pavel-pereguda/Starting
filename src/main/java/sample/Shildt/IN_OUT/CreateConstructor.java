package sample.Shildt.IN_OUT.Enum;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by pavel on 27.04.2017.
 */

//
    enum Transport {
    CAR(1), TRSUCK(2), AIRRPANE(3);
    private int speed;

    Transport(int s) {
         speed = s;
    }

    int getSpeed() {
        return speed;
    }
}
         class CreateConstructor {
            public static void main(String[] args) {
                Transport tp;
                Transport arr[] = Transport.values();
                for (Transport t : arr) {
                    System.out.print("Typical speed for " + t + " is: ");
                    System.out.println(t.getSpeed());
                }
            }
        }


//
//
//
//
