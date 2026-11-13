import java.util.Locale;

public abstract class Pembayaran {
    protected String nomor;
    protected double jumlah;

    public Pembayaran(String nomor, double jumlah) {
        if (nomor == null || nomor.isBlank()) {
            throw new IllegalArgumentException("Nomor transaksi tidak boleh kosong");
        }
        if (jumlah < 0) {
            throw new IllegalArgumentException("Jumlah tidak boleh negatif");
        }
        this.nomor = nomor;
        this.jumlah = jumlah;
    }

    public String getNomor() {
        return nomor;
    }

    public double getJumlah() {
        return jumlah;
    }

    public abstract long hitungBiaya();

    protected String detailPembayaran() {
        return "-";
    }

    public final void proses() {
        long biaya = hitungBiaya();
        double total = jumlah + biaya;

        System.out.println("Nomor Transaksi : " + nomor);
        System.out.println("Jumlah          : " + formatRupiah(jumlah));
        System.out.println("Biaya           : " + formatRupiah(biaya));
        System.out.println("Total           : " + formatRupiah(total));
        System.out.println("Detail          : " + detailPembayaran());
    }

    protected static String formatRupiah(double nilai) {
        return "Rp " + String.format(Locale.forLanguageTag("id-ID"), "%,.0f", nilai);
    }
}
