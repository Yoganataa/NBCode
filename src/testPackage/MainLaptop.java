/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package testPackage;

import java.util.Scanner;

/**
 *
 * @author Saiful Nur Budiman
 * Teknik Informatika - Univ.Islam Balitar
 * 2022-2023
 */
public class MainLaptop {

    public static void main(String[] args) {
        Laptop[] laptops = new Laptop[2];
        
        //mengisi
        for(int i=0;i<laptops.length;i++){
            //gunakanya untuk membentuk object baru dari class Laptop
            laptops[i] = new Laptop();
            
            System.out.print("Nama laptop: ");
            Scanner sc = new Scanner(System.in);
            laptops[i].setBrand(sc.next());
            laptops[i].setHarga(i);
        }
        
        //menampilakan
        for(int i=0;i<laptops.length;i++){
            System.out.println("Brand Laptop adalah "+laptops[i].getBrand());
        }
    }
}
