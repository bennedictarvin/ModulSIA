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
public class Mahasiswa extends SIA {

    String NIM;
    String jurusan;
    int n1, n2, n3;

    public Mahasiswa() {

    }

    public Mahasiswa(String NIM, String jurusan, String nama, String alamat, String TTL, String telepon) {
        super(nama, alamat, TTL, telepon);
        this.NIM = NIM;
        this.jurusan = jurusan;
    }

    @Override
    public String toString() {
        super.toString();
        return "Mahasiswa{" + "NIM=" + NIM + ", jurusan=" + jurusan + '}';
    }
    
    double nilaiAkhir() {
        return (n1 + n2 + n3) / 3;
    }
    
    void kelulusan() {
        if (nilaiAkhir() < 56) {
            System.out.println("Tidak lulus!");
        } else {
            System.out.println("Lulus!");
        }
    }
}
