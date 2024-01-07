package homework10;

public class GezegenControl {
    public static void main(String[] args) {
        System.out.println("=============================================================");
        Gezegen dunya = Gezegen.EARTH;
        System.out.println("Dünya'un sıra numarası: " + dunya.getSiraNumarasi());
        System.out.println("Dünya'nın yarıçapı: " + dunya.getYaricapKm() + " km");
        System.out.println("Dünya'nın Güneş'e uzaklığı: " + dunya.getUzaklikAU() + " AU");
        System.out.println("Dünya'nın dönme süresi: " + dunya.getDonmeSuresiGun() + " gün");
        System.out.println("=============================================================");
        Gezegen mars = Gezegen.MARS;
        System.out.println("Mars'in sıra numarası: " + mars.getSiraNumarasi());
        System.out.println("Mars'in yarıçapı: " + mars.getYaricapKm() + " km");
        System.out.println("Mars'in Güneş'e uzaklığı: " + mars.getUzaklikAU() + " AU");
        System.out.println("Mars'in dönme süresi: " + mars.getDonmeSuresiGun() + " gün");
        System.out.println("=============================================================");
        Gezegen PLUTO = Gezegen.PLUTO;
        System.out.println("PLUTO'in sıra numarası: " + PLUTO.getSiraNumarasi());
        System.out.println("PLUTO'ın yarıçapı: " + PLUTO.getYaricapKm() + " km");
        System.out.println("PLUTO'ın Güneş'e uzaklığı: " + PLUTO.getUzaklikAU() + " AU");
        System.out.println("PLUTO'ın dönme süresi: " + PLUTO.getDonmeSuresiGun() + " gün");
    }
}
