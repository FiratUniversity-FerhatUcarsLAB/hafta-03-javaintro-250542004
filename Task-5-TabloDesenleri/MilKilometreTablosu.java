public class MilKilometreTablosu {
    public static void main(String[] args) {
        // Mil ve km değerleri
        int mil1 = 1;
        int mil2 = 5;
        int mil3 = 10;
        int mil4 = 20;
        int mil5 = 50;

        double km1 = 1 * 1.60934;
        double km2 = 5 * 1.60934;
        double km3 = 10 * 1.60934;
        double km4 = 20 * 1.60934;
        double km5 = 50 * 1.60934;

        // ASCII tablo başlığı
        System.out.println("+------+--------+");
        System.out.printf("| %-4s | %-6s |\n", "Mil", "Km");
        System.out.println("+------+--------+");

        // Tablo satırları
        System.out.printf("| %-4d | %-6.2f |\n", mil1, km1);
        System.out.printf("| %-4d | %-6.2f |\n", mil2, km2);
        System.out.printf("| %-4d | %-6.2f |\n", mil3, km3);
        System.out.printf("| %-4d | %-6.2f |\n", mil4, km4);
        System.out.printf("| %-4d | %-6.2f |\n", mil5, km5);

        System.out.println("+------+--------+");
    }
}
