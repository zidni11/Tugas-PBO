public class COD extends Pembayaran {
    private String alamatPengiriman;

    public COD(String nomor, double jumlah, String alamatPengiriman) {
        super(nomor, jumlah);
        if (alamatPengiriman == null || alamatPengiriman.isBlank()) {
            throw new IllegalArgumentException("Alamat pengiriman tidak boleh kosong");
        }
        this.alamatPengiriman = alamatPengiriman;
    }

    public String getAlamatPengiriman() {
        return alamatPengiriman;
    }

    @Override
    public long hitungBiaya() {
        return jumlah < 100000 ? 10000L : 0L;
    }

    @Override
    protected String detailPembayaran() {
        return "COD ke alamat: " + alamatPengiriman;
    }
}
