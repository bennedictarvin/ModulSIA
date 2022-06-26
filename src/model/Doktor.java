package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arvin Situmorang
 */
public class Doktor extends Mahasiswa {

    String judulDisertasi;
    int n1, n2, n3;

    public Doktor() {

    }

    public Doktor(String judulDisertasi, int n1, int n2, int n3, String NIM, String jurusan, String nama, String alamat, String TTL, String telepon) {
        super(NIM, jurusan, nama, alamat, TTL, telepon);
        this.judulDisertasi = judulDisertasi;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    @Override
    double nilaiAkhir() {
        return (n1 + n2 + n3) / 3;
    }
}
