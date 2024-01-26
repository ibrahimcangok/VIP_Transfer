import java.util.Scanner;
//Inheritence(kalıtım) : extends kullandigimiz yerler kalitima giriyor.
public class Rezervasyon_Dongusu extends Araba_Rezervasyon {
    public static void dongu(){
        Scanner scanner = new Scanner(System.in);
        int aracNo = 1;//Döngünün başlaması için bi ilk değere ihtiyacımız var eğer değer vermezsek while kısmındaki "aracNo != 0" kısmı hata verecektir.
        do {
            System.out.println("Rezervasyon yapmak istiyorsaniz rezervasyon yaziniz.");
            System.out.println("Rezervasyonunuzu iptal etmek istiyorsaniz iptal yaziniz.");
            String rezervasyon = scanner.next();
            if (rezervasyon.equalsIgnoreCase("rezervasyon")) {
                /* equalsIgnoreCase karşılaştırılan metni öncelikle küçük harflere çevirir ve ardından karşılaştırma yapar.
                   Böylelikle büyük-küçük harf durumundan doğacak sorunun önüne geçilmiş olur.*/
                System.out.print("Rezervasyon yapmak istediginiz aracın numarasını seçiniz --> ");
                try {
                    aracNo = scanner.nextInt();
                    if (aracNo < 0 || aracNo > 6) {
                        System.out.println("Lütfen araç numarasını 1'le 6 arasında giriniz!!");
                        continue; /* 0 ile 6 arasında bir değer girmediğimizde program döngüyü tekrardan başlatması için Continue
                                     komutunu kullandık. Eğer kullanmasaydık program 42. satırdan devam eder.*/
                    }
                } catch (Exception e) {
                    System.out.println("Lütfen harf yerine 1'le 6 arasında sayı giriniz!!");
                    scanner.nextLine();//Buffer'ı boşaltmak için kullandık. Eğer bunu kullanmasaydık harf girdiğimizde
                    //program iki kere döngüye girecekti.
                    continue; /* Sayı yerine harf girdiğimizde programın döngüyü tekrardan başlatmasını sağlar eğer kullanmazsak
                                 42.satırdan devam eder.*/
                }
                System.out.print("Rezervasyon yapmak istediginiz günü seçiniz --> ");
                try {
                    String gun = scanner.next();
                    if (gun.equalsIgnoreCase("pazartesi") || gun.equalsIgnoreCase("salı") || gun.equalsIgnoreCase("çarşamba") || gun.equalsIgnoreCase("perşembe") || gun.equalsIgnoreCase("cuma") || gun.equalsIgnoreCase("cumartesi") || gun.equalsIgnoreCase("pazar")) {
                        reservation(gun, aracNo); //Araba_Rezervasyon class'ındaki reservation methodunu kullandık.
                        System.out.println("Toplam fiyati --> " + getToplamFiyat()); //Araba_Rezervasyon class'ındaki getToplamFiyat() methodunu çektik.
                        System.out.println("Baska araç rezervasyonu yapmak istiyorsaniz herhangi bir sayıya basınız!!");
                        System.out.println("Programi bitirmek istiyorsaniz 0'ı giriniz.");
                        aracNo = scanner.nextInt();
                    } else {
                        System.out.println("Lütfen düzgün harf veya sayı girişi yapınız!!");
                    }
                } catch (Exception x) {
                    System.out.println("Lütfen düzgün harf veya sayı girişi yapınız!!");
                    scanner.nextLine();
                }
            } else if (rezervasyon.equalsIgnoreCase("iptal")) {
                System.out.print("Iptal etmek istediginiz araç numarasını giriniz --> ");
                int aracNoIptal;
                try {
                    aracNoIptal = scanner.nextInt();
                    if (aracNoIptal < 0 || aracNoIptal > 6) {
                        System.out.println("Lütfen araç numarasını 1'le 6 arasında giriniz!!");
                        continue; //0 ile 6 arasında bir değer girmediğimizde program döngüyü tekrardan başlatması için Continue
                        //komutunu kullandık. Eğer kullanmasaydık program 61. satırdan devam eder.
                    }
                } catch (Exception e) {
                    System.out.println("Lütfen harf girişi yapınız!!");
                    scanner.nextLine();//Buffer'ı boşaltmak için kullandık. Eğer bunu kullanmasaydık harf girdiğimizde
                    //program iki kere döngüye girecekti.
                    continue; //Sayı yerine harf girdiğimizde programın döngüyü tekrardan başlatmasını sağlar eğer kullanmazsak
                    //61.satırdan devam eder.
                }
                System.out.print("Iptal etmek istediginiz günü giriniz --> ");
                try {
                    String iptalGun = scanner.next();
                    if (iptalGun.equalsIgnoreCase("pazartesi") || iptalGun.equalsIgnoreCase("salı") || iptalGun.equalsIgnoreCase("çarşamba") || iptalGun.equalsIgnoreCase("perşembe") || iptalGun.equalsIgnoreCase("cuma") || iptalGun.equalsIgnoreCase("cumartesi") || iptalGun.equalsIgnoreCase("pazar")) {
                        rezervasyonIptal(iptalGun, aracNoIptal); //Araba_Rezervasyon class'ındaki reservation methodunu kullandık.
                        System.out.println("Toplam fiyati --> " + getToplamFiyat()); //Araba_Rezervasyon class'ındaki getToplamFiyat() methodunu çektik.
                        System.out.println("Baska araç rezervasyonu yapmak istiyorsaniz herhangi bir sayıya basınız!!");
                        System.out.println("Programi bitirmek istiyorsaniz 0'ı giriniz.");
                        aracNo = scanner.nextInt();
                        scanner.nextLine();
                    } else {
                        System.out.println("Lütfen düzgün harf veya sayı girişi yapınız!!");
                    }
                } catch (Exception x) {
                    System.out.println("Lütfen sayı girişi yapınız!!");
                    scanner.nextLine();
                }
            } else {
                System.out.println("Lütfen istenilen ögelere göre giriş yapınız.");
            }
        } while (aracNo != 0);
        {
            System.out.println("Islem tamamlandı! İyi gezmeler. :) ");
            System.out.println("Odenecek tutar: " + getToplamFiyat());
        }
    }
}