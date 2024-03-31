package com.alat.transportasi;
public abstract class kendaraan{
    String merk;
    String jenis;//darat, udara, laut

    kendaraan(String merk, String jenis){
        this.merk = merk;
        this.jenis = jenis;
    }
    public kendaraan(){

    }

    abstract void setKendaraan(String merk, String jenis);
    abstract void setMerkJenis();

    public String toString(){
        return "Merk : " + merk + "\n" + "Jenis : " + jenis;
    }
}