package com.transportasi.bermotor;

import javax.swing.*;
import com.alat.transportasi.KendaraanBeroda;

public class KendaraanBermotor {
    public static void main(String[] args) {
        
     String merk = JOptionPane.showInputDialog("Isikan Merk Kendaraan");
     String jenis = JOptionPane.showInputDialog("Isikan Jenis Kendaraan");
        
     KendaraanBeroda k = new KendaraanBeroda(merk,jenis);
        
     System.out.println(k);
    }
}