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
public class Dosen extends Staff {

    String departemen;
    List<String> mataKuliah = new ArrayList<>();

    public Dosen() {

    }

    public Dosen(String departemen, String NIK, String nama, String alamat, String TTL, String telepon) {
        super(NIK, nama, alamat, TTL, telepon);
        this.departemen = departemen;
    }

    @Override
    public String toString() {
        return "Dosen{" + "departemen=" + departemen + ", mataKuliah=" + mataKuliah + '}';
    }
    
    public String statusChecker(int status) {
        if (status == Kehadiran.ALPHA) {
            return "Hadir";
        } else {
            return "Alpha";
        }
    }

}
