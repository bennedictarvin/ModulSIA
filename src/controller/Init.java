/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Arvin Situmorang
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import model.*;
import java.util.ArrayList;

/**
 *
 * @author Felicia
 */
public class Init {

    String nama, alamat, TTL, telp, jurusan, judulTesis, judulDisertasi;
    int nim, nik;
    String departemen;
    int salary, honorPerSKS;

    MataKuliah matkul1, matkul2, matkul3, matkul4;
    Presensi presensi1, presensi2, presensi3;
    ArrayList<Presensi> listPresensi1, listPresensi2, listPresensi3, listPresensi4;
    MatkulAmbil matkulAmbilWajib1, matkulAmbilWajib2, matkulAmbilWajib3, matkulAmbilPilihan;
    MatkulPilihan matkulPilihan1, matkulPilihan2, matkulPilihan3;
    ArrayList<MatkulAmbil> listMataKuliahMagister1, listMataKuliahMagister2, listMataKuliahMagister3, listMataKuliahMagister4;

    PresensiStaff presensiStaff1, presensiStaff2, presensiStaff3, presensiStaff4;
    ArrayList<PresensiStaff> listPresensiStaff, listPresensiStaff1, listPresensiStaff2, listPresensiStaff3, listPresensiStaff4, listPresensiStaff5, listPresensiStaff6;
    MatkulAjar matkulAjar1, matkulAjar2, matkulAjar3, matkulAjar4, matkulAjar5, matkulAjar6;
    ArrayList<MatkulAjar> listMataKuliahAjar;

    ArrayList<Sarjana> listMhsSarjana = new ArrayList<>();
    ArrayList<Magister> listMhsMagister = new ArrayList<>();
    ArrayList<Doktor> listMhsDoktor = new ArrayList<>();
    ArrayList<DosenTetap> listDosenTetap = new ArrayList<>();
    ArrayList<DosenHonorer> listDosenHonorer = new ArrayList<>();
    ArrayList<Karyawan> listKaryawan = new ArrayList<>();

    Init() {
        initArrListMhsSarjana();
        initArrListMhsMagister();
        initArrListMhsDoktor();
        initArrListDosenTetap();
        initArrListDosenHonorer();
        initArrListKaryawan();
    }

    private void initArrListMhsSarjana() {

        matkul1 = new MataKuliah("IF-101", 4, "Algoritma dan Pemrograman");
        matkul2 = new MataKuliah("KU-101", 2, "PPKN");
        matkul3 = new MataKuliah("IF-102", 2, "Desaign Web");

        ArrayList<Presensi> tempPresensi;
        ArrayList<MatkulAmbil> tempListMataKuliah;

        // MAHASISWA 1
        nama = "Anton";
        alamat = "Jalan A";
        TTL = "Bdg, 1 Jan 1999";
        nim = 101;
        telp = "081319521";
        jurusan = "Informatika";

        tempListMataKuliah = new ArrayList<>();

        // MAHASISWA 2
        nama = "Budi";
        alamat = "Jalan B";
        TTL = "Bdg, 5 Juni 1999";
        nim = 102;
        telp = "081048621";
        jurusan = "Informatika";

        tempListMataKuliah = new ArrayList<>();

        // MAHASISWA 3
        nama = "Cemara";
        alamat = "Jalan C";
        TTL = "Bdg, 9 Feb 1999";
        nim = 103;
        telp = "0846512";
        jurusan = "Informatika";

        tempListMataKuliah = new ArrayList<>();

        // MAHASISWA 4
        nama = "Delimah";
        alamat = "Jalan D";
        TTL = "Bdg, 19 Aug 1999";
        nim = 104;
        telp = "0817953542";
        jurusan = "Informatika";

        tempListMataKuliah = new ArrayList<>();

        // MAHASISWA 5
        nama = "Eka";
        alamat = "Jalan E";
        TTL = "Bdg, 26 Des 1999";
        nim = 105;
        telp = "081645131";
        jurusan = "Informatika";

        tempListMataKuliah = new ArrayList<>();

    }

    private void initArrListMhsMagister() {

        matkul1 = new MataKuliah("IF-201", 4, "Struktur Data");
        matkul2 = new MataKuliah("KU-201", 2, "Agama");
        matkul3 = new MataKuliah("IF-202", 2, "Web Programming");

        ArrayList<Presensi> tempPresensi;
        ArrayList<MatkulAmbil> tempListMataKuliah;

        // MAHASISWA 1
        nama = "Ananda";
        alamat = "Jalan A";
        TTL = "Bdg, 7 Jan 1996";
        nim = 201;
        telp = "0818764213";
        jurusan = "Informatika";
        judulTesis = "A -> B";

        tempListMataKuliah = new ArrayList<>();

        // MAHASISWA 2
        nama = "Bunga";
        alamat = "Jalan B";
        TTL = "Bdg, 15 Mar 1996";
        nim = 201;
        telp = "081794213";
        jurusan = "Informatika";
        judulTesis = "B -> C";

        tempListMataKuliah = new ArrayList<>();

        // MAHASISWA 3
        nama = "Chad";
        alamat = "Jalan C";
        TTL = "Bdg, 24 Sept 1996";
        nim = 203;
        telp = "081465132";
        jurusan = "Informatika";
        judulTesis = "C -> D";

        tempListMataKuliah = new ArrayList<>();

        // MAHASISWA 4
        nama = "Diana";
        alamat = "Jalan D";
        TTL = "Bdg, 7 Juli 1996";
        nim = 204;
        telp = "081174210";
        jurusan = "Informatika";
        judulTesis = "D -> E";

        tempListMataKuliah = new ArrayList<>();

    }

    private void initArrListMhsDoktor() {
        // MAHASISWA 1
        nama = "Amina";
        alamat = "Jalan A";
        TTL = "Bdg, 10 Apr 1990";
        nim = 301;
        telp = "081675134";
        jurusan = "Informatika";
        judulDisertasi = "AA -> BB";

        // MAHASISWA 2
        nama = "Bob";
        alamat = "Jalan B";
        TTL = "Bdg, 8 Nov 1990";
        nim = 302;
        telp = "0817946513";
        jurusan = "Informatika";
        judulDisertasi = "BB -> CC";

    }

    public void initArrListDosenTetap() {

        ArrayList<PresensiStaff> tempPresensiStaff;
        ArrayList<MatkulAjar> tempListMataKuliahAjar;

        matkul1 = new MataKuliah("IF-101", 4, "Algoritma dan Pemrograman");
        matkul2 = new MataKuliah("KU-101", 2, "PPKN");

        nama = "Zach";
        alamat = "Jalan Z";
        TTL = "Bdg, 1 Nov 1964";
        nik = 001;
        telp = "081419764651";
        departemen = "Informatika";
        salary = 1500000;

        tempListMataKuliahAjar = new ArrayList<>();

        // algo
    }

    public void initArrListDosenHonorer() {

        ArrayList<PresensiStaff> tempPresensiStaff;
        ArrayList<MatkulAjar> tempListMataKuliahAjar;

        matkul1 = new MataKuliah("IF-201", 4, "Struktur Data");
        matkul2 = new MataKuliah("KU-201", 2, "Agama");

        nama = "Yeri";
        alamat = "Jalan Y";
        TTL = "Bdg, 12 Okt 1960";
        nik = 002;
        telp = "0819754631";
        departemen = "Informatika";
        honorPerSKS = 1000000;

        tempListMataKuliahAjar = new ArrayList<>();

    }

    public void initArrListKaryawan() {

        ArrayList<PresensiStaff> tempPresensiStaff;

        nama = "Xander";
        alamat = "Jalan X";
        TTL = "Bdg, 5 Nov 1962";
        nik = 003;
        telp = "0819462345";
        salary = 1000000;

    }

    public ArrayList<Sarjana> getArrListMhsSarjana() {
        return listMhsSarjana;
    }

    public ArrayList<Magister> getArrListMhsMagister() {
        return listMhsMagister;
    }

    public ArrayList<Doktor> getArrListMhsDoktor() {
        return listMhsDoktor;
    }

    public ArrayList<DosenTetap> getArrListDosenTetap() {
        return listDosenTetap;
    }

    public ArrayList<DosenHonorer> getArrListDosenHonorer() {
        return listDosenHonorer;
    }

    public ArrayList<Karyawan> getArrListKaryawan() {
        return listKaryawan;
    }
}
