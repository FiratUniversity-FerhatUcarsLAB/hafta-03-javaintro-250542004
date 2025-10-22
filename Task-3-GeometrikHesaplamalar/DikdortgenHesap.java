public class DikdortgenHesap {
    public static void main(String[] args) {
        // Degerleri Atama
        double en = 4.5;
        double boy = 7.9;

        // Alan hesabi
        double alan =en*boy;

        // Cevre hesabi
        double cevre = 2*(en+boy);

        // Sonuclari gosterme
        System.out.println("En = "+en+"\nBoy= "+ boy);
        System.out.printf("Alan = "+ "%.2f\n",alan);
        System.out.printf("Cevre = "+ "%.2f\n",cevre);
    }
}
