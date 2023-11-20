package com.mustafa.Database;

import com.mustafa.entity.*;

public class InsanDB {
    public static Insan[] normalInsanListesi = new Insan[100];
    public static Insan[] doktorListesi = new Insan[100];
    public static Insan[] superInsanListesi = new Insan[100];
    public static Insan[] asilamaListesi = new Insan[5]; // array boyutu daha sonradan ekleme işleminde arrıtılmak istenmiştir

    public static int normalInsanSayisi ; // başlangıç değeri zaten 0 (sıfırdır).program ayağa kalktığında 0 olarak başlar
    public static int doktorSayisi ; // sıfırı değişkene atayabiliriz de.
    public static int superInsanSayisi = 0;
    public static int asilamaSayisi = 0;

    /**
     * Array boyut kontrol yapan method eğer array boyutu maxa ulaşmış ise
     * boyutu 10 ar 10 ar arttırır
     */
    public static void arrayBoyutKontrol() {
        if (asilamaSayisi == asilamaListesi.length) {
            Insan[] asilamaListesi1 = new Insan[asilamaListesi.length + 10];
            for (int i = 0; i < asilamaListesi.length; i++) {
                asilamaListesi1[i] = asilamaListesi[i];
            }
            asilamaListesi = asilamaListesi1;
        }

    }




}
