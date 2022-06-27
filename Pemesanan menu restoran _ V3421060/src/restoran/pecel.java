package restoran;
public class pecel extends menu {
    
    //inisialisasi variabel hargaSatuan
    public int hargaSatuan = 8000;
    
    //constructor
    public pecel(){}

     //ARRAY OF OBJECT
    public pecel(String nama){
        this.nama = nama;
        //this.hargaSatuan= hargaSatuan;
    }
   
    //SETTER
    public void setKode(int kode){
        this.kode = kode;
    }
    
    public void setDiskon(int diskon){
        this.diskon = diskon;
    }
    
    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }
    
    public void setJumlahUang(int jumlahUang){
        menu.jumlahUang = jumlahUang;
    }

    public void setHargaSatuan(int hargaSatuan){
        this.hargaSatuan = hargaSatuan;
    }
    
    
    
    //GETTER
    public String getNama(){
        return nama;
    }
    
    public int getKode(){
        return kode;
    }
   
    public double getDiskon(){
        return diskon;
    }
    
    public int getJumlah(){
        return jumlah;
    }
    
    //method static
    public static int getJumlahUang(){
        return jumlahUang;
    }
    
    public int getHargaSatuan(){
        return hargaSatuan;
    }

   
}
