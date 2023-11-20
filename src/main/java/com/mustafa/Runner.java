package com.mustafa;

import com.mustafa.entity.*;
import com.mustafa.enums.ECinsiyet;
import com.mustafa.enums.EDurum;

public class Runner {
    public static void main(String[] args) {

        Insan insan1 = new NormalInsan("Ali","Can", ECinsiyet.ERKEK,40, EDurum.HASTA);
        Saglik.asilamaYap(insan1);
        System.out.println(); // boşluk

        Insan insan2 = new NormalInsan("Selin","Yıldız",ECinsiyet.KADIN,50,EDurum.HASTA);
        Saglik.asilamaYap(insan2);
        System.out.println();

        //normal insan olmasına rağmen önceden aşılı olduğu için tekrar aşılanmayacak listede gözükmeyecek ancak bulaştırabilir
        Insan insan3 = new NormalInsan("Fatma","Cankan",ECinsiyet.KADIN,25,EDurum.ASILI);
        Saglik.asilamaYap(insan3);
        System.out.println();

        Insan insan4 = new SuperInsan("Ayşe","Yılmaz", ECinsiyet.KADIN,30);
        Saglik.asilamaYap(insan4); //super insan aşılanmaz, hastalık bulaştırmaz
        System.out.println();

        //başka bir constructor ile super insanın hastalanmayacağını parametre girişi ile burada da girebiliriz.
        Insan insan5 = new SuperInsan("Murat","Demir",ECinsiyet.ERKEK,70,EDurum.HASTALANMAZ);
        Saglik.asilamaYap(insan5);
        System.out.println();

        // doktor önceden aşılı olduğu için hastalığı bulaştırabilir ancak tekrar aşı yapılmayacak listeye eklenmeyecek
        Insan insan6 = new Doktor("Mustafa","Balcı",ECinsiyet.ERKEK,18);
        Saglik.asilamaYap(insan6);
        System.out.println();

        Saglik.raporAl();

    }// main sonu






}// class sonu