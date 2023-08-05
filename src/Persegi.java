public class Persegi extends BangunDatar{
    public Persegi(){
    }
    public Persegi(Persegi target) {
        super(target);
    }

    @Override
    public String getNama() {
        return super.getNama();
    }

    @Override
    public void setNama(String nama) {
        super.setNama(nama);
    }

    @Override
    public int getSisi() {
        return super.getSisi();
    }

    @Override
    public void setSisi(int sisi) {
        super.setSisi(sisi);
    }

    @Override
    public BangunDatar clone() {
        return new Persegi(this);
    }
}
