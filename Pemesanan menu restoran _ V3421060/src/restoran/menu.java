package restoran;

// CLASS Object

//Abstract class & method
public abstract class menu {

    //deklarasi variabel 
    public String nama;
    public double diskon;
    public int  hargaSatuan,jumlah, kode;

    //variabel static
    public static int jumlahUang ;

    //constructor
    public menu(){
      
    }

    //SETTER / muttator
    protected abstract void setKode(int kode);
    protected abstract void setDiskon(int diskon);
    protected abstract void setJumlah(int jumlah);
    protected abstract void setJumlahUang(int jumlahUang);
    
    
    
    //GETTER /assesor
    protected abstract String getNama();
    protected abstract int getKode();  
    protected abstract double getDiskon();
    protected abstract int getJumlah();
    
    //method static
    public static int getJumlahUang(){
        return jumlahUang;
    }

    //deklarasi abstract method
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
