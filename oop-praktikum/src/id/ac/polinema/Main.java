package id.ac.polinema;

public class Main {
    public static void main(String[] args) {
        Rectangle[] shapes = new Rectangle[3];
        shapes[0] = new  Rectangle(6, 4);
        shapes[1] = new Rectangle(3, 3);
        shapes[2] = new Rectangle(8, 2);

        Circle bulat = new Circle(5);
        System.out.println("Luas Lingkaran: " + bulat.area());
        System.out.println("Keliling Lingkaran: " + bulat.circumference());

        for (Rectangle r : shapes) {
            System.out.println("Area: " + r.area() + ", Perimeter: " + r.perimeter());
        }

        Student s = new Student("Nadia", "S001", 3.8);
        System.out.println(s.describe());
    }
}