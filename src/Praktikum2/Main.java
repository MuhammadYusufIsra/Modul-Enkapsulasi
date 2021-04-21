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
public class Main {

    //Class Main untuk menjalankan program
    public static void main(String[] args) {

        //Membuat objek dari method dan mengisi parameter
        Bola bolabasket = new Bola();
        bolabasket.setJariJari(75);
        bolabasket.showDiameter();
        bolabasket.showLuasPermukaan();
        bolabasket.showVolume();
    }
}
