package FirstClass;

import java.util.Scanner;

public class HitungUpah {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bp = 8000;
        double gaji;

        System.out.println("Masukan jam kerja : ");
        int jamker = input.nextInt();
        System.out.println("Masukan Base Payment : ");
        int bpInput = input.nextInt();

        if (bpInput >= bp) {
            if (jamker >= 40 && jamker < 60) {
                gaji = bp + ((jamker - 40) * 1.5);
                System.out.println(gaji);
            } else {
                System.out.println("Error jam kerja");
            }
        }else {
            System.out.println("Bp = 0");
        }
    }
}

