public class Transaction {
    String namaItem;
    int jumlahItem;
    int hargaItem;

    public Transaction(String namaItem, int jumlahItem, int hargaItem){
        this.namaItem = namaItem;
        this.jumlahItem = jumlahItem;
        this.hargaItem = hargaItem; 
    }
    public void update_item_name(String namaItem, String namaItemBaru){
        if(this.namaItem.equals(namaItem)){
            this.namaItem = namaItemBaru;
        } else{
            System.out.println("Item tidak ditemukan");

        }
    }

    public void update_item_qty(String namaItem, int jumlahItemBaru){
        if(this.namaItem.equals(namaItem)){
            this.jumlahItem = jumlahItemBaru;
        } else{
            System.out.println("Item tidak ditemukan");
        }
    }
    
    public void update_item_price(String namaItem, int hargaItemBaru){
        if(this.namaItem.equals(namaItem)){
            this.hargaItem = hargaItemBaru;
        } else{
            System.out.println("Item tidak ditemukan");
        }
    }

    public void delete_item(String namaItem){
        if(this.namaItem.equals(namaItem)){
            namaItem = null;
            hargaItem = 0;
            jumlahItem = 0;
        } else{
            System.out.println("Item tidak ditemukan");
        }
    }

    public void reset_transaction(){
        namaItem = null;
        hargaItem = 0;
        jumlahItem = 0;
        
    }

    public void cek_order(){
        if (namaItem == null || this.jumlahItem == 0 || this.hargaItem == 0){
            System.out.println("Order Tidak Berhasil");
        }else{
            System.out.println("Order sudah siap");
        }
    }

    public void print_order() {
        System.out.println("------------- Pesanan --------------");
        System.out.println("Nama Item: " + this.namaItem);
        System.out.println("Jumlah Item: " + this.jumlahItem);
        System.out.println("Harga Item: " + this.hargaItem);
    }


    
}