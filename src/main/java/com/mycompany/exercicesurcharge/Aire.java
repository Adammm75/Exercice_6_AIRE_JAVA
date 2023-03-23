/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicesurcharge;

/**
 *
 * @author adamm
 */
public class Aire {
    
    public static int nombreDeCalculs = 0;

    public static int getNombreDeCalculs() {
        return nombreDeCalculs;
    }
    
    
    
    
    
    
    public static double calculerAire(double rayon) {
        nombreDeCalculs++;
        Double aire = Math.PI * (rayon*rayon);
        return aire;
        
    }
    
    public static double calculerAire(double longueur, double largeur) {
        
        nombreDeCalculs++;
        double aire =  longueur * largeur;
        return aire;
        
        
        
    }
    
    public static double calculerAire(double base, double hauteur, double hypoténuse) {
    
        nombreDeCalculs++;
        double aire = (base * hauteur) / 2;
        return aire;
    
    }
    
}
