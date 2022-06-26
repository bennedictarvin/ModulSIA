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
public class PresensiStaff extends Staff {

    int tanggal;
    int status;
    int jam;

    public PresensiStaff() {
        
    }

    public PresensiStaff(int tanggal, int status, int jam, String NIK, String nama, String alamat, String TTL, String telepon) {
        super(NIK, nama, alamat, TTL, telepon);
        this.tanggal = tanggal;
        this.status = status;
        this.jam = jam;
    }
    
    public boolean kehadiran() {
        return status != Kehadiran.ALPHA;
    }
}
