public class Transfer extends Pembayaran {
    private String bank;

    public Transfer(String idTransaksi, double jumlah, String bank) {
        super(idTransaksi, jumlah);
        this.bank = bank;
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Memproses pembayaran via Transfer Bank (" + bank + ").");
    }
}