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
public class MatkulAjar extends Staff {

    int matkulAjar;
    List<PresensiStaff> presensiStaff = new ArrayList<>();

    public MatkulAjar() {

    }

    public MatkulAjar(int matkulAjar, String NIK, String nama, String alamat, String TTL, String telepon) {
        super(NIK, nama, alamat, TTL, telepon);
        this.matkulAjar = matkulAjar;
    }

    int jamMengajarDosen(int presensi) {
        presensi = Kehadiran.HADIR;
        return matkulAjar * presensi;
    }
}
