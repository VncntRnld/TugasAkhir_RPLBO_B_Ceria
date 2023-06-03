package com.mbanking.mbankingceria.Model;

import java.util.HashMap;
import java.util.Map;

public class AkunData {
    private static Map<String, Akun> akunMap = new HashMap<>();
    private static Map<String, String> noRekMap = new HashMap<>();

    public AkunData(){
    }

    // Pengoprasian data
    public void addAkun(Akun akun) {
        akunMap.put(akun.getUsername(), akun);
        noRekMap.put(akun.getNoRek(), akun.getUsername());
    }

    public Akun getAkun(String username) {
        return akunMap.get(username);
    }

    public void deleteAkun(String username) {
        akunMap.remove(username);
    }


    // Verifikasi & Validasi
    public Boolean verifyAkun(String username, String password){
        Akun verifAkun = getAkun(username);
        return verifAkun != null && verifAkun.getPassword().equals(password);
    }

    public Boolean verifyPIN(String pin){
        return getAkun(Data.akun.getPIN()).equals(pin);
    }

    public Boolean verifyUsername(String username) {
        return getAkun(username) != null;
    }


    // Transfer Tujuan
    public Akun getTujuan(String noRek) {
        return akunMap.get(noRekMap.get(noRek));
    }
    public Boolean cekTujuan(String noRek) {
        return noRekMap.get(noRek) != null;
    }

}
