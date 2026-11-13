import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Pengujian Checkout (Polymorphism & Template Method) ===");

        List<Pembayaran> transaksiList = new ArrayList<>();
        transaksiList.add(new Transfer("TRX001", 45000, "BCA"));
        transaksiList.add(new Transfer("TRX002", 150000, "Mandiri"));
        transaksiList.add(new EWallet("TRX003", 45000, "GoPay"));
        transaksiList.add(new EWallet("TRX004", 150000, "OVO"));
        transaksiList.add(new COD("TRX005", 75000, "Jl. Merdeka No. 10"));
        transaksiList.add(new COD("TRX006", 120000, "Jl. Sudirman No. 25"));

        Checkout checkout = new Checkout();
        checkout.prosesCheckout(transaksiList);

        System.out.println("=== Pengujian Produk (toString, equals, hashCode) ===");

        Produk prod1 = new Produk("PRD01", "Mechanical Keyboard", 450000);
        Produk prod2 = new Produk("PRD01", "Mechanical Keyboard RGB", 500000);
        Produk prod3 = new Produk("PRD02", "Wireless Mouse", 150000);

        System.out.println(prod1);
        System.out.println(prod3);
        System.out.println("Apakah prod1 sama dengan prod2? " + prod1.equals(prod2));
        System.out.println("Apakah prod1 sama dengan prod3? " + prod1.equals(prod3));
        System.out.println("hashCode prod1: " + prod1.hashCode());
        System.out.println("hashCode prod2: " + prod2.hashCode());
    }
}
