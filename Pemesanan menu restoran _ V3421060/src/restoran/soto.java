package restoran;
public class soto extends menu {
    
    
    public int hargaSatuan = 25000 ;
    public soto(){}

    //constructor
     //ARRAY OF OBJECT
    public soto(String nama){
        this.nama = nama;
        
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