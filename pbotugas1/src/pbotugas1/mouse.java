/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbotugas1;

/**
 *
 * @author MSI GF63
 */
public class mouse extends dagangan implements merk{
    public void namamerk(){
        System.out.println("Merk : Fantech");
    }
    public void seri(){
        System.out.println("Seri : FX23");
    }
    public void idmerk(){
        System.out.println("ID Merk : 7");}
    mouse(String namabarang){
        super(namabarang, 500000, 30);
        status();
        namamerk();
        seri();
        idmerk();
    }
    
    
    
}
