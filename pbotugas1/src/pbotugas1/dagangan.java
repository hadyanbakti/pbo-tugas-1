/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package pbotugas1;
/**
 *
 * @author MSI GF63
 */
public abstract class dagangan {
    protected String namabarang;
    protected double harga;
    protected int stok;
    
    public dagangan (String namabarang, double harga, int stok){
    this.namabarang = namabarang;
    this.harga = harga;
    this.stok = stok;
        
    }
    
    
    public void status() {
        System.out.println("Nama Barang : " + namabarang);
        System.out.println("Harga : " + harga);
        System.out.println("stok : " + stok);
    }

   public void beli(){
        stok=stok-1;
        System.out.println("sudah dibeli sehingga stok = " + stok);
    }
    
    public void supply(int jumsup){
        stok = stok+jumsup;
        System.out.println("Tambah supply sebanyak = " + jumsup);
        System.out.println("Stok setelah di-supply = " + stok);
    }
    /**
     * @param args the command line arguments
     */
}
