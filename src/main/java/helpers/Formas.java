/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

/**
 *
 * @author PC
 */
public class Formas {
    // Atributos para Dibujar "Formas", Metodos "Acciones o Actividades"
    private String dibujar;
    private String metodo;
    
    public Formas(){
        // Constructor sin parametros
    }

// Establecer y obtener
    public void establecerDibujar (String dibujar){
     this.dibujar = dibujar;
    }
    public String obtenerDibujar (){
        return this.dibujar;
    }
        public void establecerMetodo (String metodo){
     this.metodo = metodo;
    }
    public String obtenerMetodo (){
        return this.metodo;
    }
       
    public void imprimirInformacion(){
        System.out.println("Forma: " + dibujar);
        System.out.println("Accion: " + metodo);
        
    }
}
