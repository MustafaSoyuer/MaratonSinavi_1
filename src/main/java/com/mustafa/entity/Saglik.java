package com.mustafa.entity;

import com.mustafa.Database.InsanDB;
import com.mustafa.repository.IHastalik;

public class Saglik {
    public static void asilamaYap(Insan insan) {
        InsanDB.arrayBoyutKontrol(); // array boyutu kontrol edildi

        if (insan instanceof IHastalik) { // insan değişkeni IHastalık interfaceini implement etmiş mi diye bakıyoruz
            IHastalik hastalik = (IHastalik) insan; //cast işlemi
            hastalik.hastalikBulas(); // bu metod ile hastalık bulaştırıyoruz
            if (insan.hastalikVarMi()) { // hastalik var ise

                    insan.asiYapildi();

                insan.setHastalikVar(false); // Hastalığı temizle set ile hastalık yoktur yapıyoruz
                InsanDB.asilamaListesi[InsanDB.asilamaSayisi++] = insan; // girilen insan değişkenini asılamalistesi arrayine ekliyoruz
                                                                         // aşılanan sayısını arttırıyoruz
                System.out.println(insan.getAd() + " aşılandı!"); // çıktı veriyoruz
            } else {
                System.out.println(insan.getAd() + " zaten hasta değil, aşı yapılmadı!");
            }
        }

    }
    public static void raporAl() {
        System.out.println("Aşılanan insanlar Listesi:");
        for (int i = 0; i < InsanDB.asilamaSayisi; i++) {
            System.out.println(InsanDB.asilamaListesi[i].toString());
        }
    }







}
