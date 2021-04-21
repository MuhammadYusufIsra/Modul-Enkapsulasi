/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

/**
 *
 * @author Yusuf Isra
 */
public class Main {

    public static void main(String[] args) {

        //Membuat objek untuk class Bus agar parameternya bisa dipakai semua
        Bus Bus = new Bus(100);
        Bus.getPenumpang(27);
        Bus.cetakpenumpang();
        System.out.println();

        //penambahan penumpang
        Bus.addPenumpang(30);
        Bus.getPenumpang(27);
        Bus.cetakpenumpang();

        System.out.println();

        Bus.addPenumpang(20);
        Bus.getPenumpang(27);
        Bus.cetakpenumpang();

        System.out.println();

        System.out.println("Rata-rata Berat Penumpang Bus : " + Bus.getAverage());
    }

}
