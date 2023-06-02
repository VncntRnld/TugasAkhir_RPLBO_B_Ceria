package com.mbanking.mbankingceria;

import java.util.HashMap;
import java.util.Map;

public class AkunData {
    private static Map<String, Akun> akunMap = new HashMap<>();
    public AkunData(){
    }

    public void addAkun(Akun akun) {
        akunMap.put(akun.getUsername(), akun);
    }

    public Akun getAkun(String username) {
        return akunMap.get(username);
    }

    public void deleteAkun(String username) {
        akunMap.remove(username);
    }

    public Boolean verifyAkun(String username, String password){
        Akun verifAkun = getAkun(username);
        return verifAkun != null && verifAkun.getPassword().equals(password);
    }

    public Boolean verifyPIN(String pin){
        return getAkun(Data.akun.getPIN()).equals(pin);
    }

    public Boolean verifyUsername(String username) {
        return getAkun(username) == null;
    }
}
