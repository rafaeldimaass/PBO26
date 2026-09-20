package relasiClass;

public class MainPercobaan6 {
    public static void main(String[] args) {
        Laptop6 laptop = new Laptop6("Thinkpad");
        Printer printer = new Printer("Epson L3110");
        laptop.cetakDokumen(printer, "Laporan.pdf");
    }

}
