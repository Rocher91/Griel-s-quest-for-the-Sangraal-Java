/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_entrega2;

/**
 *Clase que nos define las celdas que conformaran el mapa del juego.
 * @author xavi
 */
public class Celda {
    
    private int columna;
    private int fila;
    private ObjetoEnEscena objeto;
    
    public Celda(int fila,int columna){
       
       this.fila=fila;
       this.columna=columna;
   
    }
    
    public Celda(int fila,int columna,ObjetoEnEscena objeto){
        
        this(fila,columna);
        this.objeto=objeto;   
    }
    
    public void eliminaObjeto(){
        
        this.objeto=null;
    }
    
    public String getArchivoImagen(){
        
        if(this.objeto!=null) 
            return this.objeto.getArchivoImagen();
        else 
            return null;
    }
   
    public int getFila(){
        
        return this.fila;
    }
    
     public int getColumna(){
         
        return this.columna;
    }
     
    public boolean puedePasar(Jugador j){ 
        
        return (this.objeto==null || this.objeto.puedePasar(j));
       
    }
    
    public boolean pasa(Jugador j){
        
        if(this.objeto==null) 
            return false;
        else
            return this.objeto.pasa(j,this); 
    } 
}