/*
 Kelompok 2 Pemesanan Menu Restoran
 */

// CLASS DRIVER
package restoran;
import static restoran.menu.getJumlahUang;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            //ARRAY OF OBJECT
            menu menu1 = new soto("soto");
            menu menu2 = new bakso("bakso");
            menu menu3 = new pecel("pecel");
            menu[] listmkn = {menu1,menu2,menu3};

           
            //TAMPILAN INPUT

            System.out.println("");
            System.out.println("=======================================");
            System.out.println("               Pemesanan Restoran          ");
            System.out.println("=======================================");
            System.out.println("1. Soto   25000");
            System.out.println("2. Bakso   15000");
            System.out.println("3. Pecel   8000");
           
            try (Scanner input = new Scanner(System.in)) {

            
            menu ks = new soto();

            System.out.println("Kode Makanan : ");
            int pilih = input.nextInt();

            if(pilih == 1){
               ks = new soto();
            }
            else if(pilih == 2){
                ks = new bakso();
            }
            else if(pilih == 3){
                ks = new pecel();
            }
            
            System.out.println("Jumlah Makanan : ");
            ks.setJumlah(input.nextInt());

            System.out.println("Total : "+ ks.totalBiayaBersih());

            System.out.print("Besar Diskon : ");
            ks.setDiskon((int) input.nextFloat());
            System.out.print("Jumlah Uang : ");
            ks.setJumlahUang(input.nextInt());
            
            if(getJumlahUang() < ks.totalBiayaBersih()){
                System.out.println("Jumlah Uang Anda Kurang, silahkan Input kembali!");
                System.out.println("Jumlah Uang : Rp.");
                ks.setJumlahUang(input.nextInt());
            }

            int kode = pilih-1;
            chef chef1 = new chef (1,"chef1");
            Main transaksi = new Main(1,listmkn[kode],chef1);

            //tampilan output
            System.out.println("");
            System.out.println("=======================================");
            System.out.println("               Pemesanan Restoran          ");
            System.out.println("=======================================");
            System.out.println("Kode Makanan : " + pilih);
            System.out.println("id Transaksi : " + transaksi.id);
            System.out.println("Nama Chef : " + transaksi.Chef.chefName());
            System.out.println("Nama Makanan : " + transaksi.Menu.getNama());
            System.out.println("Harga  : Rp." + ks.getHargaSatuan());
            System.out.println("Jumlah : " + ks.getJumlah());
            System.out.println("Total Biaya : " + ks.totalBiaya());
            System.out.println("Besar Diskon (%) : " + ks.besarDiskon());
            System.out.println("Total Biaya Bersih : Rp." + ks.totalBiayaBersih());
            System.out.println("Jumlah Uang : " + menu.getJumlahUang());
            System.out.println("Uang Kembalian : Rp." + ks.uangKembalian());
            System.out.println("======================================");
            System.out.println("              TERIMA KASIH            ");
            System.out.println("======================================");
        }
      
    }

    //7. Menggunakan 2 Class Object Secara Bersamaan dalam 1 Class Driver
    private int id;
    public menu Menu;
    public chef Chef;
    public  Main (int id, menu Menu, chef Chef) {
        this.id = id;
        this.Menu = Menu;
        this.Chef = Chef;
    }
}
