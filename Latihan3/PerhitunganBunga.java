package Latihan3;

import FirstClass.Bunga;
import com.sun.deploy.perf.PerfHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerhitunganBunga {
    private double sisa;
    private double pokokCicilan;
    private double bungaBulan;
    private double totalBayar;
    public  double Bunga;

    public  Long Angsuran;
    public  Long Sisa;

    public  int a;
    public  int kali = 12;

    Scanner input = new Scanner(System.in);
    List<PerhitunganBunga> daftar = new ArrayList<>();

    public double getSisa() {
        return sisa;
    }

    public void setSisa(double sisa) {
        this.sisa = sisa;
    }

    public double getPokokCicilan() {
        return pokokCicilan;
    }

    public void setPokokCicilan(double pokokCicilan) {
        this.pokokCicilan = pokokCicilan;
    }

    public double getBungaBulan() {
        return bungaBulan;
    }

    public void setBungaBulan(double bungaBulan) {
        this.bungaBulan = bungaBulan;
    }

    public double getTotalBayar() {
        return totalBayar;
    }

    public void setTotalBayar(double totalBayar) {
        this.totalBayar = totalBayar;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void hitungBunga() {

        // Masukan data
        System.out.println("Masukan Jumlah Pinjaman : ");
        Angsuran = input.nextLong();

        //masukan suku bunga
        System.out.println("Masukan suku bunga : ");
        Bunga = input.nextDouble();

        //menghitung bunga flat
        Bunga = ((double) Bunga / 100) / kali;
        System.out.println("Suku bunga perbulan =" + Bunga);
        System.out.println("");

        //Hitung semua
        Sisa = Angsuran;
        for (int i = 1; i <= kali; i++) {
            if (i == 1) {

            } else {
                Sisa = Sisa - (Angsuran / kali);
            }
            PerhitunganBunga daftar2 = new PerhitunganBunga();

            pokokCicilan = Angsuran / 12;
            bungaBulan = Sisa * Bunga;
            totalBayar = pokokCicilan + bungaBulan;

            //isi method setMethod dengan Variable hasil hitung
            daftar2.setPokokCicilan(pokokCicilan);
            daftar2.setSisa(Sisa);
            daftar2.setBungaBulan(bungaBulan);
            daftar2.setTotalBayar(totalBayar);
            daftar2.setA(i);

            //Mengisikan isi objek daftar ke list (daftar2)
            daftar.add(daftar2);

        }
    }

    public void tampil() {
        for (PerhitunganBunga x : daftar) {
            System.out.println("Angsuran Ke " + x.getA() + ":" + " " + x.getSisa() + "  |  "
                    + "Cicilan per-bulan : " + x.getPokokCicilan() + " |  "
                    + "Bunga per-bulan : " + x.getBungaBulan() + "  |  "
                    + "Total Angsuran : " + x.getTotalBayar());
        }
    }

    public static void main(String[] args) {
        PerhitunganBunga objek = new PerhitunganBunga();

        objek.hitungBunga();
        objek.tampil();

    }
}

