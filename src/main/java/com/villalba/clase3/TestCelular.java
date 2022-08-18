/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.villalba.clase3;

/**
 *
 * @author CDE-LAB3-PC28
 */
public class TestCelular {
    public static void main(String) 
       //creamos un nuevo objeto de tipo celular, con el constructor vacio
       celular cel = new celular (){
        //Asignamos marca, modelo y color
        cel.setMarca("Apple");
        cel.setModelo("Iphone 14 PRO MAX");
        cel.setColor("Negro"); 
        //utilizacion de metodos: llamar, cortarLlamada = informarCaracteristicas
        cel.llamar("Jefe"); 
        cel.cortarLlamada();
        System.out.println(); 
        cel.informarCaracteristicas(); 
    }
           
    
}
