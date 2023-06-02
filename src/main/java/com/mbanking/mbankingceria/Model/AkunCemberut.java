package com.mbanking.mbankingceria.Model;

public class AkunCemberut extends Akun{
    public AkunCemberut(String namaNasabah, String NIK, String tglLahir, String domisili, String noHP){
        super(namaNasabah, NIK, tglLahir, domisili, noHP);
    }

    @Override
    public void transfer(String tujuan, long nominal) {

    }



}
