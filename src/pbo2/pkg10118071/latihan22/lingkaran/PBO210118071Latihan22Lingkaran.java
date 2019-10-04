/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan22.lingkaran;
// package scanner
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA              : David Aditya Winarto
 * KELAS             : PBO2
 * NIM               : 10118071
 * Deskripsi Program : Program ini berisi program untuk menghitung
 *                     luas dan keliling lingkaran  
 * 
 */
public class PBO210118071Latihan22Lingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // membuat objek dari class scanner
        Scanner input = new Scanner(System.in);
        // variabel untuk menyimpan input dari user
        String diameter;
        
        System.out.println("==========Perhitungan Lingkaran==========");
        System.out.print("Masukkan nilai diameter lingkaran : ");
        diameter = input.next();
        
        while (!(diameter.matches("[0-9]*"))) {
            System.out.println("Nilai Diameter Tidak Sesuai");
            System.out.println();
            System.out.print("Masukkan nilai diameter lingkaran : ");
            diameter = input.next();
        }
        
        // mengubah string ke integer
        int d = Integer.parseInt(diameter);
        
        int jari = d / 2;
        double luas = 3.1416 * jari * jari;
        double keliling = 2 * 3.1416 * jari;
        
        System.out.println("Jari-jari lingkaran = " + jari);
        System.out.println("Luas lingkaran = " + luas);
        System.out.println("Keliling lingkaran = " + keliling);
    }
    
}
