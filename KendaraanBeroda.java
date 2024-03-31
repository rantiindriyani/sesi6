package com.alat.transportasi;

public class KendaraanBeroda extends kendaraan{
    int jml_roda;

    public KendaraanBeroda(String merk, String jenis){
        super(merk,jenis);
    }
    void setKendaraan(String merk, String jenis){
        jml_roda = 4;
        super.merk = merk;
        super.jenis = jenis;
    }
    void setMerkJenis(){

    }
}