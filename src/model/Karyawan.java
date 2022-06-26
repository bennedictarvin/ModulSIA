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
public class Karyawan extends Staff {

    double salary;
    List<String> presensiStaff = new ArrayList<>();
    int unit = Kehadiran.HADIR;

    public Karyawan() {

    }

    public Karyawan(double salary, String NIK, String nama, String alamat, String TTL, String telepon) {
        super(NIK, nama, alamat, TTL, telepon);
        this.salary = salary;
    }
    
    double hitungGaji() {
        return unit / 22 * salary;
    }
}
