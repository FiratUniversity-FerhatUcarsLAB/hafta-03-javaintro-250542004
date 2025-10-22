public class HesapOzeti {
    public static void main(String[] args) {
        // Ürün adları
        String urun1 = "Elma";
        String urun2 = "Muz";
        String urun3 = "Çikolata";

        // Miktarları
        int miktar1 = 2;
        int miktar2 = 3;
        int miktar3 = 2;

        // Fiyatları
        int fiyat1 = 10;
        int fiyat2 = 15;
        int fiyat3 = 20;

        // Tablo başlığı ve çizgiler (ASCII style)
        System.out.println("+-----------+--------------+------------+");
        System.out.printf("| %-9s | %-12s | %-10s |\n", "Ürün", "Miktar", "Fiyat (TL)");
        System.out.println("+-----------+--------------+------------+");

        // Tablo satırları
        System.out.printf("| %-9s | %-12d | %-7d TL |\n", urun1, miktar1, fiyat1);
        System.out.printf("| %-9s | %-12d | %-7d TL |\n", urun2, miktar2, fiyat2);
        System.out.printf("| %-9s | %-12d | %-7d TL |\n", urun3, miktar3, fiyat3);
        System.out.println("+-----------+--------------+------------+");
    }
}
