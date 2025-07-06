package uaspbo1;

import java.util.Scanner;
public class KaryawanBeraksi {
    public static void main(String[] args) {
        //objek
        //Karyawan karyawan1 = new Karyawan("Aditya Kurniadi","250102001");
        
        //System.out.println(karyawan1.displayInfo());
        //System.out.println(karyawan1.displayInfo("Jalan Sulawesi"));
        
        //Error Handling
        try{
            //IO Sederhana
            Scanner scanner = new Scanner(System.in);

            //Array
            KaryawanDetail[] karyawan1 = new KaryawanDetail [2];
            //Perulangan
            for(int i=0; i<karyawan1.length; i++){
                System.out.print("Masukkan Nama Karyawan " + (i+1)+ ": ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan NIK Karyawan " + (i+1)+ ": ");
                String nik = scanner.nextLine();
                //objek
                karyawan1[i] = new KaryawanDetail(nama, nik);
            }
            //Perulangan Array
            for(KaryawanDetail data: karyawan1){
                System.out.println("================");
                System.out.println("Data Karyawan : ");
                System.out.println(data.displayInfo());
            }
        } catch (NumberFormatException e){
            System.out.println("Kesalahan Format : " + e.getMessage());
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Kesalahan Format NIK : " + e.getMessage()); 
        }catch (Exception e){
            System.out.println("Kesalahan Umum : " + e.getMessage());
        }
    }
}
