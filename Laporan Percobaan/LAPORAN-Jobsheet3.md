# LAPORAN JOBSHEET 3
## Percobaan 1
### Class Motor
```java
package MotorEncapsulation;

public class Motor {
    public int kecepatan = 0;
    public boolean kontakOn = false;

    public void printStatus() {
        if (kontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan+"\n");
    }
}
```
### Class MotorDemo
``` java
package MotorEncapsulation;

public class MotorDemo {
    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.printStatus();
        motor.kecepatan = 50;
        motor.printStatus();
    }
}
```
## Percobaan 2
### Class Motor
```java
package MotorEncapsulation;

public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;

    public void nyalakanMesin() {
        kontakOn = true;
    }
    
    public void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
    }

    public void tambahKecepatan() {
        if (kontakOn == true) {
            kecepatan += 5;
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena mesin Off! \n");
        }
    }

    public void kurangiKecepatan() {
        if (kontakOn == true) {
            kecepatan -= 5;
        } else {
            System.out.println("Kecepatan tidak bisa berkurang karena mesin Off! \n");
        }
    }

    public void printStatus() {
        if (kontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan+"\n");
    }
    
}
```
### Class MotorDemo
```java
package MotorEncapsulation;

public class MotorDemo {
    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.printStatus();
        motor.tambahKecepatan();

        motor.nyalakanMesin();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.matikanMesin();
        motor.printStatus();
    }
}
```
## Pertanyaan Percobaan 1 & 2
### 1. Pada class TestMobil, saat kita menambah kecepatan untuk pertama kalinya, mengapa muncul peringatan “Kecepatan tidak bisa bertambah karena Mesin Off!”?
### * Karena pada class MotorDemo, kita belum memanggil method nyalakan mesin sehingga mesin belum menyala dan tidak dapat menambah kecepatan
### 2. Mengapa atribut kecepatan dan kontakOn diset private?
### * Untuk membatasi akses atribut pada class Motor, sehingga tidak bisa diakses sembarangan pada class yang lain.
### 3. Ubah class Motor sehingga kecepatan maksimalnya adalah 100!
``` java
package MotorEncapsulation;

public class Motor {
    private int kecepatan = 0;
    private int kecepatanMaks = 100;
    private boolean kontakOn = false;

    public void nyalakanMesin() {
        kontakOn = true;
    }
    
    public void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
    }

    public void tambahKecepatan() {
        if (kecepatan >= kecepatanMaks) {
            System.out.println("Kecepatan sudah pada batas maksimal");
            return;
        }

        if (kontakOn == true) {
            kecepatan += 5;
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena mesin Off! \n");
        }
    }

    public void kurangiKecepatan() {
        if (kontakOn == true) {
            kecepatan -= 5;
        } else {
            System.out.println("Kecepatan tidak bisa berkurang karena mesin Off! \n");
        }
    }

    public void printStatus() {
        if (kontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan+"\n");
    }
    
}
```
## Percobaan 3
### Class Anggota
```java
package KoperasiGetterSetter;

public class Anggota {
    private String nama;
    private String alamat;
    private float simpanan;

    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getNama() {
        return nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public float getSimpanan() {
        return simpanan;
    }
    public void setor(float uang) {
        simpanan += uang;
    }
    public void pinjam(float uang) {
        simpanan -= uang;
    }
}
```
### Class KoperasiDemo
```java
package KoperasiGetterSetter;

public class KoperasiDemo {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota();
        anggota1.setNama("Iwan Setiawan");
        anggota1.setAlamat("Jalan Sukarno Hatta no 10");
        anggota1.setor(100000);
        System.out.println("Simpanan " +anggota1.getNama() + " : Rp " + anggota1.getSimpanan());

        anggota1.pinjam(5000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());
    }
}
```
## Percobaan 4
### Class Anggota
```java
package KoperasiGetterSetter;

public class Anggota {
    private String nama;
    private String alamat;
    private float simpanan;

    Anggota(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        this.simpanan = 0;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getNama() {
        return nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public float getSimpanan() {
        return simpanan;
    }
    public void setor(float uang) {
        simpanan += uang;
    }
    public void pinjam(float uang) {
        simpanan -= uang;
    }
}
```
### Class KoperasiDemo
```java
package KoperasiGetterSetter;

public class KoperasiDemo {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("Iwan", "Jalan Mawar");
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());

        anggota1.setNama("Iwan Setiawan");
        anggota1.setAlamat("Jalan Sukarno Hatta no 10");
        anggota1.setor(100000);
        System.out.println("Simpanan " +anggota1.getNama() + " : Rp " + anggota1.getSimpanan());

        anggota1.pinjam(5000);
        System.out.println("Simpanan " + anggota1.getNama() + " : Rp " + anggota1.getSimpanan());
    }
}
```
## Pertanyaan Percobaan 3-4
### 1. Apa yang dimaksud getter dan setter?
### * Getter (getNama, getAlamat, getSimpanan): Method buat ngambil/melihat nilai atribut private. 
### * Setter (setNama, setAlamat): Method buat ngubah/ngisi nilai atribut private.
### 2. Apa kegunaan dari method getSimpanan()?
### * Untuk mengambil dan mengembalikan nilai atribut simpanan (bertipe float) dari objek Anggota.
### 3. Method apa yang digunakan untuk menambah saldo?
### * Method setor(float uang) karena di dalamnya ada operasi simpanan += uang untuk nambah simpanan.
### 4. Apa yang dimaksud konstruktor?
### * Method khusus yang dipanggil ketika pembuatan objek baru
### 5. Sebutkan aturan dalam membuat konstruktor?
### * Namanya wajib sama persis dengan nama classnya.
### * Tidak memiliki return type (tidak boleh pakai void atau tipe data lain).
### 6. Apakah boleh konstruktor bertipe private?
### * Tidak boleh, karena jika konstruktor bertipe private maka tidak dapat diakses oleh class lain ketika membuat objek.
### 7. Kapan menggunakan konstruktor dengan passing parameter?
### * Ketika ingin langsung mengirim data awal saat objek dibuat.
### 8. Apa perbedaan inisialisasi atribut dan instansiasi atribut?
### * Inisialisasi atribut: Ngasih nilai awal ke variabel/atribut
### * Instansiasi atribut: Bikin objek baru di memori pakai keyword new buat disimpan ke dalam variabel atribut
### 9. Apa perbedaan inisialisasi method dan instansiasi method?
### * Inisialisasi method: Menuliskan deklarasi dan logika isi method-nya 
### * Instansiasi method: Pemanggilan / eksekusi method
