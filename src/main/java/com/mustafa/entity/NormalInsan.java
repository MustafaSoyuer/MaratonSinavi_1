package com.mustafa.entity;

import com.mustafa.enums.ECinsiyet;
import com.mustafa.enums.EDurum;

public class NormalInsan extends Insan {


    public NormalInsan(String ad, String soyad, ECinsiyet cinsiyet, int yas, EDurum durum) {
        super(ad, soyad, cinsiyet, yas, durum);
    }

    @Override
    public void hastalikBulas() {
        System.out.println(getClass().getSimpleName()+" "+getAd()+" hastalığı bulaştırdı.");
        if(getDurum()==EDurum.HASTA) { // daha önceden aşılı olma durumunda normal insan tekrar aşılanmayacak
            setHastalikVar(true);
        }else setHastalikVar(false);
    }

    @Override
    public void asiYapildi() {
        setDurum(EDurum.ASILI);
    }
}


