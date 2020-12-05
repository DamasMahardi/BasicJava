package com.company;

public class MethodReturn {
    public static void main(String[] args) {
        tambah(2.5, 3.8);

    }
    static void tambah(Double angka1,Double angka){
        double hasil = angka + angka1;
        System.out.println("Hasilnya :" + hasil);
    }

}
