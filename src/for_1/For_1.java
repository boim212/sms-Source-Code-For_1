package for_1;

import java.util.Scanner;

public class For_1 {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int angka, masuk, baris, kolom;
        angka = 0;
        
        do
        {
            System.out.print("Masukkan Jumlah Perulangan = ");
            masuk = input.nextInt();
        }
        while(masuk < 1);
        System.out.println("");
        System.out.println("+-------Tugas For 1-------+");
        System.out.println("+-------------------------+");
        System.out.println("");
        
        for (baris = 1; baris <= masuk; baris++) 
        {
            for (kolom = 1; kolom <= masuk; kolom++) 
            {
                System.out.print("* ");
            }
            System.out.println(angka);
            angka++;
        }
        System.out.println("");
        System.out.println("+------- 025314020 -------+");
        System.out.println("+-------Program Java------+");
    }
}
