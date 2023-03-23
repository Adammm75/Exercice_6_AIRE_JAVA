/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicesurcharge;

/**
 *
 * @author adamm
 */
public class Exercicesurcharge {

    public static void main(String[] args) {
     //   polygone.perimetre(4, 34, 3);
        

        System.out.println("L'air du cercle est de : " + Aire.calculerAire(10) );
        
        System.out.println("L'air du rectangle est de : " + Aire.calculerAire(10,34) );
        
        System.out.println("L'air du triangle est de : " + Aire.calculerAire(5,7,23) );
        
        System.out.println("Le nombre de calcul effectué s'élève à : " + Aire.getNombreDeCalculs());
    }
}
