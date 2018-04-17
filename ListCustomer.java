package FirstClass;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.*;

public class ListCustomer {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        List<String> customerList = new ArrayList<>();


        System.out.println("Masukan jumlah data: " );
        int jumlah = input.nextInt();
       // System.out.println("Masukan nama Customer:");
        for( int i=1; i<=jumlah; i++){
            System.out.println("Masukan nama Customer:" +i);
            customerList.add(input.next());
        }
        System.out.println("Selesai Input Data");
            System.out.println("");
            System.out.println("List nya adalah :" +customerList);


    }
}
