# LAPORAN JOBSHEET 2
## Langkah 1-2 Class Rectangle dan Objek Pertama
### 1. Main
```java
package id.ac.polinema;
public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.width = 6;
        r.height = 4;

        System.out.println("Rectangle " + r.width + "x" + r.height);
    }
}
```
### 2. Class Rectangle
```java
package id.ac.polinema;

public class Rectangle {
    int width, height;
}
```
### Output
```
Rectangle 6x4
```
## Langkah 3 Method
### 1. Main
```java
package id.ac.polinema;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.width = 6;
        r.height = 4;

        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());
    }
}
```
### 2. Class Rectangle
```java
package id.ac.polinema;

public class Rectangle {
    int width, height;

    int area() {
        return width * height;
    }
    int perimeter() {
        return 2 * (width + height);
    }
}
```
### Output
```
Area: 24
Perimeter: 20
```
## Langkah 4-5 Konstruktor, Referensi, Aliasing, dan Uji Null
### 1. Main
```java
package id.ac.polinema;

public class Main {
    public static void main(String[] args) {
        Rectangle original = new Rectangle(6, 4);



        System.out.println("Area: " + original.area());

        Rectangle copy = original;
        copy.width = 10;
        System.out.println("Via original: " + original.area());
        System.out.println("Via vopy: " + copy.area());

        Rectangle empty = null;
        System.out.println(empty.area());
    }
}
```
### 2. Class Rectangle
```java
public class Rectangle {
    int width, height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int area() {
        return width * height;
    }
```
### * karena method pada baris uji null menujuk ke objek kosong (null) maka akan muncul error dengan pesan NullPointerException. Maka dari itu kita hapus baris uji null.
```
Area: 24
Via original: 40
Via vopy: 40
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "id.ac.polinema.Rectangle.area()" because "empty" is null
        at id.ac.polinema.Main.main(Main.java:17)
```
### 3. Menghapus Baris Uji Null
```java
package id.ac.polinema;

public class Main {
    public static void main(String[] args) {
        Rectangle original = new Rectangle(6, 4);

        System.out.println("Area: " + original.area());

        Rectangle copy = original;
        copy.width = 10;
        System.out.println("Via original: " + original.area());
        System.out.println("Via vopy: " + copy.area());
    }
}
``` 
### Output
```
Area: 24
Via original: 40
Via vopy: 40
```

## Langkah 6-7 Class Student dan Array of Object
### 1. Class Student
```java
package id.ac.polinema;

public class Student {
    private String name;
    private String studentId;
    private double gpa;

    Student(String name, String studentId, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public String describe() {
        return name + " (" + studentId + ", GPA: " + gpa + ")";
    }
    
}
```
### 2. Main
```java
package id.ac.polinema;

public class Main {
    public static void main(String[] args) {
        Rectangle[] shapes = new Rectangle[3];
        shapes[0] = new  Rectangle(6, 4);
        shapes[1] = new Rectangle(3, 3);
        shapes[2] = new Rectangle(8, 2);

        for (Rectangle r : shapes) {
            System.out.println("Area: " + r.area() + ", Perimeter: " + r.perimeter());
        }




        Student s = new Student("Nadia", "S001", 3.8);
        System.out.println(s.describe());
    }
}
```
### Output
```
Area: 24, Perimeter: 20
Area: 9, Perimeter: 12
Area: 16, Perimeter: 20
Nadia (S001, GPA: 3.8)
```

## TUGAS
### 1. Class Circle
```java
package id.ac.polinema;

public class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
    double circumference() {
        return 2 * Math.PI * radius;
    }
}
```
### 2. Main
```java
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
```
### Output
```
Luas Lingkaran: 78.53981633974483
Keliling Lingkaran: 31.41592653589793
Area: 24, Perimeter: 20
Area: 9, Perimeter: 12
Area: 16, Perimeter: 20
Nadia (S001, GPA: 3.8)
```
### 3. Pertanyaan
### - Jawab singkat (2-3 kalimat masing-masing): (a) apa bedanya objek dengan referensi keobjek? (b) tepatnya kapan konstruktor sebuah kelas dijalankan?
### a) Objek merupakan hasil instansiasi class yang menyimpan salinan atributnya didalam memori heap. Referensi ke objek merupakan variabel yang hanya menyimpan nilai berupa alamat memori yang mengarah ke sebuah objek.
### b) Konstruktor sebuah class dijalankan ketika proses instansiasi objek baru menggunakan keyword `new`. Terjadi tepat sebelum alamat memori objek dikembalikan ke variabel referensi. Sebuah variabel referensi hanyalah tempat kecil di stack yang menyimpan alamat memori objek, Objek sesungguhnya sudah disimpan di heap, lengkap dengan atributnya.