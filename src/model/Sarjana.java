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
public class Sarjana extends Mahasiswa {

    List<String> mataKuliah = new ArrayList<>();
    int n1, n2, n3;

    public Sarjana() {
    }

    public Sarjana(String NIM, String jurusan, String nama, String alamat, String TTL, String telepon) {
        super(NIM, jurusan, nama, alamat, TTL, telepon);
    }
    
    @Override
    double nilaiAkhir() {
        return (n1 + n2 + n3) / 3;
    }
}
