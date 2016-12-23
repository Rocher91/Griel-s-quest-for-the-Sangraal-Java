/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_entrega2;
import obstaculos.*;
import items.*;

/**
 *
 * @author xavi
 */
public class Nivel {
    
    private Celda[][] celdas;
    private int columnas;
    private int filas;
    private Jugador jugador;
    private char[][] mapa;
    
    public Nivel(int filas,int columnas,char [][]mapa){

   	this.filas = filas;
        this.columnas = columnas;
        this.mapa = mapa;
        this.celdas=new Celda[this.filas][this.columnas];
        
        for(int fila=0;fila<this.filas;fila++){
            for(int columna=0;columna<this.columnas;columna++){

                    switch(this.mapa[fila][columna]){
                        
                        case Const.CELDA_PARED: 
                            Celda celda_pared = new Celda(fila,columna,new Pared());
                            this.celdas[fila][columna] = celda_pared;
                        break;

                        case Const.CELDA_POSICION_INICIAL_JUGADOR:
                            this.jugador = new Jugador(new Celda(fila,columna));
                            this.celdas[fila][columna]= new Celda(fila,columna);
                        break;

                        case Const.CELDA_PUERTA:
                            Celda celda_puerta = new Celda(fila,columna,new Puerta());
                            this.celdas[fila][columna] = celda_puerta;
                        break;

                        case Const.CELDA_LLAVE:
                            Celda celda_llave = new Celda(fila,columna,new Llave());
                            this.celdas[fila][columna] = celda_llave;
                        break;

                        case Const.CELDA_SOPLETE:
                            Celda celda_soplete = new Celda(fila,columna,new Soplete());
                            this.celdas[fila][columna] = celda_soplete;
                        break;

                        case Const.CELDA_HIELO:   
                            Celda celda_hielo = new Celda(fila,columna,new Hielo());
                            this.celdas[fila][columna] = celda_hielo;
                        break;

                        case Const.CELDA_FUEGO:
                            Celda celda_fuego = new Celda(fila,columna,new Fuego());
                            this.celdas[fila][columna] = celda_fuego;
                        break;

                        case Const.CELDA_AGUA:   
                            Celda celda_agua = new Celda(fila,columna,new Agua());
                            this.celdas[fila][columna] = celda_agua;
                        break;

                        case Const.CELDA_PICO:
                            
                            Celda celda_pico = new Celda(fila,columna,new Pico());
                            this.celdas[fila][columna] = celda_pico;
                        break;

                        case Const.CELDA_ROCA: 
                            Celda celda_roca = new Celda(fila,columna,new Roca());
                            this.celdas[fila][columna] = celda_roca;
                        break;
                    
                        case Const.CELDA_HURACAN: 
                            Celda celda_huracan = new Celda(fila,columna,new Huracan());
                            this.celdas[fila][columna] = celda_huracan;
                        break;
                        
                        case Const.CELDA_ESPADA: 
                            Celda celda_sword = new Celda(fila,columna,new EspadaFuegoGlaciar());
                            this.celdas[fila][columna] = celda_sword;
                        break;
                        
                        case Const.CELDA_ABANICO: 
                            Celda celda_abanico = new Celda(fila,columna,new AbanicoMagico());
                            this.celdas[fila][columna] = celda_abanico;
                        break;
                        
                         case Const.CELDA_NORMAL:
                             this.celdas[fila][columna]= new Celda(fila,columna);

                    }    
                }
            }
        }
    
    public Jugador getJugador(){
            
        return this.jugador;
    }
    
    public Celda getCelda(int fila,int col){
        
        return this.celdas[fila][col];
    }
        
    public boolean intentaMoverJugador(int fila, int col){
        
        boolean mover=false;
        
        if(this.celdas[fila][col].puedePasar(this.jugador)){
            
            jugador.setCelda(celdas[fila][col]);
            mover=celdas[fila][col].pasa(this.jugador); 
        }
        
        return mover;
    }
    
    public Nivel clonar(){
         return new Nivel(this.filas,this.columnas,this.mapa);
    }

}
