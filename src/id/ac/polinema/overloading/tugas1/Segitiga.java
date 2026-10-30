package id.ac.polinema.overloading.tugas1;

public class Segitiga {
    private int sudut;

    // Mengembalikan jumlah dua sudut lain: 180 - sudutA
    public int sisaSudut(int sudutA) {
        validasiSudut(sudutA);
        sudut = 180 - sudutA;
        return sudut;
    }

    // Mengembalikan sudut ketiga: 180 - (sudutA + sudutB)
    public int sisaSudut(int sudutA, int sudutB) {
        validasiSudut(sudutA + sudutB);
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }

    // Keliling segitiga sembarang
    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    // Keliling segitiga siku-siku (sisiA dan sisiB = sisi tegak)
    public double keliling(int sisiA, int sisiB) {
        double c = Math.sqrt(sisiA * sisiA + sisiB * sisiB);
        return sisiA + sisiB + c;
    }

    public int getSudut() {
        return sudut;
    }

    private void validasiSudut(int jumlahSudut) {
        if (jumlahSudut <= 0 || jumlahSudut >= 180) {
            throw new IllegalArgumentException(
                    "Jumlah sudut harus > 0 dan < 180, diberikan: " + jumlahSudut);
        }
    }
}
