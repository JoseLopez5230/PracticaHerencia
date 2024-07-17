/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicaherencia;

import helpers.Circulo;
import helpers.Cuadrado;
import helpers.Linea;
import helpers.Triangulo;

/**
 *
 * @author PC
 */
public class PracticaHerencia {

public static void main(String[] args){
 Circulo circulo = new Circulo();
 Linea linea = new Linea();
 Triangulo triangulo = new Triangulo();
 Cuadrado cuadrado = new Cuadrado();

 System.out.println ("- Formas");
 
 circulo.imprimirInformacion();
 linea.imprimirInformacion();
 triangulo.imprimirInformacion();
 cuadrado.imprimirInformacion();
    
  } 
}
