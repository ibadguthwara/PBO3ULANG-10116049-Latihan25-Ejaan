package pbo3ulang.pkg10116049.latihan25.ejaan;

import java.util.Scanner;

/**
 *
 * @author ibadguthwara
 * NAMA              : M. Ibad Guthwara
 * KELAS             : PBO 3 ULANG
 * NIM               : 10116049
 * DESKRIPSI PROGRAM : Membuat Program Ejaan Nama 
 */
public class PBO3ULANG10116049Latihan25Ejaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         String Kata;
        
        
        Scanner baca = new Scanner (System.in);
        
        System.out.printf("Masukan nama depan anda untuk di eja : ");
        Kata = baca.next();
        
        System.out.println("");
        System.out.println("Ejaan untuk" + " '" + Kata + "' " + "adalah : " );
        
        
        
        for(int i=0; i<Kata.length(); i++) {
            String ambilkata;
            ambilkata = Kata.substring(i, i+1);
            System.out.println("Huruf ke-" + (i+1) + " : " + (ambilkata));
        }
    }
}
