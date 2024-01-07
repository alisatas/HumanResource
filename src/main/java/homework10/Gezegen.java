package homework10;

public enum Gezegen {
    MERCURY(1, 0.39, 2439.7, 87.97),
    VENUS(2, 0.72, 6051.8, 224.7),
    EARTH(3, 1.0, 6371.0, 365.25),
    MARS(4, 1.52, 3389.5, 686.98),
    JUPITER(5, 5.2, 69911.0, 4332.71),
    SATURN(6, 9.58, 58232.0, 10759.5),
    URANUS(7, 19.22, 25362.0, 30688.5),
    NEPTUNE(8, 30.05, 24622.0, 60182.0),
    PLUTO(9, 39.48, 1188.3, 90560.0);

    public int siraNumarasi;
    public double uzaklikAU; // Güneş'e uzaklık
    public double yaricapKm; // Kilometre cinsinden
    public double donmeSuresiGun;

    Gezegen(int siraNumarasi, double uzaklikAU, double yaricapKm, double donmeSuresiGun) {
        this.siraNumarasi = siraNumarasi;
        this.uzaklikAU = uzaklikAU;
        this.yaricapKm = yaricapKm;
        this.donmeSuresiGun = donmeSuresiGun;
    }

    public int getSiraNumarasi() {
        return siraNumarasi;
    }

    public double getUzaklikAU() {
        return uzaklikAU;
    }

    public double getYaricapKm() {
        return yaricapKm;
    }

    public double getDonmeSuresiGun() {
        return donmeSuresiGun;
    }

}


