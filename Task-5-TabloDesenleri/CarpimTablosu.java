public class CarpimTablosu {
    public static void main(String[] args) {
        // 2'nin çarpım tablosu
        int n1 = 2 * 1;
        int n2 = 2 * 2;
        int n3 = 2 * 3;
        int n4 = 2 * 4;
        int n5 = 2 * 5;
        int n6 = 2 * 6;
        int n7 = 2 * 7;
        int n8 = 2 * 8;
        int n9 = 2 * 9;
        int n10 = 2 * 10;

        // ASCII tablo başlığı
        System.out.println("+-------+-------+");
        System.out.printf("| %-5s | %-3s |\n", "2 x", "Sonuç");
        System.out.println("+-------+-------+");

        // Tablo satırları
        System.out.printf("| %-5d | %-5d |\n", 1, n1);
        System.out.printf("| %-5d | %-5d |\n", 2, n2);
        System.out.printf("| %-5d | %-5d |\n", 3, n3);
        System.out.printf("| %-5d | %-5d |\n", 4, n4);
        System.out.printf("| %-5d | %-5d |\n", 5, n5);
        System.out.printf("| %-5d | %-5d |\n", 6, n6);
        System.out.printf("| %-5d | %-5d |\n", 7, n7);
        System.out.printf("| %-5d | %-5d |\n", 8, n8);
        System.out.printf("| %-5d | %-5d |\n", 9, n9);
        System.out.printf("| %-5d | %-5d |\n", 10, n10);

        System.out.println("+-------+-------+");
    }
}
