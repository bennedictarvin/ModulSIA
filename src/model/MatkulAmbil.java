package model;


import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Arvin Situmorang
 */
public class MatkulAmbil extends Mahasiswa {

    String matkulAmbil;
    List<Presensi> presensi = new ArrayList<>();
    int n1, n2, n3;

    public MatkulAmbil() {

    }

    public MatkulAmbil(String matkulAmbil, int n1, int n2, int n3, String NIM, String jurusan, String nama, String alamat, String TTL, String telepon) {
        super(NIM, jurusan, nama, alamat, TTL, telepon);
        this.matkulAmbil = matkulAmbil;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    String matkulYangDiambil(String NIM) {
        return "Matkul yang diambil: " + matkulAmbil + ", Total presensi: " + presensi;
    }
}
