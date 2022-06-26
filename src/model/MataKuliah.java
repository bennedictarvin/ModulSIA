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
public class MataKuliah extends Mahasiswa {

    String kode;
    int SKS;
    String namaMatkul;

    public MataKuliah() {

    }

    public MataKuliah(String kode, int SKS, String nama) {
        this.kode = kode;
        this.SKS = SKS;
        this.namaMatkul = nama;
    }

    public MataKuliah(String kode, int SKS, String namaMatkul, String NIM, String jurusan, String nama, String alamat, String TTL, String telepon) {
        super(NIM, jurusan, nama, alamat, TTL, telepon);
        this.kode = kode;
        this.SKS = SKS;
        this.namaMatkul = nama;
    }

    @Override
    public String toString() {
        super.toString();
        return "MataKuliah{" + "kode=" + kode + ", SKS=" + SKS + ", namaMatkul=" + namaMatkul + '}';
    }

}
