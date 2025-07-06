package uaspbo1;

public class Karyawan {
    //atribute dan encapsulation
    private String nama;
    private String nik;
    
    //constructor
    public Karyawan(String nama, String nik) {
        this.nama = nama;
        this.nik = nik;
    }
    //accesor
    public String getNama() {
        return nama;
    }
    public String getNik() {
        return nik;
    }
    //mutator
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setNik(String nik) {
        this.nik = nik;
    }
    public String displayInfo(){
        return "Nama : "+getNama()+
               "\nNIK : "+getNik();
    }
    //polymorfisme (overloading)
    public String displayInfo(String alamat){
        return displayInfo() + "\nAlamat : "+alamat;
    }
}
