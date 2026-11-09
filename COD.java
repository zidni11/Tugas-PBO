public class COD extends Pembayaran {
    private String alamatPengiriman;

    public COD(String idTransaksi, double jumlah, String alamatPengiriman) {
        super(idTransaksi, jumlah);
        if (alamatPengiriman == null || alamatPengiriman.isBlank()) {
            throw new IllegalArgumentException("Alamat pengiriman tidak boleh kosong");
        }
        this.alamatPengiriman = alamatPengiriman;
    }

    public String getAlamatPengiriman() {
        return alamatPengiriman;
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Pesanan COD dikirim ke alamat: " + alamatPengiriman);
    }
}