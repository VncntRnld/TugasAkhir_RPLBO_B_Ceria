package com.mbanking.mbankingceria;

public class Akun {
    private String namaNasabah;
    private String NIK;
    private String tglLahir;
    private String domisili;
    private String noHP;
    private String username;
    private String password;
    private String PIN;

    public Akun(String namaNasabah, String NIK, String tglLahir, String domisili, String noHP) {
        this.namaNasabah = namaNasabah;
        this.NIK = NIK;
        this.tglLahir = tglLahir;
        this.domisili = domisili;
        this.noHP = noHP;
    }

    public String getNamaNasabah() {
        return namaNasabah;
    }

    public void setNamaNasabah(String namaNasabah) {
        this.namaNasabah = namaNasabah;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getDomisili() {
        return domisili;
    }

    public void setDomisili(String domisili) {
        this.domisili = domisili;
    }

    public String getNoHP() {
        return noHP;
    }

    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPIN() {
        return PIN;
    }

    public void setPIN(String PIN) {
        this.PIN = PIN;
    }
}
