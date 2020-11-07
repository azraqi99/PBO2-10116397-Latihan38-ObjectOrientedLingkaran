/*
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Program Lingkaran
 */
package pbo210116397latihan38lingkaran;

/**
 *
 * @author Zetro
 */
class Lingkaran {
     public double r; //jari-jari
    public double L; //luas
    public double K; //keliling

    public double jari2Lingkaran(double diameter) {
        r = diameter / 2;
        return r;
    }

    public double luasLingkaran(double r) {
        L = Math.PI * r * r;
        return L;
    }

    public double kelilingLingkaran(double r) {
        K = 2 * Math.PI * r;
        return K;
    }
}
