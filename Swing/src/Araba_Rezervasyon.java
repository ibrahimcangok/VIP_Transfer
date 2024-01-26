import java.util.Arrays;
import java.util.List;
public class Araba_Rezervasyon implements IAracRezervasyon {
    final String[] gunler = {"Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar"};
    private final List<String> gunlerList = Arrays.asList(gunler);
    static int toplamFiyat;
    final int normalSedanFiyat = 300, vipSedanFiyat = 450, normalMinivanFiyat = 400, vipMinivanFiyat = 600;
    @Override
    public void reservation(String gun, int aracNo) {
    }
    @Override
    public void iptal(int aracNo) {
    }
    public static int getToplamFiyat()
    {
        return toplamFiyat;
    }
    public int getNormalSedanFiyat()
    {
        return normalSedanFiyat;
    }
    public int getVipSedanFiyat()
    {
        return vipSedanFiyat;
    }
    public List<String> getGunlerList() {
        return gunlerList;
    }
    public int getNormalMinivanFiyat() {
        return normalMinivanFiyat;
    }

    public int getVipMinivanFiyat() {
        return vipMinivanFiyat;
    }

    void setVipSedanFiyat(int VipSedanFiyat)
    {
    }
    void setToplamFiyat(int toplamFiyat) {
    }
    void setNormalSedanFiyat(int NormalSedanFiyat) {
    }
    void setNormalMinivanFiyat(int NormalMinivanFiyat) {
    }
    void setVipMinivanFiyat(int VipMinivanFiyat) {
    }

    @Override
    public String toString() {
        return "Araba_Rezervasyon{" +
                "gunler=" + Arrays.toString(gunler) +
                ", gunlerList=" + gunlerList +
                ", normalSedanFiyat=" + normalSedanFiyat +
                ", vipSedanFiyat=" + vipSedanFiyat +
                ", normalMinivanFiyat=" + normalMinivanFiyat +
                ", vipMinivanFiyat=" + vipMinivanFiyat +
                '}';
    }
    static Boolean pazartesi1 = false, sali1 = false, carsamba1 = false, persembe1 = false, cuma1 = false, cumartesi1 = false, pazar1 = false;
    static Boolean pazartesi2 = false, sali2 = false, carsamba2 = false, persembe2 = false, cuma2 = false, cumartesi2 = false, pazar2 = false;
    static Boolean pazartesi3 = false, sali3 = false, carsamba3 = false, persembe3 = false, cuma3 = false, cumartesi3 = false, pazar3 = false;
    static Boolean pazartesi4 = false, sali4 = false, carsamba4 = false, persembe4 = false, cuma4 = false, cumartesi4 = false, pazar4 = false;
    static Boolean pazartesiVip1 = false, saliVip1 = false, carsambaVip1 = false, persembeVip1 = false, cumaVip1 = false, cumartesiVip1 = false, pazarVip1 = false;
    static Boolean pazartesiVip2 = false, saliVip2 = false, carsambaVip2 = false, persembeVip2 = false, cumaVip2 = false, cumartesiVip2 = false, pazarVip2 = false;

    public static void rezervasyonYap(String gun, int aracNo) {
        Araba_Rezervasyon rezervasyon = new Araba_Rezervasyon();
        if (aracNo == 1) {
            if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(0))) {
                if (pazartesi1) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!pazartesi1) {
                    pazartesi1 = true;
                    toplamFiyat += rezervasyon.getNormalSedanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(1))) {
                if (sali1) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!sali1) {
                    sali1 = true;
                    toplamFiyat += rezervasyon.getNormalSedanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(2))) {
                if (carsamba1) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!carsamba1) {
                    carsamba1 = true;
                    toplamFiyat += rezervasyon.getNormalSedanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(3))) {
                if (persembe1) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!persembe1) {
                    persembe1 = true;
                    toplamFiyat += rezervasyon.getNormalSedanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(4))) {
                if (cuma1) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!cuma1) {
                    cuma1 = true;
                    toplamFiyat += rezervasyon.getNormalSedanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(5))) {
                if (cumartesi1) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!cumartesi1) {
                    cumartesi1 = true;
                    toplamFiyat += rezervasyon.getNormalSedanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(6))) {
                if (pazar1) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!pazar1) {
                    pazar1 = true;
                    toplamFiyat += rezervasyon.getNormalSedanFiyat();
                }
            }
        }
        if (aracNo == 2) {
            if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(0))) {
                if (pazartesi2) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!pazartesi2) {
                    pazartesi2 = true;
                    toplamFiyat += rezervasyon.getNormalSedanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(1))) {
                if (sali2) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!sali2) {
                    sali2 = true;
                    toplamFiyat += rezervasyon.getNormalSedanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(2))) {
                if (carsamba2) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!carsamba2) {
                    carsamba2 = true;
                    toplamFiyat += rezervasyon.getNormalSedanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(3))) {
                if (persembe2) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!persembe2) {
                    persembe2 = true;
                    toplamFiyat += rezervasyon.getNormalSedanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(4))) {
                if (cuma2) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!cuma2) {
                    cuma2 = true;
                    toplamFiyat += rezervasyon.getNormalSedanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(5))) {
                if (cumartesi2) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!cumartesi2) {
                    cumartesi2 = true;
                    toplamFiyat += rezervasyon.getNormalSedanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(6))) {
                if (pazar2) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!pazar2) {
                    pazar2 = true;
                    toplamFiyat += rezervasyon.getNormalSedanFiyat();
                }
            }
        }
        if (aracNo == 3) {
            if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(0))) {
                if (pazartesi3) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!pazartesi3) {
                    pazartesi3 = true;
                    toplamFiyat += rezervasyon.getNormalMinivanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(1))) {
                if (sali3) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!sali3) {
                    sali3 = true;
                    toplamFiyat += rezervasyon.getNormalMinivanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(2))) {
                if (carsamba3) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!carsamba3) {
                    carsamba3 = true;
                    toplamFiyat += rezervasyon.getNormalMinivanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(3))) {
                if (persembe3) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!persembe3) {
                    persembe3 = true;
                    toplamFiyat += rezervasyon.getNormalMinivanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(4))) {
                if (cuma3) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!cuma3) {
                    cuma3 = true;
                    toplamFiyat += rezervasyon.getNormalMinivanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(5))) {
                if (cumartesi3) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!cumartesi3) {
                    cumartesi3 = true;
                    toplamFiyat += rezervasyon.getNormalMinivanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(6))) {
                if (pazar3) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!pazar3) {
                    pazar3 = true;
                    toplamFiyat += rezervasyon.getNormalMinivanFiyat();
                }
            }
        }
        if (aracNo == 4) {
            if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(0))) {
                if (pazartesi4) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!pazartesi4) {
                    pazartesi4 = true;
                    toplamFiyat += rezervasyon.getNormalMinivanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(1))) {
                if (sali4) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!sali4) {
                    sali4 = true;
                    toplamFiyat += rezervasyon.getNormalMinivanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(2))) {
                if (carsamba4) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!carsamba4) {
                    carsamba4 = true;
                    toplamFiyat += rezervasyon.getNormalMinivanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(3))) {
                if (persembe4) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!persembe4) {
                    persembe4 = true;
                    toplamFiyat += rezervasyon.getNormalMinivanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(4))) {
                if (cuma4) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!cuma4) {
                    cuma4 = true;
                    toplamFiyat += rezervasyon.getNormalMinivanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(5))) {
                if (cumartesi4) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!cumartesi4) {
                    cumartesi4 = true;
                    toplamFiyat += rezervasyon.getNormalMinivanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(6))) {
                if (pazar4) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!pazar4) {
                    pazar4 = true;
                    toplamFiyat += rezervasyon.getNormalMinivanFiyat();
                }
            }
        }
        if (aracNo == 5) {
            if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(0))) {
                if (pazartesiVip1) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!pazartesiVip1) {
                    pazartesiVip1 = true;
                    toplamFiyat += rezervasyon.getVipSedanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(1))) {
                if (saliVip1) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!saliVip1) {
                    saliVip1 = true;
                    toplamFiyat += rezervasyon.getVipSedanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(2))) {
                if (carsambaVip1) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!carsambaVip1) {
                    carsambaVip1 = true;
                    toplamFiyat += rezervasyon.getVipSedanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(3))) {
                if (persembeVip1) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!persembeVip1) {
                    persembeVip1 = true;
                    toplamFiyat += rezervasyon.getVipSedanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(4))) {
                if (cumaVip1) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!cumaVip1) {
                    cumaVip1 = true;
                    toplamFiyat += rezervasyon.getVipSedanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(5))) {
                if (cumartesiVip1) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!cumartesiVip1) {
                    cumartesiVip1 = true;
                    toplamFiyat += rezervasyon.getVipSedanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(6))) {
                if (pazarVip1) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!pazarVip1) {
                    pazarVip1 = true;
                    toplamFiyat += rezervasyon.getVipSedanFiyat();
                }
            }
        }
        if (aracNo == 6) {
            if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(0))) {
                if (pazartesiVip2) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!pazartesiVip2) {
                    pazartesiVip2 = true;
                    toplamFiyat += rezervasyon.getVipMinivanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(1))) {
                if (saliVip2) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!saliVip2) {
                    saliVip2 = true;
                    toplamFiyat += rezervasyon.getVipMinivanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(2))) {
                if (carsambaVip2) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!carsambaVip2) {
                    carsambaVip2 = true;
                    toplamFiyat += rezervasyon.getVipMinivanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(3))) {
                if (persembeVip2) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!persembeVip2) {
                    persembeVip2 = true;
                    toplamFiyat += rezervasyon.getVipMinivanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(4))) {
                if (cumaVip2) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!cumaVip2) {
                    cumaVip2 = true;
                    toplamFiyat += rezervasyon.getVipMinivanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(5))) {
                if (cumartesiVip2) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!cumartesiVip2) {
                    cumartesiVip2 = true;
                    toplamFiyat += rezervasyon.getVipMinivanFiyat();
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(6))) {
                if (pazarVip2) {
                    System.out.println("Bugünün rezervasyonu yapılmış. Lütfen başka bir koltuga veya güne bakınız.");
                } else if (!pazarVip2) {
                    pazarVip2 = true;
                    toplamFiyat += rezervasyon.getVipMinivanFiyat();
                }
            }
        }
    }
    public static void rezervasyonIptalEt(String gun, int aracNo) {
        Araba_Rezervasyon rezervasyon = new Araba_Rezervasyon();
        if (aracNo == 1) {
            if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(0))) {
                if (pazartesi1) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    pazartesi1 = false;
                    toplamFiyat -= rezervasyon.getNormalSedanFiyat();
                } else if (!pazartesi1) {
                    System.out.println("Bugünün rezervasyonu yapılmamıs.");
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(1))) {
                if (sali1) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    sali1 = false;
                    toplamFiyat -= rezervasyon.getNormalSedanFiyat();
                } else if (!sali1) {
                    System.out.println("Bugünün rezervasyonu yapılmamıs.");
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(2))) {
                if (carsamba1) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    carsamba1 = false;
                    toplamFiyat -= rezervasyon.getNormalSedanFiyat();
                } else if (!carsamba1) {
                    System.out.println("Bugünün rezervasyonu yapılmamıs.");
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(3))) {
                if (persembe1) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    persembe1 = false;
                    toplamFiyat -= rezervasyon.getNormalSedanFiyat();
                } else if (!persembe1) {
                    System.out.println("Bugünün rezervasyonu yapılmamıs.");
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(4))) {
                if (cuma1) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    cuma1 = false;
                    toplamFiyat -= rezervasyon.getNormalSedanFiyat();
                } else if (!cuma1) {
                    System.out.println("Bugünün rezervasyonu yapılmamıs.");
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(5))) {
                if (cumartesi1) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    cumartesi1 = false;
                    toplamFiyat -= rezervasyon.getNormalSedanFiyat();
                } else if (!cumartesi1) {
                    System.out.println("Bugünün rezervasyonu yapılmamıs.");
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(6))) {
                if (pazar1) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    pazar1 = false;
                    toplamFiyat -= rezervasyon.getNormalSedanFiyat();
                } else if (!pazar1) {
                    System.out.println("Bugünün rezervasyonu yapılmamıs.");
                }
            }
        } else if (aracNo == 2) {
            if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(0))) {
                if (pazartesi2) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    pazartesi2 = false;
                    toplamFiyat -= rezervasyon.getNormalSedanFiyat();
                } else if (!pazartesi2) {
                    System.out.println("Bugünün rezervasyonu yapılmamıs.");
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(1))) {
                if (sali2) {
                    System.out.println("Rezervayonunuz iptal edildi.");
                    sali2 = false;
                    toplamFiyat -= rezervasyon.getNormalSedanFiyat();
                } else if (!sali2) {
                    System.out.println("Bugünün rezervasyonu yapılmamıs.");
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(2))) {
                if (carsamba2) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    carsamba2 = false;
                    toplamFiyat -= rezervasyon.getNormalSedanFiyat();
                } else if (!carsamba2) {
                    System.out.println("Bugünün rezervasyonu yapılmamıs.");
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(3))) {
                if (persembe2) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    persembe2 = false;
                    toplamFiyat -= rezervasyon.getNormalSedanFiyat();
                } else if (!persembe2) {
                    System.out.println("Bugünün rezervasyonu yapılmamıs.");
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(4))) {
                if (cuma2) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    cuma2 = false;
                    toplamFiyat -= rezervasyon.getNormalSedanFiyat();
                } else if (!cuma2) {
                    System.out.println("Bugünün rezervasyonu yapılmamıs.");
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(5))) {
                if (cumartesi2) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    cumartesi2 = false;
                    toplamFiyat -= rezervasyon.getNormalSedanFiyat();
                } else if (!cumartesi2) {
                    System.out.println("Bugünün rezervasyonu yapılmamıs.");
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(6))) {
                if (pazar2) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    pazar2 = false;
                    toplamFiyat -= rezervasyon.getNormalSedanFiyat();
                } else if (!pazar2) {
                    System.out.println("Bugünün rezervasyonu yapılmamıs.");
                }
            }
        } else if (aracNo == 3) {
            if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(0))) {
                if (pazartesi3) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    pazartesi3 = false;
                    toplamFiyat -= rezervasyon.getNormalMinivanFiyat();
                } else if (!pazartesi3) {
                    System.out.println("Bugünün rezervasyonu yapılmamıs.");
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(1))) {
                if (sali3) {
                    System.out.println("Rezervayonunuz iptal edildi.");
                    sali3 = false;
                    toplamFiyat -= rezervasyon.getNormalMinivanFiyat();
                } else if (!sali3) {
                    System.out.println("Bugünün rezervasyonu yapılmamıs.");
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(2))) {
                if (carsamba3) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    carsamba3 = false;
                    toplamFiyat -= rezervasyon.getNormalMinivanFiyat();
                } else if (!carsamba3) {
                    System.out.println("Bugünün rezervasyonu yapılmamıs.");
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(3))) {
                if (persembe3) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    persembe3 = false;
                    toplamFiyat -= rezervasyon.getNormalMinivanFiyat();
                } else if (!persembe3) {
                    System.out.println("Bugünün rezervasyonu yapılmamıs.");
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(4))) {
                if (cuma3) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    cuma3 = false;
                    toplamFiyat -= rezervasyon.getNormalMinivanFiyat();
                } else if (!cuma3) {
                    System.out.println("Bugünün rezervasyonu yapılmamıs.");
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(5))) {
                if (cumartesi3) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    cumartesi3 = false;
                    toplamFiyat -= rezervasyon.getNormalMinivanFiyat();
                } else if (!cumartesi3) {
                    System.out.println("Bugünün rezervasyonu yapılmamıs.");
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(6))) {
                if (pazar3) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    pazar3 = false;
                    toplamFiyat -= rezervasyon.getNormalMinivanFiyat();
                } else if (!pazar3) {
                    System.out.println("Bugünün rezervasyonu yapılmamıs.");
                }
            }
        } else if (aracNo == 4) {
            if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(0))) {
                if (pazartesi4) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    pazartesi4 = false;
                    toplamFiyat -= rezervasyon.getNormalMinivanFiyat();
                } else if (!pazartesi4) {
                    System.out.println("Bugünün rezervasyonu yapılmamıs.");
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(1))) {
                if (sali4) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    sali4 = false;
                    toplamFiyat -= rezervasyon.getNormalMinivanFiyat();
                } else if (!sali4) {
                    System.out.println("Bugünün rezervasyonu yapılmamıs.");
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(2))) {
                if (carsamba4) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    carsamba4 = false;
                    toplamFiyat -= rezervasyon.getNormalMinivanFiyat();
                } else if (!carsamba4) {
                    System.out.println("Bugünün rezervasyonu yapılmamıs.");
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(3))) {
                if (persembe4) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    persembe4 = false;
                    toplamFiyat -= rezervasyon.getNormalMinivanFiyat();
                } else if (!persembe4) {
                    System.out.println("Bugünün rezervasyonu yapılmamıs.");
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(4))) {
                if (cuma4) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    cuma4 = false;
                    toplamFiyat -= rezervasyon.getNormalMinivanFiyat();
                } else if (!cuma4) {
                    System.out.println("Bugünün rezervasyonu yapılmamıs.");
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(5))) {
                if (cumartesi4) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    cumartesi4 = false;
                    toplamFiyat -= rezervasyon.getNormalMinivanFiyat();
                } else if (!cumartesi4) {
                    System.out.println("Bugünün rezervasyonu yapılmamıs.");
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(6))) {
                if (pazar4) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    pazar4 = false;
                    toplamFiyat -= rezervasyon.getNormalMinivanFiyat();
                } else if (!pazar4) {
                    System.out.println("Bugünün rezervasyonu yapılmamıs.");
                }
            }
        } else if (aracNo == 5) {
            if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(0))) {
                if (pazartesiVip1) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    pazartesiVip1 = false;
                    toplamFiyat -= rezervasyon.getVipSedanFiyat();
                } else if (!pazartesiVip1) {
                    System.out.println("Bugünün rezervasyonu yapılmamıs.");
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(1))) {
                if (saliVip1) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    saliVip1 = false;
                    toplamFiyat -= rezervasyon.getVipSedanFiyat();
                } else if (!saliVip1) {
                    System.out.println("Bugünün rezervasyonu yapılmamıs.");
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(2))) {
                if (carsambaVip1) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    carsambaVip1 = false;
                    toplamFiyat -= rezervasyon.getVipSedanFiyat();
                } else if (!carsambaVip1) {
                    System.out.println("Bugünün rezervasyonu yapılmamıs.");
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(3))) {
                if (persembeVip1) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    persembeVip1 = false;
                    toplamFiyat -= rezervasyon.getVipSedanFiyat();
                } else if (!persembeVip1) {
                    System.out.println("Bugünün rezervasyonu yapılmamıs.");
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(4))) {
                if (cumaVip1) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    cumaVip1 = false;
                    toplamFiyat -= rezervasyon.getVipSedanFiyat();
                } else if (!cumaVip1) {
                    System.out.println("Bugünün rezervasyonu yapılmamıs.");
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(5))) {
                if (cumartesiVip1) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    cumartesiVip1 = false;
                    toplamFiyat -= rezervasyon.getVipSedanFiyat();
                } else if (!cumartesiVip1) {
                    System.out.println("Bugünün rezervasyonu yapılmamıs.");
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(6))) {
                if (pazarVip1) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    pazarVip1 = false;
                    toplamFiyat -= rezervasyon.getVipSedanFiyat();
                } else if (!pazarVip1) {
                    System.out.println("Bugünün rezervasyonu yapılmamıs.");
                }
            }
        } else if (aracNo == 6) {
            if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(0))) {
                if (pazartesiVip2) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    pazartesiVip2 = false;
                    toplamFiyat -= rezervasyon.getVipMinivanFiyat();
                } else if (!pazartesiVip2) {
                    System.out.println("Bugünün rezervasyonu yapılmamıs.");
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(1))) {
                if (saliVip2) {
                    System.out.println("Rezervayonunuz iptal edildi.");
                    saliVip2 = false;
                    toplamFiyat -= rezervasyon.getVipMinivanFiyat();
                } else if (!saliVip2) {
                    System.out.println("Bugünün rezervasyonu yapılmamıs.");
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(2))) {
                if (carsambaVip2) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    carsambaVip2 = false;
                    toplamFiyat -= rezervasyon.getVipMinivanFiyat();
                } else if (!carsambaVip2) {
                    System.out.println("Bugünün rezervasyonu yapılmamıs.");
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(3))) {
                if (persembeVip2) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    persembeVip2 = false;
                    toplamFiyat -= rezervasyon.getVipMinivanFiyat();
                } else if (!persembeVip2) {
                    System.out.println("Bugünün rezervasyonu yapılmamıs.");
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(4))) {
                if (cumaVip2) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    cumaVip2 = false;
                    toplamFiyat -= rezervasyon.getVipMinivanFiyat();
                } else if (!cumaVip2) {
                    System.out.println("Bugünün rezervasyonu yapılmamıs.");
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(5))) {
                if (cumartesiVip2) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    cumartesiVip2 = false;
                    toplamFiyat -= rezervasyon.getVipMinivanFiyat();
                } else if (!cumartesiVip2) {
                    System.out.println("Bugünün rezervasyonu yapılmamıs.");
                }
            } else if (gun.equalsIgnoreCase(rezervasyon.getGunlerList().get(6))) {
                if (pazarVip2) {
                    System.out.println("Rezervasyonunuz iptal edildi.");
                    pazarVip2 = false;
                    toplamFiyat -= rezervasyon.getVipMinivanFiyat();
                } else if (!pazarVip2) {
                    System.out.println("Bugünün rezervasyonu yapılmamıs.");
                }
            }
        }
    }
}