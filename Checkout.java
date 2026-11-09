import java.util.List;

public class Checkout {
    // Memproses List<Pembayaran> secara polimorfik
    public void prosesCheckout(List<Pembayaran> daftarPembayaran) {
        if (daftarPembayaran == null || daftarPembayaran.isEmpty()) {
            System.out.println("Tidak ada transaksi untuk diproses.");
            return;
        }
        for (Pembayaran p : daftarPembayaran) {
            if (p == null) {
                continue;
            }
            p.infoTransaksi();
            p.prosesPembayaran(); // Polimorfisme beraksi di sini
            System.out.println("-----------------------------------");
        }
    }
}