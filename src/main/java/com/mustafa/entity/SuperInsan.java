package com.mustafa.entity;

import com.mustafa.enums.ECinsiyet;
import com.mustafa.enums.EDurum;

public class SuperInsan extends Insan{
    public SuperInsan(String ad, String soyad, ECinsiyet cinsiyet, int yas) {
        super(ad, soyad, cinsiyet, yas, EDurum.HASTALANMAZ);
    }

    public SuperInsan(String ad, String soyad, ECinsiyet cinsiyet, int yas, EDurum durum) {
        super(ad, soyad, cinsiyet, yas, durum);
    }

    @Override
    public void hastalikBulas() {
        System.out.println(getClass().getSimpleName()+" "+getAd()+" hastalık bulaştırmaz.");
    } // super insan hastalık bulaştırmaz

    @Override
    public void asiYapildi() {
        // zaten hastalanmayacağı için aşı yapılmayacak bu yüzden metodu boş bırakıyorum
    }

}
