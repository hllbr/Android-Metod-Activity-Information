package com.hllbr.methodsandactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("on create called");
    }
    /*
    Method , Sınıf ...

    Sınıf bizim yaşam döngümüzdeki en büyük parçamız

    Methodlar küçük parçalar.

    Biz birçok methodu birleştirerek sınıfı meydana getiriyoruz

    Biz sınıfı kullanarak activite içerisinde bazı işlemleri yapıyoruz

    bir projede birden fazla activite olabilir.Birden fazla Sınıf olabilir.Herbir sınıfın içerisinde birden fazal method olabilir.

    Oncreate bizim için activite ilk oluşturulduğunda ortaya çıkan bir metod.Bu hazır bir metoddur.

    bu yapının üzerinde --üzerine yazmak--- anlamına gelen override ifadesi bulunur biz bu yapının içerisine eklemeler tanımlamalar yada işlemler yazdığımızda override işlemini gerçekleştirmiş oluyoruz.

    Programlama Dillerinde sadece Oncreate yok Python dilinde de Def adlı javadaki constructor ifadesine benzer mantıkla çalışan bir yapı var

    Java içerisinde de hazır metodlar bulunmaktadır.Diğer dillerde de olduğu gibi

    Oncreate'e benzeyen metodlara activite yaşam döngüsü içerisindeki metodlar olarak ifade edilmektedirler.

    OnCreate = açıldı,OnStart = başlatıldı,onResume = Devam etti ,OnPause = Durduruldu(Geçici durdurma işlemi kast edilmiştir.)

    OnStop = Activite görünür durumdan çıkarıldığında olacak işlemler.

    OnDestroy = Activitenin bir şekilde tamamen bir şekilde kapatıldığı durum(App kapatılma durumu)

    Bu yapılarda bize Android Studyonun hazır sunduğu yapılardır.



     */
    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {//HAZIR METOD
        super.onResume();

        System.out.println("on resume called");

        //Kullanıcı görmeden çağrıulacağı yaşam döngüsü içerisinde ifade edildiği için bu yapınında on create ile birlikte çağrıldığını biliyoruz

    }

    @Override
    protected void onPause() {
        super.onPause();

        System.out.println("on pause called");
        //on pause ve on stop birbirini tetikleyen yapılar .Bu yapılar devreye girdikten sonra uygulamaya tekrara girilirse on resume activ duruma geçer
        //on create ise sadece bir kez uygulamaya tıklandığı anda uygulama yaratılma aşamasına çalışan bir blok
        
    }

    @Override
    protected void onStop() {
        super.onStop();

        System.out.println("on stop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
    /*
    Yukarıda mevcut halde bulunan yapıarl içerisine bu durumlar gerçekleştiği taktirde neler yapılamsını istediğimi ifade ederek işlemlerimi gerçekleştirebiliyorum.

     */
}