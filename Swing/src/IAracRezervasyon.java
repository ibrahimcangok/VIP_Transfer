import java.util.List;
public interface IAracRezervasyon {
    void reservation(String gun, int aracNo);
    void iptal(int aracNo);
    static int getToplamFiyat() {
        return 0;
    }
    int getNormalSedanFiyat();
    int getVipSedanFiyat();
    List<String> getGunlerList();
    int getNormalMinivanFiyat();
    int getVipMinivanFiyat();
}