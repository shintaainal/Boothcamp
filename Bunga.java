package FirstClass;

import java.util.Scanner;

public class Bunga {

    public static void hitungBunga() {
        Scanner input = new Scanner(System.in);
        int kali = 12;
        double Bunga1;

        // Masukan data
        System.out.println("Masukan Jumlah Pinjaman : ");
        Long Angsuran = input.nextLong();
        System.out.println("");

        //masukan suku bunga
        System.out.println("Masukan suku bunga : ");
        double Bunga = input.nextDouble();

        //menghitung Bunga
        Bunga = ((double) Bunga / 100) / kali;
        System.out.println("Suku bunga perbulan =" + Bunga);
        System.out.println("");

        Long Sisa;
        Sisa = Angsuran;

        for (int i =1; i <=kali; i++) {
            if(i==1){

            }else {
                Sisa = Sisa - (Angsuran / kali);
            }
            double PokokCicilan = Angsuran/12;
            double BungaBulan = Sisa*Bunga ;
            double Total = PokokCicilan + BungaBulan;

        System.out.println("Angsuran ke " +i +"   " +": " + "  |  " +Sisa +"   " +"   |   "
                +"Cicilan Per bulan : " +PokokCicilan + "   " +"   |   "
                +"Bunga per bulan: " +"   " +"   |   "
                + " "+BungaBulan +"   " +"   |   " +"Total angsuran : " + "   |   " +Total);

    }}

    public static void main(String[] args){
    hitungBunga();
    }
}
