package com.mbanking.mbankingceria.Model;

import javafx.fxml.FXML;

public class AkunCeria extends Akun{

    public AkunCeria(String namaNasabah, String NIK, String tglLahir, String domisili, String noHP){
        super(namaNasabah, NIK, tglLahir, domisili, noHP);
    }

    @Override
    public void transfer(String tujuan, long nominal) {
        if (getSaldo() > nominal) {
            setSaldo(getSaldo() - nominal);
        }
    }

}
