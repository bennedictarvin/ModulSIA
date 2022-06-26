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
public class DosenTetap extends Dosen {

    double salary;
    int unit = Kehadiran.HADIR;

    public DosenTetap() {

    }

    public DosenTetap(double salary, String departemen, String NIK, String nama, String alamat, String TTL, String telepon) {
        super(departemen, NIK, nama, alamat, TTL, telepon);
        this.salary = salary;
    }

    double hitungGaji() {
        return salary + (unit * 25000);
    }
}
