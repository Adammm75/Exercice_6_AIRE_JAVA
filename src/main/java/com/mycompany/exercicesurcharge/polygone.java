/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicesurcharge;

/**
 *
 * @author adamm
 */
public class polygone {
    
    public static int perimetre (int a, int b, int c) {
        
        int perimetretriangle = a+b+c;
        return perimetretriangle;
        
    }
    public static int perimetre (int a, int b) {
        
        a=4;
        int perimetrecarre= a*b;
        return perimetrecarre;
        
    }
    public static int perimetre (int a, int b, int c, int d) {
        
        
        int perimetrerect = a+b+c+d;
        return perimetrerect;
        
    }
    
    public static float aire (int h, int b) {
        
        int c=2;
        int airetriangle = b*h/c;
        return airetriangle;
        
    }
    public static float aire (int a) {
        
        
        int airecarre= a*a;
        return airecarre;
        
    }
    public static float aire (int l, int L, int r) {
        r=0;
        int airerect = l * L;
        return airerect;
        
    }

    
}
