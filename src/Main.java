//Bütün kodları Main'de, Araba_Rezervasyon'u classında ve Rezervasyon_Dongusu classında yazdığımız için ve
//daha fazla alt sınıflar kullanmadığımız için Interface(arayüze) ihtiyaç duymadık.

public class Main extends Rezervasyon_Dongusu{
    //Inheritence(kalıtım) : extends kullandigimiz yerler kalitima giriyor.
    //Inheritence(kalıtım)-(extends)
    //Araba_Rezervasyon'unun classı maini extends ederek kodları kullanıyoruz.

    //main fonksiyonu her yerde çalışması için static olması gerekiyor.
    public static void main(String[] args) {

        ekraniGoster(); //fonksiyonu Abstraction'dır
        //reservasyonDongusu(); //Abstraction : main fonksiyonda bir fonksiyon oluşturarak ve iyi bir isim takarak kodu kolaylastiriyoruz.
                              //kod kısmını göstermeden kullanıcıya içinde neler olduğunu gösteriyoruz.
        dongu();//inherit
    }
    public static void ekraniGoster() {
        System.out.println("VIP TASIMACILIK REZERVASYONUNA HOS GELDINIZ");
        System.out.println("Sedan ve Minivan olmak üzere iki çeşit aracımız vardır. Araçlarımız ise VIP ve Normal olmak uzere ikiye ayrılır.");
        System.out.println("Normal Sedan aracımızdan istiyorsaniz 1 veya 2 numarali araçlardan birini seçip ardından gününü seciniz.");
        System.out.println("Normal Minivan aracımızdan istiyorsaniz 3 veya 4 numarali araçlardan birini secip ardından gününü seciniz.");
        System.out.println("VIP Sedan aracımızdan istiyorsaniz 5 numarali aracı secip ardından gününü seciniz.");
        System.out.println("VIP Minivan aracımızdan istiyorsaniz 6 numarali aracı secip ardından gününü seciniz.");
        System.out.println("----------------------------------------------------------------------------------------");
    }
}