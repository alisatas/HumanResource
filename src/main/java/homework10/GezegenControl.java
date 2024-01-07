package homework10;

public class GezegenControl {
    public static void main(String[] args) {
        System.out.println("Güneş Sistemi Gezegenleri:");
        for (Gezegen gezegen : Gezegen.values()) {
            System.out.println("Gezegen: " + gezegen.name() +
             ", Sıra Numarası: " + gezegen.getSiraNumarasi() +
             ", Uzaklık: " + gezegen.getUzaklikAU() + " AU" +
             ", Yarıçap: " + gezegen.getYaricapKm() + " km" +
             ", Dönme Süresi: " + gezegen.getDonmeSuresiGun() + " gün");
        }
    }
}
