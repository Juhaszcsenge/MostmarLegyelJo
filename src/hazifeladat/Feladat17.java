package hazifeladat;

import java.util.Arrays;

public class Feladat17 {
    public static void main(String[] args) {
        int [] egy  = {6,9,0,4,7,6};
        int [] ketto = {7,4,9,3,0,1};
        int [] osszeg = new int[6];

        for (int i = 0; i < osszeg.length; i++) {
            osszeg[i] = ketto[i] + egy[i];
        }

        System.out.println(Arrays.toString(egy));
        System.out.println(Arrays.toString(ketto));
        System.out.println(Arrays.toString(osszeg));




    }
}

