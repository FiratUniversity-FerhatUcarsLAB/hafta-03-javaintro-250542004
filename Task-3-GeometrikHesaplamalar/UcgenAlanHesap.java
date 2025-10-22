public class UcgenAlanHesap {
    public static void main(String[] args) {
        // Degerleri tanimlama
        int a = 3;
        int b = 4;
        int c = 5;
        int s = (a+b+c)/2; // buradaki "s" degiskeni ucgenin cevresinin yarisi olmaktadir ve alan hesabinda kullanildiği icin islem uzunlugundan kurtulmak adina yazilmistirQ

        // Alan hesabi
        double alan = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        // Cevre hesabi
        int cevre = a+b+c;

        // Sonuclari gösterme
        System.out.println("Kenar uzunluklari = "+a+", " + b + ", "+ c);
        System.out.println("Cevre = "+ cevre);
        System.out.println("Alan = "+ alan);
    }
}
