package Main;

import model.Mahasiswa;
import model.MataKuliah;
import model.Presensi;
import model.SIA;
import model.Staff;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arvin Situmorang
 */
public class Main {

    public static void main(String[] args) {
        SIA sia = new SIA("Bobi", "Kopo", "Surabaya, 12 April 2001", "081294723");
        sia.toString();

        Mahasiswa m1 = new Mahasiswa("1121012", "IF", "Bobi", "Kopo", "Surabaya, 12 April 2001", "081294723");
        m1.toString();

        Staff s1 = new Staff("284065", "Bobi", "Kopo", "Surabaya, 12 April 2001", "081294723");
        s1.toString();

        MataKuliah mk = new MataKuliah("IF-3P1", 4, "PBO", "1121012", "IF", "Bobi", "Kopo", "Surabaya, 12 April 2001", "081294723");
        mk.toString();

        Presensi p = new Presensi("13/06/2022", 1, "1121012", "IF", "Bobi", "Kopo", "Surabaya, 12 April 2001", "081294723");
        p.toString();
        p.kehadiran();
    }
}
