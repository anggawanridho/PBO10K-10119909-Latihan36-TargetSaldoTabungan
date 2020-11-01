package target_saldo_tabungan;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */
class TargetSaldoTabungan {
    private double saldo_awal, bunga, saldo_target;
    Scanner scanner = new Scanner(System.in);
    public double getSaldo_awal() {
        System.out.print("Saldo Awal\t\t: ");
        saldo_awal = scanner.nextDouble();
        return saldo_awal;
    }

    public double getBunga() {
        System.out.print("Bunga/Bulan (%)\t: ");
        bunga = scanner.nextDouble();
        return bunga / 100;
    }

    public double getSaldo_target() {
        System.out.print("Saldo target\t: ");
        saldo_target = scanner.nextDouble();
        return saldo_target;
    }

}
