/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_hehe;

import java.util.Scanner;
/**
 *
 * @author A-10
 */
public class uts {
    public static void main(String[] args) {
        //1
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        //2
        System.out.println("UTS PBO 20 Mei 2024 oleh : \n\tZacky Haigel Putra Sandy Asmara - 23201248");
        //3
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        //4
        String namaUser;
        
        Scanner scanner = new Scanner (System.in);
        System.out.println("Masukkan Nama anda: ");
        //5
        namaUser = scanner.nextLine();
        //6
        System.out.println("Pilih Jenis kelamin: 1 Laki - Laki 2 Perempuan");
        //7
        int pilihanGender = scanner.nextInt();
        scanner.nextLine();
        //8
        String panggilan;
        if (pilihanGender == 1) {
            panggilan = "Mas";
        } else if (pilihanGender == 2) {
            panggilan = "Mbak";
        } else {
            panggilan = "anda";
        }
        
        System.out.println("Selamat Datang " + panggilan + " " + namaUser);
        //9
        System.out.println("====================Kalkulator======================");
        //10
        boolean lanjut = true;
        
        while (lanjut) {
            System.out.println("Masukkan bilangan pertama: ");
            double bilangan1 = scanner.nextDouble();
            
            System.out.println("Masukkan bilangan kedua: ");
            double bilangan2 = scanner.nextDouble();
            
            System.out.println("Masukkan Operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);
            
            double hasil;
            boolean operatorValid = true;
            
            switch (operator) {
                case '+':
                    hasil = bilangan1 + bilangan2;
                    break;
                case '-':
                    hasil = bilangan1 - bilangan2;
                    break;
                case '*':
                    hasil = bilangan1 * bilangan2;
                    break;
                case '/':
                    if (bilangan2 != 0){
                       hasil = bilangan1 / bilangan2;
                    } else {
                        System.out.println("Error: Pembagian dengan nol tidak dapat dilakukan");
                        continue;
                    }
                    break;
                default:
                    System.out.println("operator tidak valid. pilih operator yang tersedia/valid.");
                    operatorValid = false;
                    hasil = 0;
                    break;
            }
            if (operatorValid) {
                System.out.println("Hasil: " + bilangan1 + " " + operator + " " + bilangan2 + " = " + hasil);
                }
            System.out.println("Apakah anda ingin melanjutkan pengghunaan Kalkulator? y/n: ");
            char lanjutPilihan = scanner.next().charAt(0);
            
            if (lanjutPilihan == 'n' || lanjutPilihan == 'N') {
                lanjut = false;
                
                System.out.println("Thank you for using the calculator. Goodbye!");
                scanner.close();
            }
        }
    }
}
