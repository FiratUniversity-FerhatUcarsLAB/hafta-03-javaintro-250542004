public class DaireHesap {
    public static void main(String[] args) {
        // Deger atamasi
        double r = 5.5;
        double pi = 3.14159;

        // Alan hesabi
        double alan = pi*r*r;

        // Cevre hesabi
        double cevre = 2*pi*r;

        // Sonuclari yazdir
        System.out.println("Yaricap = "+ r);
        System.out.printf("Alan = "+ "%.4f\n",alan);
        System.out.printf("Cevre = "+ "%.4f\n",cevre);
    }
}
