package com.mustafa.entity;

import com.mustafa.enums.ECinsiyet;
import com.mustafa.enums.EDurum;
import com.mustafa.repository.IHastalik;

import java.util.UUID;

public abstract class Insan implements IHastalik {
    private String id;
    private String ad;
    private String soyad;
    private ECinsiyet cinsiyet;
    private int yas;
    private EDurum durum;
    private boolean hastalikVar;

    /**
     * ad,soyad,cinsiyet,yas,durum parametrelerinin girildiği Insan sınıfının constructurı
     * @param ad
     * @param soyad
     * @param cinsiyet
     * @param yas
     * @param durum
     */
    public Insan(String ad, String soyad, ECinsiyet cinsiyet, int yas, EDurum durum) {
        this.id = UUID.randomUUID().toString();
        this.ad = ad;
        this.soyad = soyad;
        this.cinsiyet = cinsiyet;
        this.yas = yas;
        this.durum = durum;;

    }

    @Override
    public void hastalikBulas() {

    }

    /**
     * abstract metod ile bu metodu diğer alt sınıflarda zorunlu hale getiriyorum
     */
    public abstract void asiYapildi();


    public boolean hastalikVarMi(){
        return hastalikVar;
    }


    @Override
    public String toString() {
        return "Insan{" +
                "id='" + id + '\'' +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", cinsiyet=" + cinsiyet +
                ", yas=" + yas +
                ", durum=" + durum +
                ", hastalikVar=" + hastalikVar +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public ECinsiyet getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(ECinsiyet cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public EDurum getDurum() {
        return durum;
    }

    public void setDurum(EDurum durum) {
        this.durum = durum;
    }

    public boolean isHastalikVar() {
        return hastalikVar;
    }

    public void setHastalikVar(boolean hastalikVar) {
        this.hastalikVar = hastalikVar;
    }
}
