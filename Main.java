import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Membuat beberapa objek pembayaran
        Pembayaran p1 = new Transfer("TRX001", 150000, "BCA");
        Pembayaran p2 = new EWallet("TRX002", 45000, "GoPay");
        Pembayaran p3 = new COD("TRX003", 120000, "Jl. Merdeka No. 10");

        // Memasukkan ke dalam List<Pembayaran>
        List<Pembayaran> transaksiList = new ArrayList<>();
        transaksiList.add(p1);
        transaksiList.add(p2);
        transaksiList.add(p3);

        // Menjalankan checkout
        Checkout checkout = new Checkout();
        checkout.prosesCheckout(transaksiList);
    }
}