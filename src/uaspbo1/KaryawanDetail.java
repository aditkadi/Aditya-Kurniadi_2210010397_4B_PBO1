package uaspbo1;

//inherriteance
public class KaryawanDetail extends Karyawan {
    //overriding
    public KaryawanDetail(String nama, String nik) {
        super(nama, nik);
    }
    public int getTahunMasuk (){
        return Integer.parseInt(getNik().substring(0, 2)) + 2000;
    }
    public String getDivisi(){
        //seleksi if
        String kodeDiv = getNik().substring(2, 4);
        if (kodeDiv.equals("01")){
            return "Pemasaran";
        }else {
            return "Gudang";
        }
    }
    public String getPosisi (){
        //seleksi dengan switch
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
    public int getRegis(){
        return Integer.parseInt(getNik().substring(6));
    }
    
    //polymorfisme overriding
    @Override
    public String displayInfo(){
        return super.displayInfo()+
                "\nTahun Masuk : "+ getTahunMasuk() +
                "\nDivisi : "+ getDivisi() +
                "\nPosisi : " + getPosisi() +
                "\nNo Registrasi : " +getRegis();                   
    }
}
