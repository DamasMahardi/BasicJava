package com.company;

import java.util.Scanner;

public class CaseInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("You have two options of course at dataFlair");
        System.out.println("1 Java");
        System.out.println("2 Python");
        System.out.println("Enter number Course");
        int ch = sc.nextInt();
        switch (ch){
            case 1:
                System.out.println("Chongsts you have java");
                break;
            case 2:
                System.out.println("Chpngs you have Python");
                break;
            default:
                System.out.println("wrong input");
                break;
        }
    }
}
