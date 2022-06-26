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
public class DosenHonorer extends Dosen {

    int honorPerSKS;
    int unit = Kehadiran.HADIR;

    public DosenHonorer() {

    }

    public DosenHonorer(int honorPerSKS, String departemen, String NIK, String nama, String alamat, String TTL, String telepon) {
        super(departemen, NIK, nama, alamat, TTL, telepon);
        this.honorPerSKS = honorPerSKS;
    }
    
    double hitungGaji() {
        return unit * honorPerSKS;
    }
}
