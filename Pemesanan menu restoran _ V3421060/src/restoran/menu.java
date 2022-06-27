package restoran;

// CLASS Object

//Abstract class & method
public abstract class menu {


    public String nama;
    public double diskon;
    public int  hargaSatuan,jumlah, kode;

    //variabel static
    public static int jumlahUang ;

    public menu(){
      
    }

    //SETTER
    
    protected abstract void setKode(int kode);
    
    
    protected abstract void setDiskon(int diskon);
    
    protected abstract void setJumlah(int jumlah);
    
    protected abstract void setJumlahUang(int jumlahUang);
    
    
    
    //GETTER
    protected abstract String getNama();
    
    protected abstract int getKode();
   
    protected abstract double getDiskon();
    
    protected abstract int getJumlah();
    
    //method static
    public static int getJumlahUang(){
        return jumlahUang;
    }
    
    protected abstract int getHargaSatuan();

     //PROSES
     public int totalBiaya(){
        return getHargaSatuan() * getJumlah(); 
    }
    
    public double besarDiskon(){
        return (int) ((getDiskon()/100) * totalBiaya());
    }
    
    public int totalBiayaBersih(){
        return (int) (totalBiaya() - besarDiskon());
    }
    
    public int uangKembalian(){
        return getJumlahUang() - totalBiayaBersih();
    }
   
}