import java.util.List;

public class Checkout {
    // Memproses List<Pembayaran> secara polimorfik
    public void prosesCheckout(List<Pembayaran> daftarPembayaran) {
        for (Pembayaran p : daftarPembayaran) {
            p.infoTransaksi();
            p.prosesPembayaran(); // Polimorfisme beraksi di sini
            System.out.println("-----------------------------------");
        }
    }
}