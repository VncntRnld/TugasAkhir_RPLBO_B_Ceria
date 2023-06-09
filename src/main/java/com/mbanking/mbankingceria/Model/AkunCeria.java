package com.mbanking.mbankingceria.Model;

import javafx.fxml.FXML;

public class AkunCeria extends Akun{

    public AkunCeria(String namaNasabah, String NIK, String tglLahir, String domisili, String noHP){
        super(namaNasabah, NIK, tglLahir, domisili, noHP);
    }

    @Override
    public void transfer(String tujuan, long nominal) {
        AkunData akunData = new AkunData();
        Akun akunTujuan = akunData.getTujuan(tujuan);

        if (getSaldo() > nominal) {
            if (akunTujuan instanceof AkunCeria){
                setSaldo(getSaldo()-nominal);
            }
            else {
                setSaldo(getSaldo()-nominal-2500);
            }
            akunTujuan.setSaldo(akunTujuan.getSaldo()+nominal);
        }
    }

}
