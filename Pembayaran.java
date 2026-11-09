public abstract class Pembayaran {
    protected String idTransaksi;
    protected double jumlah;

    public Pembayaran(String idTransaksi, double jumlah) {
        this.idTransaksi = idTransaksi;
        this.jumlah = jumlah;
    }

    // Method abstrak yang wajib di-override oleh subclass
    public abstract void prosesPembayaran();

    public void infoTransaksi() {
        System.out.println("ID Transaksi: " + idTransaksi + " | Jumlah: Rp " + jumlah);
    }
}