package com.macbook.mycompany;
public abstract class Laptop{
    protected String merk;
    protected String jenis;//darat, udara, laut

    Laptop(String merk, String jenis){
        this.merk = merk;
        this.jenis = jenis;
    }
    public Laptop(){

    }

    protected abstract void setKendaraan(String merk, String jenis);
    protected abstract void setMerkJenis();

    public String toString(){
        return "Merk : " + merk + "\n" + "Jenis : " + jenis;
    }
    public void runMenu() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'runMenu'");
    }
}