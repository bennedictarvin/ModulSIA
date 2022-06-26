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
public class Staff extends SIA {

    String NIK;

    public Staff() {

    }

    public Staff(String NIK, String nama, String alamat, String TTL, String telepon) {
        super(nama, alamat, TTL, telepon);
        this.NIK = NIK;
    }

    @Override
    public String toString() {
        super.toString();
        return "Staff{" + "NIK=" + NIK + '}';
    }

}
