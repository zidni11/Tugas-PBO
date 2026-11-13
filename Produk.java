import java.util.Locale;
import java.util.Objects;

public class Produk {
    private String kodeProduk;
    private String namaProduk;
    private double harga;

    public Produk(String kodeProduk, String namaProduk, double harga) {
        // Validasi agar objek tidak dibuat dengan data yang tidak valid
        if (kodeProduk == null || kodeProduk.isBlank()) {
            throw new IllegalArgumentException("Kode produk tidak boleh kosong");
        }
        if (namaProduk == null || namaProduk.isBlank()) {
            throw new IllegalArgumentException("Nama produk tidak boleh kosong");
        }
        if (harga < 0) {
            throw new IllegalArgumentException("Harga tidak boleh negatif");
        }
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    // Getter
    public String getKodeProduk() {
        return kodeProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    // Override toString() untuk menampilkan informasi objek secara rapi
    @Override
    public String toString() {
        return String.format(Locale.forLanguageTag("id-ID"),
                "Produk[Kode: %s | Nama: %s | Harga: Rp %,.0f]",
                kodeProduk, namaProduk, harga);
    }

    // Override equals() untuk membandingkan kesamaan dua objek Produk berdasarkan kodeProduk
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Produk)) {
            return false;
        }
        Produk produkLain = (Produk) obj;
        return Objects.equals(this.kodeProduk, produkLain.kodeProduk);
    }

    // Praktik terbaik di Java: selalu override hashCode() saat meng-override equals()
    @Override
    public int hashCode() {
        return Objects.hash(kodeProduk);
    }
}