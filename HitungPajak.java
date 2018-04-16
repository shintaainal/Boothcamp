package FirstClass;

import java.util.Scanner;
import java.lang.*;


public class HitungPajak {


    public static void statusTK() {
        Scanner input = new Scanner(System.in);
        int gaji = 0;
        double pajakTotal;

        System.out.print("Masukan Gaji Pertahun : ");
        int ptkp = input.nextInt();

        System.out.println("Masukan Status: ");
        String status = input.next();

        System.out.println("Masukan golongan");
        //int gol = input.nextInt();

        if (status.equals("k1")) {
            gaji = ptkp - 39000000;
            System.out.println(gaji);
        } else if (status.equals("k2")) {
            gaji = ptkp - 42000000;
            System.out.println(gaji);
        } else if (status.equals("k3")) {
            gaji = ptkp - 45000000;
            System.out.println(gaji);
        } else if (status.equals("k4")) {
            gaji = ptkp - 48000000;
            System.out.println(gaji);
        } else if (status.equals("tk1")) {
            gaji = ptkp - 36000000;
            System.out.println(gaji);
        } else if (status.equals("tk2")) {
            gaji = ptkp - 39000000;
            System.out.println(gaji);
        } else if (status.equals("tk3")) {
            gaji = ptkp - 42000000;
            System.out.println(gaji);
        } else if (status.equals("tk4")) {
            gaji = ptkp - 45000000;
            System.out.println(gaji);
        } else {
            System.out.println("Error Data input");
        }
        if (gaji > 500000000) {
            pajakTotal = (gaji - 500000000) * 0.30;
            pajakTotal = (pajakTotal + (500000000 * 0.25));
            pajakTotal = (pajakTotal + (250000000 * 0.15));
            pajakTotal = (pajakTotal + (50000000 * 0.05));
            System.out.println("Pajak Total = " + pajakTotal);
        } else if (gaji > 250000000 && gaji < 500000000) {
            pajakTotal = (gaji - 250000000) * 0.25;
            pajakTotal = (pajakTotal + (250000000 * 0.15));
            pajakTotal = (pajakTotal + (50000000 * 0.05));
            System.out.println("Pajak Total = " + pajakTotal);
        } else if (gaji > 50000000 && gaji < 250000000) {
            pajakTotal = (gaji - 50000000) * 0.25;
            pajakTotal = (pajakTotal + (50000000 * 0.05));
            System.out.println("Pajak Total = " + pajakTotal);
        } else {
            System.out.println("Pajak Total = 0");
        }
    }

    public static void main(String[] args){
    HitungPajak.statusTK();
    }




}

