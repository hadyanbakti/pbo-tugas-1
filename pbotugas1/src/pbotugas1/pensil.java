/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbotugas1;

/**
 *
 * @author MSI GF63
 */
public class pensil extends dagangan implements merk {
    public void namamerk(){
        System.out.println("Merk : Fabercastle");
    }
    public void seri(){
        System.out.println("Seri : 2B");
    }
    public void idmerk(){
        System.out.println("ID Merk : 12");}
    pensil(String namabarang){
        super(namabarang, 5000, 20);
        status();
        namamerk();
        seri();
        idmerk();
    }
    
}
