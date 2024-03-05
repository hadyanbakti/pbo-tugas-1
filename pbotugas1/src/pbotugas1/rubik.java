/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbotugas1;

/**
 *
 * @author MSI GF63
 */
class rubik extends dagangan implements merk{
    public void namamerk(){
        System.out.println("Merk : Lionstar");
    }
    public void seri(){
        System.out.println("Seri : 3x3");
    }
    public void idmerk(){
        System.out.println("ID Merk : 16");}
    rubik(String namabarang){
        super(namabarang, 30000, 5);
        status();
        namamerk();
        seri();
        idmerk();
    }
    
    
}
