/*
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Program Lingkaran
 */
package pbo210116397latihan38lingkaran;

import java.util.Scanner;

/**
 *
 * @author Zetro
 */
public class PBO210116397Latihan38Lingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String d;
        double diameter; //operand
        Scanner circle = new Scanner(System.in);
        Lingkaran bulat = new Lingkaran();

        System.out.println("===Perhitungan Lingkaran===");

        do {
            System.out.print("Masukkan nilai diameter lingkaran : ");
            d = circle.nextLine();
            System.out.println((!d.matches("[0-9]*"))
                    ? "Nilai Diameter Tidak Sesuai\n" : "");

        } while (!d.matches("[0-9]*"));

        System.out.println("===Hasil Perhitungan Lingkaran===");
        diameter = Double.parseDouble(d);

        System.out.printf("Jari-jari Lingkaran = %.0f cm %n",
                bulat.jari2Lingkaran(diameter));
        System.out.printf("Luas Lingkaran = %.2f cm %n", bulat.luasLingkaran(
                bulat.jari2Lingkaran(diameter)));
        System.out.printf("Keliling Lingkaran = %.2f cm %n", bulat.
                kelilingLingkaran(bulat.jari2Lingkaran(diameter)));

    }
    
}
