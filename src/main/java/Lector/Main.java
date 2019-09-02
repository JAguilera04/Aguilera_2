/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lector;

/**
 *
 * @author usuario
 */
public class Main {
    public static void main(String[] args) {
        String direccion="C:\\Users\\usuario\\Documents\\NetBeansProjects\\lector_Archivo\\texto.txt";
        Texto.LeeFichero(direccion);
        Texto.EscribirFichero(direccion);
    }
    
}
