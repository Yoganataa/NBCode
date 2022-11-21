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
public class Warung {
    String makan, minum;

    public String getMakan() {
        return makan;
    }

    public void setMakan(String makan) {
        this.makan = makan;
    }

    public String getMinum() {
        return minum;
    }

    public void setMinum(String minum) {
        this.minum = minum;
    }
    
    
    public static void main(String[] args) {
        Warung warung = new Warung();
        warung.setMakan("Nasi Goreng");
        warung.setMinum("Es Teh Gelas");
        
        System.out.println("Makanannya: "+warung.getMakan());
        System.out.println("Minumannya: "+warung.getMinum());
        
    }
    
    
}
