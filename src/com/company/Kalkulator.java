package com.company;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        boolean isExit = false;
        Scanner scanner = new Scanner(System.in);
        int n1;
        int n2;
        int hasil;
        System.out.println("Masukan angka pertama : ");
        n1= scanner.nextInt();
        System.out.println("Msukan Angka ke 2 : ");
        n2 = scanner.nextInt();
        System.out.println("Pilih operasi yang akan di pake");
        scanner.nextLine();


        String operasi = scanner.nextLine().toString();
        switch (operasi){
            case "+":
                hasil= n1+n2;
                System.out.println("Hasil Tambah : "+hasil);
                break;
            case "-":
                hasil = n1-n2;
                System.out.println("Hasil Kurang :"+ hasil);
                break;
            case "*":
                hasil = n1*n2;
                System.out.println("Hasil Kali :"+hasil);
                break;
            case "/":
                hasil= n1/n2;
                System.out.println("Hasil Bagi :" +hasil);
                break;
            default:
                System.out.println("Pilihan yang anda masukan tidak ada");
                break;

        }
        System.out.println("Ulangi lagi ?");
        System.out.println("Ketik ya untuk ulangi , ketik tidak untkk keluar");
        operasi = scanner.nextLine();
        if (operasi == "tidak"){
            isExit = true;

        }else {
            return;
            }

        }

    }

