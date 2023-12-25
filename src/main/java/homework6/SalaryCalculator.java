package homework6;

public class SalaryCalculator {
    public static void main(String[] args) {
        double gunluk = 150; // hocam burada varsayim yaptim sadece

        int calisilanGunSayisi = 27;

        if (calisilanGunSayisi <= 0) {
            System.out.println("Geçersiz çalışılan gün sayısı.");
        } else if (calisilanGunSayisi <= 25) {
            double maas = gunluk * calisilanGunSayisi;
            System.out.println(calisilanGunSayisi + " gün çalışan personelin maaşı: " + maas + " TL");
        } else {
            int ekstraGunSayisi = calisilanGunSayisi - 25;
            double prim = ekstraGunSayisi * 1000;
            double maas = gunluk * 25 + prim;
            System.out.println(calisilanGunSayisi + " gün çalışan personelin maaşı: " + maas + " TL");
        }
    }

}
