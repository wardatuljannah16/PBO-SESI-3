
public class PersegiPanjang extends BangunDatar {
    private double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }

    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    public void infoPersegiPanjang() {
        System.out.println("Persegi Panjang:");
        System.out.println("Panjang: " + panjang + ", Lebar: " + lebar);
        info();
    }
}
