package FirstClass;

import java.util.Scanner;
import java.lang.*;


public class HitungPajak{


    public static void statusTK(){
        Scanner input = new Scanner (System.in);
        int gaji;

        System.out.print("Masukan Gaji Pertahun : ");
        int ptkp = input.nextInt();

        System.out.println("Masukan Status: ");
        String status = input.next();

        System.out.println("Masukan golongan");
        int gol = input.nextInt();

        if (status.equals("kawin") && gol == 1) {
                gaji= ptkp-39000000;
                System.out.println(gaji);
        }else if(status.equals("kawin") && gol == 2){
                gaji=ptkp-42000000;
                System.out.println(gaji);
        }else if(status.equals("kawin") && gol == 3){
                gaji=ptkp-45000000;
                System.out.println(gaji);
        }else if(status.equals("kawin") && gol ==4){
                gaji=ptkp-48000000;
                System.out.println(gaji);
        }else if(status.equals("single") && gol == 1) {
                gaji=ptkp-36000000;
                System.out.println(gaji);
        }
        else if(status.equals("single") && gol == 2){
                gaji=ptkp-39000000;
                System.out.println(gaji);
        }
        else if(status.equals("single") && gol == 3){
                gaji=ptkp-42000000;
                System.out.println(gaji);
            }
        else if(status.equals("single") && gol ==44){
                gaji=ptkp-45000000;
                System.out.println(gaji);
            }else{
            System.out.println("Error Data input");
    }

    // method 2
        Double gajiNetto;

        if(gaji<0) {
            System.out.println("Error Gaji");
        }
        else if(gaji>0 && gaji<= 50000000){
            gajiNetto = gaji * 0.05;
        }
        
    }
    public static void main(String[] args){
    HitungPajak.statusTK();
    }




}
