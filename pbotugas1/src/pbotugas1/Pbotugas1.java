/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbotugas1;

/**
 *
 * @author MSI GF63
 */
public abstract class Pbotugas1 implements merk{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      pensil newpensil = new pensil("Pensil Fabercastle 2B");
      newpensil.beli();
      newpensil.supply(5);
      System.out.println(" ");
      rubik newrubik = new rubik("Rubik Lionstar 3x3");
      newrubik.beli();
      System.out.println(" ");
      mouse newmouse = new mouse("Mouse Fantech FX23");
      newmouse.supply(3);
      
        
       
        // TODO code application logic here
    }
    
}
