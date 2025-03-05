import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Pilih Bangun Datar:");
        System.out.println("1. Bujur Sangkar");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.print("Masukkan pilihan 1,2,3 : ");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan sisi bujur sangkar: ");
                double sisi = sc.nextDouble();
                BujurSangkar bujurSangkar = new BujurSangkar(sisi);
                bujurSangkar.infoBujurSangkar();
                break;

            case 2:
                System.out.print("Masukkan panjang: ");
                double panjang = sc.nextDouble();
                System.out.print("Masukkan lebar: ");
                double lebar = sc.nextDouble();
                PersegiPanjang pp = new PersegiPanjang(panjang, lebar);
                pp.infoPersegiPanjang();
                break;

            case 3:
                System.out.print("Masukkan alas segitiga: ");
                double alas = sc.nextDouble();
                System.out.print("Masukkan tinggi segitiga: ");
                double tinggi = sc.nextDouble();
                System.out.print("Masukkan sisi 1: ");
                double sisi1 = sc.nextDouble();
                System.out.print("Masukkan sisi 2: ");
                double sisi2 = sc.nextDouble();
                System.out.print("Masukkan sisi 3: ");
                double sisi3 = sc.nextDouble();
                Segitiga segitiga = new Segitiga(alas, tinggi, sisi1, sisi2, sisi3);
                segitiga.infoSegitiga();
                break;

            default:
                System.out.println("Pilihan tidak valid.");
        }
        
        sc.close();
    }
}