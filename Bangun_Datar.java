
public abstract class BangunDatar {
    public abstract double hitungLuas();
    public abstract double hitungKeliling();

    public void info() {
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
        System.out.println("===========================");
    }
}
