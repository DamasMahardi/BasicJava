package com.company;

public class ReturnMethod {
    public static void main(String[] args) {
        Tambah(2,3);
        Kali(8,9);

    }
    public static int Tambah( int angka1, int angka2){
        int hasil = angka1 + angka2;
        System.out.println("Hasil nya : " + hasil);
        return hasil;
    }

    public static  int Kali(int angka1, int angka2){
        int hasil = angka1 *angka2;
        System.out.println("Hasilnya adalah : "+ hasil);
        return hasil;

    }
}
