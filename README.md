# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data karyawan menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NIK Karyawan, dan memberikan output berupa informasi detail dari NIK tersebut seperti tahun masuk, divisi, posisi, dan nomor urut registrasi karyawan.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Karyawan`, `KaryawanDetail`, dan `KaryawanBeraksi` adalah contoh dari class.

```bash
public class Karyawan {
    ...
}

public class KaryawanDetail extends Karyawan {
    ...
}

public class KaryawanBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `karyawan1[i] = new KaryawanDetail(nama, nik);` adalah contoh pembuatan object.

```bash
karyawan1[i] = new KaryawanDetail(nama, nik);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `nik` adalah contoh atribut.

```bash
String nama;
String nik;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Karyawan` dan `KaryawanDetail`.

```bash

public Karyawan(String nama, String nik) {
        this.nama = nama;
        this.nik = nik;
}

public KaryawanDetail(String nama, String nik) {
        super(nama, nik);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setNik` adalah contoh method mutator.

```bash
public void setNama(String nama) {
        this.nama = nama;
}
public void setNik(String nik) {
        this.nik = nik;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getNik`, `getTahunMasuk`, `getDivisi`, `getPosisi`, dan `getNoRegistrasi` adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public String getNik() {
    return nik;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `nik` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String nik;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `KaryawanDetail` mewarisi `Karyawan` dengan sintaks `extends`.

```bash
public class KaryawanDetail extends Karyawan {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Karyawan` merupakan overloading method `displayInfo` dan `displayInfo` di `KaryawanDetail` merupakan override dari method `displayInfo` di `Karyawan`.

```bash
public String displayInfo(String alamat){
    return displayInfo() + "\nAlamat : "+alamat;
}

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getDivisi` dan seleksi `switch` dalam method `getPosisi`.

```bash
public String getDivisi(){
        String kodeDiv = getNik().substring(2, 4);
        if (kodeDiv.equals("01")){
            return "Pemasaran";
        }else {
            return "Gudang";
        }
}
public String getPosisi (){
        String kodePosisi = getNik().substring(4, 6);
        switch (kodePosisi){
            case "01":
                return "Supervisor";
            case "02":
                return "Marketing";
            default:
                return "Administrasi";
        }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for(int i=0; i<karyawan1.length; i++){
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Nama Karyawan ke-" + (i + 1) + ": ");
String nama = scanner.nextLine();

System.out.println("\nData Karyawan:");
System.out.println(karyawan1.displayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `KaryawanDetail[] karyawan1 = new KaryawanDetail[2];` adalah contoh penggunaan array.

```bash
KaryawanDetail[] karyawan1 = new KaryawanDetail [2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    } catch (NumberFormatException e){
        System.out.println("Kesalahan Format : " + e.getMessage());
    }catch (StringIndexOutOfBoundsException e){
        System.out.println("Kesalahan Format NIK : " + e.getMessage()); 
    }catch (Exception e){
        System.out.println("Kesalahan Umum : " + e.getMessage());
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Aditya Kurniadi
NPM: 2210010397
