/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

/**
 *
 * @author Yusuf Isra
 */
public class Bola {

    //Deklarasi variabel private double untuk jari jari
    private double jarijari;

    //method void untuk seJariJari dengan double sebagai parameter
    void setJariJari(double jari2) {
        //This. untuk mengubah jari jari yang ada di class ini dengan jari jari yang ada di method ini
        this.jarijari = jari2;
    }

    void showDiameter() {

        double D = this.jarijari * 2;
        System.out.println("Diameter nya adalah : " + D + " cm");
    }

    void showLuasPermukaan() {
        double LP = 4 * Math.PI * Math.pow(this.jarijari, 2);
        System.out.println("Luas permukaannya adalah : " + LP + " cm2");
    }

    void showVolume() {
        double V = (4 / 3) * Math.PI * Math.pow(this.jarijari, 3);
        System.out.println("Volumenya adalah : " + V + " cm3");
    }
}
