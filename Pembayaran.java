import java.util.Locale;

public abstract class Pembayaran {
    private String idTransaksi;
    private double jumlah;

    public Pembayaran(String idTransaksi, double jumlah) {
        // Validasi agar objek tidak dibuat dengan data yang tidak valid
        if (idTransaksi == null || idTransaksi.isBlank()) {
            throw new IllegalArgumentException("ID transaksi tidak boleh kosong");
        }
        if (jumlah < 0) {
            throw new IllegalArgumentException("Jumlah tidak boleh negatif");
        }
        this.idTransaksi = idTransaksi;
        this.jumlah = jumlah;
    }

    // Getter (encapsulation)
    public String getIdTransaksi() {
        return idTransaksi;
    }

    public double getJumlah() {
        return jumlah;
    }

    // Method abstrak yang wajib di-override oleh subclass
    public abstract void prosesPembayaran();

    public void infoTransaksi() {
        System.out.println("ID Transaksi: " + idTransaksi + " | Jumlah: Rp "
                + String.format(Locale.forLanguageTag("id-ID"), "%,.0f", jumlah));
    }
}