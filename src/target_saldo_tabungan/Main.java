package target_saldo_tabungan;

import java.util.Locale;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class Main {

    public static void main(String[] args) {
        TargetSaldoTabungan saldo = new TargetSaldoTabungan();

        //proses input
        double saldoAwal = saldo.getSaldo_awal();
        double bungaBulanan = saldo.getBunga();
        double saldoTarget = saldo.getSaldo_target();

        // proses perhitungan
        double i = 0;
        do {
            i += 1;
            saldoAwal += Math.floor(saldoAwal * bungaBulanan);
            System.out.printf(Locale.ITALY, "Saldo di bulan ke-%1$.0f Rp. %2$,.0f%n" , i , saldoAwal);
        } while (saldoAwal<saldoTarget);
    }
}
