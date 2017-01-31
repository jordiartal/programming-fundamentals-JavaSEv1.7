/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbdd_reyesMagos;

/**
 *
 * @author albertomendezhernandez
 */
public class BBDDReyes {

    public static GestionBDD interconexion;
    
    public static void main(String[] args) {
        // TODO code application logic here
        new Menu();
        interconexion = new GestionBDD();
    }
    
}
