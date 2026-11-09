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

        // Demonstrasi Class Produk (equals & toString)
        Produk prod1 = new Produk("PRD01", "Mechanical Keyboard", 450000);
        Produk prod2 = new Produk("PRD01", "Mechanical Keyboard RGB", 500000);
        Produk prod3 = new Produk("PRD02", "Wireless Mouse", 150000);

        // Otomatis memanggil toString()
        System.out.println(prod1);
        System.out.println(prod3);

        // Membandingkan objek dengan equals()
        System.out.println("Apakah prod1 sama dengan prod2? " + prod1.equals(prod2)); // true (kode sama: PRD01)
        System.out.println("Apakah prod1 sama dengan prod3? " + prod1.equals(prod3)); // false (kode beda)
    }
}
