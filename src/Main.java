// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        persegi.setNama("Persegi");
        persegi.setSisi(10);

        Persegi anotherPersegi = (Persegi) persegi.clone();

        System.out.println("Bangun datar persegi:");
        System.out.println("Nama: " + persegi.getNama());
        System.out.println("Sisi: " + persegi.getSisi());

        System.out.println();

        System.out.println("Hasil clone bangun datar persegi:");
        System.out.println("Nama: " + anotherPersegi.getNama());
        System.out.println("Sisi: " + anotherPersegi.getSisi());
    }
}