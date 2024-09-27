
import java.util.Scanner;

/**
 * Kafe20
 */
public class Kafe20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String menu;
        char ukuranCup;
        int jumlah;
        boolean keanggotaan;

        System.out.println("Maskkan menu: ");
        menu = sc.nextLine();
        System.out.println("Masukkan ukuran cup: ");
        ukuranCup = sc.next().charAt(0);
        System.out.println("Masukkan jumlah: ");
        jumlah = sc.nextInt();
        System.out.println("Masukkan keanggotaan (true/false): ");
        keanggotaan = sc.nextBoolean();

        double hargaMenu = 0;

        switch (menu.toLowerCase()) {
            case "kopi":
                hargaMenu = 15000;
                break;
            case "teh" :
                hargaMenu = 5000;
                break;
            case "coklat" :
                hargaMenu = 10000;
                break;
        }
        double totalHarga = hargaMenu *jumlah;

        switch (ukuranCup) {
            case 'S':
                break;
            case 'M':
                totalHarga += 0.25 *totalHarga;
                break;
            case 'L':
                totalHarga += 0.4 *totalHarga;
                break;
        }

        double diskon = keanggotaan ? 0.1 : 0;
        double nominalBayar = totalHarga - (diskon *totalHarga);

        System.out.println("item pemvelian: "+ jumlah + " " + menu + " dengan ukuran cup " + ukuranCup);
        System.out.println("nominalBayar = " + nominalBayar);

    }
}