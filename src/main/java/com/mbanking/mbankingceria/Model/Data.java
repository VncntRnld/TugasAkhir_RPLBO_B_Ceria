package com.mbanking.mbankingceria.Model;

public class Data {

    AkunData akunData = new AkunData();

    // ANGGEP AJA SESSION / COOKIES :v
    public static String scene;
    public static AkunCeria akun;

    // LIMIT
    public static long newLimit;

    // TRANSFER
    public static String noRekTujuan;
    public static long tfNominal;
    public static String tfBerita = "";
    public Akun getAkunTujuan() {
        return akunData.getTujuan(noRekTujuan);
    }


    //INTERNET
    public static String internetID;
    public static String internetNama;
    public static String internetNoTelp;
    public static long internetNominal;

    //LISTRIK
    public static String listrikID;
    public static String listrikNama;
    public static long listrikNominal;

}
