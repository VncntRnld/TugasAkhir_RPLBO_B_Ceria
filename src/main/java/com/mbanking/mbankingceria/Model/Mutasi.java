package com.mbanking.mbankingceria.Model;

import java.util.Date;

public class Mutasi {

    private String tanggal;
    private String ket;
    private long nominal;
    private long Saldo;

    public Mutasi(String tanggal, String ket, long nominal, long Saldo) {
        this.tanggal = tanggal;
        this.ket = ket;
        this.nominal = nominal;
        this.Saldo = Saldo;
    }

    public String getKet() {
        return ket;
    }

    public String getTanggal() {
        return tanggal;
    }

    public long getNominal() {
        return nominal;
    }

    public long getSaldo() {
        return Saldo;
    }

}
