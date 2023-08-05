public abstract class BangunDatar {
    private String nama;
    private int sisi;

    public BangunDatar() {

    }

    public BangunDatar(BangunDatar target) {
        this.nama = target.nama;
        this.sisi = target.sisi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public abstract BangunDatar clone();
}
