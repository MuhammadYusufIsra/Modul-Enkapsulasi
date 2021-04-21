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
public class Bus {

    //Deklarasi Variabel, double, dan int
    private double penumpang, maxPenumpang;
    private int counter;
    public double penumpangBaru;

    //method Bus dengan parameter int maxPenumpang
    public Bus(int maxPenumpang) {
        //Menggunakan this. untuk mengubah variabel maxpenumpang dalam class ini menjadi maxpenumpang pada method/parameter ini
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }

    //method addPenumpang dengan parameter berjenis double dengan nama penumpang
    public void addPenumpang(double penumpang) {
        //Mengatur jenis variabel temp > double
        double temp;
        //untuk temp adalah hasil penjumlahan antara penumpang awal dengan penumpang setelah datang
        temp = this.penumpang + penumpang;
        //Percabangan, jika hasil penjumlahan penumpang tadi lebih besar dari kapasitas penumpangnya, maka akan mencetak pesan
        if (temp > maxPenumpang) {
            System.out.println("Kelebihan penumpang");
            //Else untuk melakukan action lain jika if tidak terpenuhi
        } else {
            //Jika tidak melebihi kapasitas, maka temp akan bertambah
            this.penumpang = temp;
            counter++;
        }
    }

    //Method getPenumpang dengan parameter int
    public void getPenumpang(int password) {
        //Percabangan if dan else
        if (password == 27) {
            System.out.println("Password Benar");
        } else {
            System.out.println("Password salah");
        }
    }

    //Method getAerage digunakan untuk menghitung rata rata dari jumlah penumpang
    public double getAverage() {
        double average = penumpang / counter;
        //Mengembalikan nilai average
        return average;
    }

    public void cetakpenumpang() {
        System.out.println("Penumpang Bus sekarang : " + penumpang);
        System.out.println("Penumpang maksimum : " + maxPenumpang);
    }

}
