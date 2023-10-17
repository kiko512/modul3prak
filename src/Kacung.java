
class Kacung {
    //atributes
    private String NIP;
    private String Nama;
    private String Alamat;
    private double JumlahHariLembur;
    private double gaji_pokok;
    private double totalGaji;
    //methods
    public Kacung()
    { //constructor
        System.out.println("Konstruktor pegawai dijalankan...");
    }
    //fungsi-fungsi mutator

    public String getNip() {
        return NIP;
    }

    public void setNip(String NIP) {
        this.NIP = NIP;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String alamat) {
        this.Alamat = alamat;
    }

    public double getJmlh_hari_lembur() {
        return JumlahHariLembur;
    }

    public void setJmlh_hari_lembur(float jmlh_hari_lembur) {
        this.JumlahHariLembur = jmlh_hari_lembur;
    }

    public double getGaji_pokok() {
        return gaji_pokok;
    }

    public void setGaji_pokok(double gaji_pokok) {
        this.gaji_pokok = gaji_pokok;
    }

    //method overloading
    public void setTotalGaji(double Jmlh_hari_lembur, double Gaji_pokok)
    {
        JumlahHariLembur = JumlahHariLembur;
        gaji_pokok = Gaji_pokok;
        totalGaji = gaji_pokok + (gaji_pokok * JumlahHariLembur *0.01);
    }
    public void setTotalGaji(double Gaji_pokok)
    {
        JumlahHariLembur = 12;
        gaji_pokok = Gaji_pokok;
        totalGaji = gaji_pokok + (gaji_pokok * JumlahHariLembur *0.01);
    }
    public void cetakKeLayar()
    {
        System.out.println("NIP : "+getNip());
        System.out.println("Nama : "+getNama());
        System.out.println("Alamat : "+getAlamat());
        System.out.println("Jumlah hari lembur : " +getJmlh_hari_lembur()+" hari");
        System.out.println("Gaji pokok : "+getGaji_pokok());
        System.out.println("Total gaji : "+totalGaji);

        System.out.println("");
    }
}