package id.ac.polinema.interfaceLatihan;

public class Program {
    public static void main(String[] args) {
        Rektor paRektor = new Rektor();

        Mahasiswa mhsBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");

        // paRektor.beriSertifikatCumlaude(mhsBiasa);
        // paRektor.beriSertifikatCumlaude(sarjanaCumlaude);
        // paRektor.beriSertifikatCumlaude(masterCumlaude);

        // paRektor.beriSertifikatMawapres(sarjanaCumlaude);
        paRektor.beriSertifikatMawapres(masterCumlaude);
    }
}

// Percobaan 2
// 1. Karena Class Mahasiswa tidak implement dengan ICUmlaude.
// 2. Bisa karena objek sarjanaCumlaude merupakan object dari class Sarjana yang mengextend mahasiswa.
// 3. Tidak bisa, karena mahasiswaCumlaude bertipe ICumlaude, sehingga tidak dapat menggunakan method di class Mahasiswa.
