/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Arvin Situmorang
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
import controller.*;
import model.*;

/**
 *
 * @author Felicia
 */
public class MainScreen {

    public MainScreen() {

        Controller c = new Controller();
        Variables i = new view.Variables();

        String namaInput;
        int NIMinput;
        String kodeMKinput;
        int NIKinput;

        JOptionPane.showMessageDialog(null, "Selamat datang di Sistem Informasi Akademik ITHB!", "SISTEM INFORMASI AKADEMIK", JOptionPane.INFORMATION_MESSAGE);
        int menuUtama = 0;
        int menuAdmin = 0;
        int menuMhs = 0;

        while (menuUtama != 3) {
            menuUtama = Integer.parseInt(JOptionPane.showInputDialog(Constants.MAIN_MENU_MSG));

            switch (menuUtama) {
                case 1:
                    while (menuAdmin != 8) {
                        menuAdmin = Integer.parseInt(JOptionPane.showInputDialog(Constants.ADMIN_MENU_MSG));

                        switch (menuAdmin) {
                            case 1: //Print Data User
                                namaInput = i.nama();
                                c.printUserData(namaInput);

                                break;
                            case 2: // Print Nilai Akhir (NA) Mahasiswa
                                NIMinput = i.NIM();
                                kodeMKinput = i.KodeMK();

                                c.printNilaiAkhir(NIMinput, kodeMKinput);

                                break;
                            case 3:// Print Rata" Nilai Akhir (NR) Seluruh Mhs Per Matkul
                                kodeMKinput = i.KodeMK();
                                c.printRataNilaiAkhir(kodeMKinput);

                                break;
                            case 4: // Print Byk Mhs Tdk Lulus Per Matkul
                                kodeMKinput = i.KodeMK();
                                c.printJumlahMhsTidakLulus(kodeMKinput);

                                break;
                            case 5: // Print Matkul Ambil dan Presensi Mhs
                                NIMinput = i.NIM();
                                c.printMatkulAmbilDanPresensiMhs(NIMinput);

                                break;
                            case 6: // Print Total Jam Mengajar Dosen
                                NIKinput = i.NIK();
                                c.printTotalJamMengajarDosen(NIKinput);

                                break;
                            case 7: // Print Gaji Staff
                                NIKinput = i.NIK();
                                c.printGajiStaff(NIKinput);

                                break;
                            case 8: // Back to Main Menu
                                JOptionPane.showMessageDialog(null, "Back to Main Menu!", "SISTEM INFORMASI AKADEMIK", JOptionPane.INFORMATION_MESSAGE);
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, "Wrong Input!");
                                break;
                        }
                    }
                    menuAdmin = 0;
                    break;

                case 2:
                    while (menuMhs != 3) {
                        menuMhs = Integer.parseInt(JOptionPane.showInputDialog(Constants.MAHASISWA_MENU_MSG));

                        switch (menuMhs) {
                            case 1: //Print Nilai Akhir (NA) Mahasiswa
                                NIMinput = i.NIK();
                                kodeMKinput = i.KodeMK();

                                c.printNilaiAkhir(NIMinput, kodeMKinput);

                                break;
                            case 2: //Print Matkul Ambil dan Presensi Mahasiswa
                                NIMinput = i.NIM();
                                c.printMatkulAmbilDanPresensiMhs(NIMinput);

                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null, "Back to Main Menu!", "SISTEM INFORMASI AKADEMIK", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Wrong Input!");
                                break;
                        }
                    }
                    menuMhs = 0;
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "Terima kasih sudah menggunakan SIA ITHB! \nExit Program SIA ITHB!", "SISTEM INFORMASI AKADEMIK", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Wrong Input!");
                    break;
            }

        }

    }

}
