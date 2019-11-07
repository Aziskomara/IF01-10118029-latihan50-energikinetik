/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118029.latihan50.energikinetik;

import java.text.DecimalFormat;

/**
 *
 * @author acer
 */
public class IF0110118029Latihan50Energikinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        energi energi = new energi();
        energi.setMassa(0.145);
        energi.setKecepatan(25);
        energi.setKecepatanAwal(0);
        energi.setKecepatanAkhir(25);
        
        DecimalFormat df = new DecimalFormat("#.#");
        
        System.out.println("=====PROGRAM MENCARI ENERGI KINETIK=====");
        System.out.println("Energi Kinetik : " + df.format(
                           energi.hitungEnergiKinetik
                          (energi.getMassa(),energi.getKecepatan())));
        System.out.println("Usaha yang dilakukan : " + df.format (energi.hitungUsaha
                          (energi.getKecepatanAwal(), 
                           energi.getKecepatanAkhir())));

    }
    
}
