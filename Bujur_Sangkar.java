
public class BujurSangkar extends BangunDatar {
    private double sisi;

    public BujurSangkar(double sisi) {
        this.sisi = sisi;
    }

    public double hitungLuas() {
        return sisi * sisi;
    }

    public double hitungKeliling() {
        return 4 * sisi;
    }

    public void infoBujurSangkar() {
        System.out.println("Bujur Sangkar:");
        System.out.println("Sisi: " + sisi);
        info();
    }
}
