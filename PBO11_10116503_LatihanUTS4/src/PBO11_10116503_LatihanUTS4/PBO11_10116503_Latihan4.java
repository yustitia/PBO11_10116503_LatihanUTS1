/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO11_10116503_LatihanUTS4;

/**
 *
 * @author yustitia arofa
 */
public class PBO11_10116503_Latihan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ModelDesigner me = new ModelDesigner();
        me.bonusDesigner();

        System.out.println("\n");

        ModelProgrammer mp = new ModelProgrammer();
        mp.bonusProgrammer();

        System.out.println("\n");

        ModelSystemAnalyst msa = new ModelSystemAnalyst();
        msa.bonusSystemAnalyst();
    }

}
