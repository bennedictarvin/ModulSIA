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
public class MatkulPilihan {

    int kode;
    String SKS;
    String nama;
    int mhsMinimum;

    public MatkulPilihan() {
        
    }

    public MatkulPilihan(int kode, String SKS, String nama, int mhsMinimum) {
        this.kode = kode;
        this.SKS = SKS;
        this.nama = nama;
        this.mhsMinimum = mhsMinimum;
    }

}
