import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Main extends Rezervasyon_Dongusu {
    private static JFrame frame;
    private static JPanel panel;
    private static JLabel lblAracSecimi;
    private static JLabel lblGunSecimi;
    private static JTextField txtAracNo;
    private static JTextField txtGun;
    private static JButton btnRezervasyon;
    private static JButton btnIptal;
    private static JButton btnTemizle;
    private static JButton btnCikis;

    private static void ekraniGoster() {
        frame = new JFrame("VIP TASIMACILIK REZERVASYONU");
        panel = new JPanel();
        lblAracSecimi = new JLabel("Rezervasyon yapmak istediginiz aracın numarasını seçiniz:");
        lblGunSecimi = new JLabel("Rezervasyon yapmak istediginiz günü seçiniz:");
        txtAracNo = new JTextField(10);
        txtGun = new JTextField(10);
        btnRezervasyon = new JButton("Rezervasyon Yap");
        btnIptal = new JButton("Rezervasyon Iptal Et");
        btnTemizle = new JButton("Temizle");
        btnCikis = new JButton("Cikis");

        panel.setLayout(new GridLayout(4, 2));
        panel.add(lblAracSecimi);
        panel.add(txtAracNo);
        panel.add(lblGunSecimi);
        panel.add(txtGun);
        panel.add(btnRezervasyon);
        panel.add(btnIptal);
        panel.add(btnTemizle);
        panel.add(btnCikis);
        btnCikis.addActionListener(e -> System.exit(0));
        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        btnRezervasyon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String aracNoStr = txtAracNo.getText();
                String gun = txtGun.getText();

                try {
                    int aracNo = Integer.parseInt(aracNoStr);
                    if (aracNo < 1 || aracNo > 6) {
                        JOptionPane.showMessageDialog(frame, "Lütfen araç numarasını 1 ile 6 arasında giriniz!", "Hata", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    if (!Arrays.asList("pazartesi", "salı", "çarşamba", "perşembe", "cuma", "cumartesi", "pazar").contains(gun.toLowerCase())) {
                        JOptionPane.showMessageDialog(frame, "Lütfen geçerli bir gün adı giriniz!", "Hata", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    rezervasyonYap(gun.toLowerCase(), aracNo);
                    JOptionPane.showMessageDialog(frame, "Toplam fiyat: " + getToplamFiyat(), "Sonuç", JOptionPane.INFORMATION_MESSAGE);
                    txtAracNo.setText("");
                    txtGun.setText("");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Lütfen araç numarası için geçerli bir sayı giriniz!", "Hata", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnIptal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String aracNoStr = txtAracNo.getText();
                String gun = txtGun.getText();

                try {
                    int aracNo = Integer.parseInt(aracNoStr);
                    if (aracNo < 1 || aracNo > 6) {
                        JOptionPane.showMessageDialog(frame, "Lütfen araç numarasını 1 ile 6 arasında giriniz!", "Hata", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    if (!Arrays.asList("pazartesi", "salı", "çarşamba", "perşembe", "cuma", "cumartesi", "pazar").contains(gun.toLowerCase())) {
                        JOptionPane.showMessageDialog(frame, "Lütfen geçerli bir gün adı giriniz!", "Hata", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    rezervasyonIptalEt(gun.toLowerCase(), aracNo);
                    JOptionPane.showMessageDialog(frame, "Rezervasyon iptal edildi.", "Sonuç", JOptionPane.INFORMATION_MESSAGE);
                    txtAracNo.setText("");
                    txtGun.setText("");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Lütfen araç numarası için geçerli bir sayı giriniz!", "Hata", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnTemizle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtAracNo.setText("");
                txtGun.setText("");
            }
        });
    }

    public static void main(String[] args) {
        ekraniGoster();
    }
}

