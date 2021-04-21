/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author Yusuf Isra
 */
public class UjiBus3 {

    public static void main(String[] args) {

        Bus3 Bus = new Bus3(5);

        Bus.getPenumpang(17);
        Bus.getPenumpang(24);
        Bus.cetakpenumpang();

        //penambahan penumpang
        Bus.addPenumpang(2);//tambah 2 penumpang
        Bus.cetakpenumpang();

        //penambahan penumpang
        Bus.addPenumpang(1);//tambah 1 penumpang
        Bus.cetakpenumpang();

        //penambahan penumpang
        Bus.addPenumpang(2);//tambah 2 penumpang
        Bus.cetakpenumpang();

        //penambahan penumpang
        Bus.addPenumpang(2);//tambah 2 penumpang
        Bus.cetakpenumpang();
    }
}
