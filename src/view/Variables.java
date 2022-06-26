/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author Arvin Situmorang
 */
public class Variables {

    String nama() {
        return JOptionPane.showInputDialog("Input nama user: ");
    }

    int NIK() {
        return Integer.parseInt(JOptionPane.showInputDialog("Input NIK: "));
    }

    int NIM() {
        return Integer.parseInt(JOptionPane.showInputDialog("Input NIM: "));
    }

    String KodeMK() {
        return JOptionPane.showInputDialog("Input Kode MK: ");
    }
}
