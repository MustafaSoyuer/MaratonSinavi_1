package com.mustafa.entity;

import com.mustafa.enums.ECinsiyet;
import com.mustafa.enums.EDurum;

public class Doktor extends Insan{

    public Doktor(String ad, String soyad, ECinsiyet cinsiyet, int yas) {
        super(ad, soyad, cinsiyet, yas, EDurum.ASILI); // doktor zaten aşılı olduğu için durum burada belirtilebilir
    }

    @Override
    public void hastalikBulas() {
        System.out.println(getClass().getSimpleName()+" "+getAd()+" hastalığı bulaştırdı.");
        setHastalikVar(false); // hastalığı bulaştırabilir ancak aşılı olduğu için hasta olamaz
    }

    @Override
    public void asiYapildi() {
        //önceden aşılı tekrar aşı yapılmasına gerek yok
    }
}
