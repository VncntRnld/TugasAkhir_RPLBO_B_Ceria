package com.mbanking.mbankingceria.Model;

import java.util.*;

public abstract class Akun {
    private String namaNasabah;
    private String NIK;
    private String tglLahir;
    private String domisili;
    private String noHP;
    private String username;
    private String password;
    private String PIN;

    // rekening
    private String noRek;
    private long saldo;
    private long limit;

    public Akun(String namaNasabah, String NIK, String tglLahir, String domisili, String noHP) {
        this.namaNasabah = namaNasabah;
        this.NIK = NIK;
        this.tglLahir = tglLahir;
        this.domisili = domisili;
        this.noHP = noHP;
        //rekening
        this.noRek = setNoRek();
        this.saldo = 1_000_000;
        this.limit = 5_000_000;
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
    public String getTglLahir() {
        return tglLahir;
    }
    public String getDomisili() {
        return domisili;
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

    private String setNoRek(){
        int m = (int) Math.pow(10, 8 - 1);
        m = m + new Random().nextInt(9 * m);
        return String.valueOf(m);
    }

    public void setNoRek(String noRek) {
        // Buat Test..
        this.noRek = noRek;
    }

    public String getNoRek() {
        return noRek;
    }
    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }
    public long getSaldo() {
        return saldo;
    }
    public long getLimit() { return limit; }
    public void setLimit(long limit) { this.limit = limit; }

    // buat di Override
    public abstract void transfer(String tujuan, long nominal);


    // Data lain 😵‍💫
    private ArrayList<String> listFavorit = new ArrayList<>();
    private Map<String, String> dataFavorit = new HashMap<>();

    // Transfer 💩
    public void addFavorit(String name, String noRek) {
        listFavorit.add(name);
        dataFavorit.put(name, noRek);
    }

    // Ambil no rekening pada daftar favorit 🙈
    public String getAkunFavorit(String nama) {
        return dataFavorit.get(nama);
    }

    // Buat dipake di choiceBox 😌
    public String[] getFavorit() {
        //langsung jadiin array dulu
        return listFavorit.toArray(new String[listFavorit.size()]);
    }
}
