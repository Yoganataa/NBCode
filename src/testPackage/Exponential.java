/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package testPackage;

/**
 *
 * @author Saiful Nur Budiman
 * Teknik Informatika - Univ.Islam Balitar
 * 2022-2023
 */
public class Exponential {

    //nul param 
    public Exponential() {
        System.out.println("ini const default");
    }

    public Exponential(double hasil) {
        System.out.println("ini const dengan satu param");        
    }

    
    
    
    
    public double hasil;
    
    public static void main(String[] args) {
//        Exponential exponential = new Exponential();
//        //tanpa param
//        exponential.pangkat();       
//        exponential.showHasil();
//        
//        //dengan dua param
//        exponential.pangkat(2, 4);
//        exponential.showHasil();

        Exponential exponential = new Exponential();
        Exponential exponential2 = new Exponential(2);
        
    }

    private double pangkat() {
        return hasil = Math.pow(3, 2);
    }

    private void showHasil() {
        System.out.println("Hasil pangkatnya adalah "+hasil);
    }

    private double pangkat(int x, int y) {
        return hasil = Math.pow(x, y);
    }
}
