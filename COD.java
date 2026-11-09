public class COD extends Pembayaran {
    private String alamatPengiriman;

    public COD(String idTransaksi, double jumlah, String alamatPengiriman) {
        super(idTransaksi, jumlah);
        this.alamatPengiriman = alamatPengiriman;
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Pesanan COD dikirim ke alamat: " + alamatPengiriman);
    }
}