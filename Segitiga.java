
public class Segitiga extends BangunDatar {
    private double alas, tinggi, sisi1, sisi2, sisi3;

    public Segitiga(double alas, double tinggi, double sisi1, double sisi2, double sisi3) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    public double hitungKeliling() {
        return sisi1 + sisi2 + sisi3;
    }

    public void infoSegitiga() {
        System.out.println("Segitiga:");
        System.out.println("Alas: " + alas + ", Tinggi: " + tinggi);
        System.out.println("Sisi: " + sisi1 + ", " + sisi2 + ", " + sisi3);
        info();
    }
}
