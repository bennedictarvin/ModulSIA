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
public class Presensi extends Mahasiswa {

    String tanggal;
    int status;

    public Presensi() {
    }

    public Presensi(String tanggal, int status, String NIM, String jurusan, String nama, String alamat, String TTL, String telepon) {
        super(NIM, jurusan, nama, alamat, TTL, telepon);
        this.tanggal = tanggal;
        this.status = status;
    }

    @Override
    public String toString() {
        super.toString();
        return "Presensi{" + "tanggal=" + tanggal + ", status=" + status + '}';
    }
       
    public boolean kehadiran() {
        return status != Kehadiran.ALPHA;
    }
}
